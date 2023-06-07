package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.controller")
public class WebConfig implements WebMvcConfigurer {
}
