/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saf.portal.services;

import com.saf.portal.models.Users;
import com.saf.portal.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author user
 */
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(Users users) {
        userRepository.save(users); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();//To change body of generated methods, choose Tools | Templates.
    }
    
}
