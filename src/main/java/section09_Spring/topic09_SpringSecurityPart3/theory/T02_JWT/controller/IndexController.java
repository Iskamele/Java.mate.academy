package section09_Spring.topic09_SpringSecurityPart3.theory.T02_JWT.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String hello(Authentication authentication, HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        return String.format("Hello, %s!", authentication.getName()
                + ". Your session id is: " + sessionId);
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello admin!";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello user!";
    }
}
