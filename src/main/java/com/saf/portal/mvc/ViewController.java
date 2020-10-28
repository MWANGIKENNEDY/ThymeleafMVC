package com.saf.portal.mvc;

import com.saf.portal.models.Users;
import com.saf.portal.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/v1/")
public class ViewController {
    
    @Autowired
    UserService userService;
    
    
    @GetMapping(value = "/index")
    public String homePage(Model model){
        List<Users> users=userService.getAllUsers();
        if(users.isEmpty()){
            model.addAttribute("users",0); 
            return "index";
        }
        model.addAttribute("users",users);
        return "index";
    }
}
