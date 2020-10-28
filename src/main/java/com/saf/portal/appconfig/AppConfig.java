/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saf.portal.appconfig;

import com.saf.portal.services.UserService;
import com.saf.portal.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author user
 */
@Configuration
public class AppConfig {
    
    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
    
}
