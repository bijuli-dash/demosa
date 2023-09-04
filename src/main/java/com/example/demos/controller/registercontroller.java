package com.example.demos.controller;

import com.example.demos.Repository.userrepository;
import com.example.demos.entity.User;

import com.example.demos.functions.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class registercontroller {

    @Autowired
    private userrepository userepository;

    @Autowired
    private Services userservices;   //service

    @RequestMapping("/reg")
    public String registerationForm()  /*method handler*/ {
        return "register";
    }

    @RequestMapping("/registration")           //saves user data in  database
    public String registerUser(User user) {
        System.out.print("saved");
         userservices.saveuserinfo(user);     //calls service method to save userinfo
        return "redirect:/Homepage";
    }

//    @GetMapping("/Homepage")
//    public String bmi(User user)
//    return userservices.bmicalculation(User id);
//    }

}





