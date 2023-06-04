package section09_Spring.topic06_SpringSecurityPart1.theory.T05_ObtainInformationAboutCurrentUser.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String hello(Authentication authentication) {
        //String name = SecurityContextHolder.getContext().getAuthentication().getName();
        //return String.format("Hello, %s!", name);

        //userService.findByLogin(authentication.getName())
        return String.format("Hello, %s!", authentication.getName());
    }
}
