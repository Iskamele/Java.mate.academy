package section09_Spring.topic06_SpringSecurityPart1.theory.T03_StartSecurityConfigurationPart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

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
                .anyRequest() // только авторизованные реквесты
                .authenticated() // любой реквест должен быть аутентифицирован
                .and()
                .formLogin() // и доступ к логин-странице могут иметь все пользовали
                .permitAll()
                .and()
                .httpBasic() // и будет включена basic-авторизация
                .and()
                .csrf().disable(); // и выключается csrf (определённые правила security и по умолчанию spring их уже имплементирует. Рекомендация: не отключать его для продакшена)
    }

    @Bean
    public PasswordEncoder getEncoder() {
        // PasswordEncoder нужен для того, чтобы хэшировать пароли
        return new BCryptPasswordEncoder();
    }
}
