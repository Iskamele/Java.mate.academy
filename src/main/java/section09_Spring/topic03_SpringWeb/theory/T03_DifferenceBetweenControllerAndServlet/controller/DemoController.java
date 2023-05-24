package section09_Spring.topic03_SpringWeb.theory.T03_DifferenceBetweenControllerAndServlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("message", "Hello Spring!");
        return "index";
    }

    // TODO
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
