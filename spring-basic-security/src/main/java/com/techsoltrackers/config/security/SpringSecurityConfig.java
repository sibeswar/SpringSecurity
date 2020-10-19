package com.techsoltrackers.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("guest").password("Pwd1").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("Sibeswar").password("Pwd2").roles("USER");
    }

    //Security for all url
    /*
     @Override protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
     }*/

    //Security for matching url
    /*
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/rest/api/**").fullyAuthenticated().and().httpBasic();
    }*/

    // security based on ROLE
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/rest/api/getResponse").hasAnyRole("ADMIN")
                .antMatchers("/rest/api/getUser").hasRole("USER")
                .antMatchers("/", "/rest/noAuth/**s").permitAll()
                .anyRequest().fullyAuthenticated().and()
                .httpBasic();
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
