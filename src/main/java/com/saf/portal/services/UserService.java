/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saf.portal.services;

import com.saf.portal.models.Users;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    public void registerUser(Users users);
    public List<Users> getAllUsers();
}
