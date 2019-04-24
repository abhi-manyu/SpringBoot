package org.SpringBoot_security.security_config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class Security_Config extends WebSecurityConfigurerAdapter
{
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
    	auth.inMemoryAuthentication().
    	    passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance()).
    	    withUser("abhi").password("manyu").roles("user").and().
    	    withUser("ara").password("binda").roles("admin","user");
    
    }
    
    protected void configure(HttpSecurity http) throws Exception
    {
    	http.httpBasic().and().authorizeRequests().
    	antMatchers("/userlogin").hasRole("user").
    	antMatchers("/adminlogin").hasRole("admin").
    	and().csrf().disable().headers().frameOptions().disable();
    	
    }
    
}
