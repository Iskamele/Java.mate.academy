package section07_JavaWeb.topic04_SecurityInWeb.theory.T11_FilterLifeCycle.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("logging filter was called");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
