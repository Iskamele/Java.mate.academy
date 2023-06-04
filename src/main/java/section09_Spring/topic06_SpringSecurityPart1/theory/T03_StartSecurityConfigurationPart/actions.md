# Steps to configure Spring Security
___
1. add required dependencies to `pom.xml`
```
<dependency>
<groupId>org.springframework.security</groupId>
<artifactId>spring-security-core</artifactId>
<version>5.5.0</version>
</dependency>

<dependency>
<groupId>org.springframework.security</groupId>
<artifactId>spring-security-config</artifactId>
<version>5.5.0</version>
</dependency>

<dependency>
<groupId>org.springframework.security</groupId>
<artifactId>spring-security-web</artifactId>
<version>5.5.0</version>
</dependency>
```
2. create new class `SecurityConfig`
3. extend `WebSecurityConfigurerAdapter`
4. add `@EnableWebSecurity` annotation
5. create `WebSecurityInitializer`
6. extends `AbstractSecurityWebApplicationInitializer`