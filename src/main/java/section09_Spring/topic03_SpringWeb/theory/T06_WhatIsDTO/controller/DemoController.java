package section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import section09_Spring.topic03_SpringWeb.theory.T06_WhatIsDTO.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("message", "Hello Spring!");
        return "index";
    }

    @ResponseBody
    @GetMapping("/time")
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }

    @ResponseBody
    @GetMapping("/phone")
    public Product getProduct(){
        return new Product(1L, "iPhone 7", BigDecimal.valueOf(588));
    }
}
