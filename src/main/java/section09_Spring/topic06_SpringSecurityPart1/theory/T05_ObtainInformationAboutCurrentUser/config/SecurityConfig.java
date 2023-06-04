package section09_Spring.topic06_SpringSecurityPart1.theory.T05_ObtainInformationAboutCurrentUser.config;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import section09_Spring.topic06_SpringSecurityPart1.theory.T04_Filters.security.MateAcademyFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(inMemoryUserDetailsManager());
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .addFilterAfter(new MateAcademyFilter(), BasicAuthenticationFilter.class)
                .formLogin()
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        Properties users = new Properties();
        users.put("bob@i.ua", getEncoder().encode("1234") + ",ROLE_USER,enabled");
        users.put("alice@i.ua", getEncoder().encode("1234") + ",ROLE_USER,enabled");
        return new InMemoryUserDetailsManager(users);
    }

    @Bean
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }
}
