package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice")
public class WebConfig implements WebMvcConfigurer {
}
