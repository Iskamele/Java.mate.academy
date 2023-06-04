package section09_Spring.topic06_SpringSecurityPart1.theory.T04_Filters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import section09_Spring.topic06_SpringSecurityPart1.theory.T04_Filters.security.MateAcademyFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("bob")
                .password(getEncoder().encode("1234"))
                .roles("USER");
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .addFilterAfter(new MateAcademyFilter(), BasicAuthenticationFilter.class) // TODO вызываем наш фильтр, и после которого мы хотим, чтобы выполнялся наш фильтр: после того, как выполнится BasicAuthenticationFilter
                // Не принципиально, после какого или перед каким фильтром добавлять кастомный фильтр. Но если бы у нас было требование, чтобы наш фильтр выполнялся после работы BasicAuthenticationFilter, в таком случае нам нужно понимать, что есть определённая последовательность выполнения фильтров в Spring
                // Для этого надо смотреть filter ordering в docs.spring
                .formLogin()
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }

    @Bean
    public PasswordEncoder getEncoder() {
        // PasswordEncoder нужен для того, чтобы хэшировать пароли
        return new BCryptPasswordEncoder();
    }
}
