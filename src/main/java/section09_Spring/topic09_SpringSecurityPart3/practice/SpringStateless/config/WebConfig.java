package section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "section09_Spring.topic09_SpringSecurityPart3.practice.SpringStateless")
public class WebConfig implements WebMvcConfigurer {

}
