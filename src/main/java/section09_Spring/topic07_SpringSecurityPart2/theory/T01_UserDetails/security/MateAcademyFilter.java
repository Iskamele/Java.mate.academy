package section09_Spring.topic07_SpringSecurityPart2.theory.T01_UserDetails.security;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.web.filter.GenericFilterBean;

public class MateAcademyFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("Hello mates! Request received!");
        chain.doFilter(request, response);
    }
}