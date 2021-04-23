package com.ivoronline.springboot_security_class2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  //======================================================================
  // CONFIGURE (Auth...)
  //======================================================================
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    //CREATE USERS
    auth.inMemoryAuthentication().withUser("myadmin").password("{noop}myadminpassword").roles("ADMIN");
    auth.inMemoryAuthentication().withUser("myuser" ).password("{noop}myuserpassword" ).roles("USER" );

  }

}


