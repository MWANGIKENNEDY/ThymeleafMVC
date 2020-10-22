package com.saf.portal.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping(value = "/index")
    public String homePage(){
        return "index";
    }
}
