package section07_JavaWeb.topic04_SecurityInWeb.theory.T06_AuthFilterImplementation.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/*")
public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        // Do not allow visit /index page for unauthenticated users
        // If users is not authenticated - redirect him to the /login page

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();

        Long userId = (Long) session.getAttribute("user_id");

        if (userId == null && req.getServletPath().equals("/login")) {
            filterChain.doFilter(req, resp);
            return;
        }

        if (userId == null) {
            // do not visit any page
            resp.sendRedirect("/login");
            return;
        }

        // after all
        filterChain.doFilter(req, resp);
    }
}
