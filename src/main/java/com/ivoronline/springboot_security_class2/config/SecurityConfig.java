package com.ivoronline.springboot_security_class2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    //ADMIN
    auth.inMemoryAuthentication()
      .withUser("myadmin")
      .password("{noop}myadminpassword")
      .roles   ("ADMIN");

    //USER
    auth.inMemoryAuthentication()
      .withUser("myuser")
      .password("{noop}myuserpassword")
      .roles   ("USER");

  }

}


