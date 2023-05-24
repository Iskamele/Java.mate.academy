package section09_Spring.topic03_SpringWeb.theory.T01_ConfigureSpringWEB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
