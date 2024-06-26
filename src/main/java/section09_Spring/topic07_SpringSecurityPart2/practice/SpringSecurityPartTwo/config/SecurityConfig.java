package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Role;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String ROLE_ADMIN = Role.RoleName.ADMIN.name();
    private static final String ROLE_USER = Role.RoleName.USER.name();
    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    public SecurityConfig(UserDetailsService userDetailsService,
                          PasswordEncoder passwordEncoder) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/register")
                .permitAll()
                .antMatchers(HttpMethod.GET, "/cinema-halls")
                .hasAnyAuthority(ROLE_USER, ROLE_ADMIN)
                .antMatchers(HttpMethod.POST, "/cinema-halls")
                .hasAuthority(ROLE_ADMIN)
                .antMatchers(HttpMethod.GET, "/movies")
                .hasAnyAuthority(ROLE_USER, ROLE_ADMIN)
                .antMatchers(HttpMethod.POST, "/movies")
                .hasAuthority(ROLE_ADMIN)
                .antMatchers(HttpMethod.GET, "/movie-sessions/available")
                .hasAnyAuthority(ROLE_USER, ROLE_ADMIN)
                .antMatchers(HttpMethod.POST, "/movie-sessions")
                .hasAuthority(ROLE_ADMIN)
                .antMatchers(HttpMethod.PUT, "/movie-sessions/{id}")
                .hasAuthority(ROLE_ADMIN)
                .antMatchers(HttpMethod.DELETE, "/movie-sessions/{id}")
                .hasAuthority(ROLE_ADMIN)
                .antMatchers(HttpMethod.GET, "/orders")
                .hasAuthority(ROLE_USER)
                .antMatchers(HttpMethod.POST, "/orders/complete")
                .hasAuthority(ROLE_USER)
                .antMatchers(HttpMethod.PUT, "/shopping-carts/movie-sessions")
                .hasAuthority(ROLE_USER)
                .antMatchers(HttpMethod.GET, "/shopping-carts/by-user")
                .hasAuthority(ROLE_USER)
                .antMatchers(HttpMethod.GET, "/users/by-email")
                .hasAuthority(ROLE_ADMIN)
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }
}
