/*
 * package com.spring_security.example.auth;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SpringSecurity extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth)throws
 * Exception { auth.inMemoryAuthentication() .withUser("user")
 * .password("Reset123") .roles("USER") .and() .withUser("admin")
 * .password("abhi@manyu") .roles("ADMIN") .and() .withUser("manager")
 * .password("manager") .roles("MANAGER"); }
 * 
 * @Override protected void configure(HttpSecurity http)throws Exception {
 * http.httpBasic() .and() .authorizeRequests()
 * .antMatchers(HttpMethod.GET,"/products/**").hasAnyRole("ADMIN","MANAGER",
 * "USER")
 * .antMatchers(HttpMethod.GET,"/products/{id}/**").hasAnyRole("USER","MANAGER",
 * "ADMIN")
 * .antMatchers(HttpMethod.POST,"/products/**").hasAnyRole("ADMIN","MANAGER")
 * .antMatchers(HttpMethod.PUT,"/products/{id}/**").hasAnyRole("ADMIN",
 * "MANAGER")
 * .antMatchers(HttpMethod.DELETE,"/products/{id}/**").hasRole("MANAGER") .and()
 * .csrf().disable() .formLogin().disable(); } }
 */