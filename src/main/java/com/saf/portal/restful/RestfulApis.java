/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saf.portal.restful;

import com.saf.portal.models.Users;
import com.saf.portal.services.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping(value ="/api/v1/")
public class RestfulApis {
    
    @Autowired
    UserService userService;
    //Create a new user
    @PostMapping(value = "/register")
    public ResponseEntity<Object> registerUser(@RequestBody Users users){
        userService.registerUser(users);
        return new ResponseEntity<>("User registered",HttpStatus.CREATED);
    }
    
    @GetMapping(value = "/users")
    //Get a list of all users
    public ResponseEntity<Object> getAllUsers(){
        List<Users> users=new ArrayList<>();
        System.out.println(users.size());
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
}
