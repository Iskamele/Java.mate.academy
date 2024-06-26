package section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationFilter implements Filter {
    private Set<String> allowedUrls = new HashSet<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        allowedUrls.add("/login");
        allowedUrls.add("/registration");
        allowedUrls.add("/help");
        allowedUrls.add("/contacts");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();

        Long userId = (Long) session.getAttribute("user_id");

        if (userId == null && allowedUrls.contains(req.getServletPath())) {
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
