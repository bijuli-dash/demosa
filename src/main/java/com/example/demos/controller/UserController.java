package com.example.demos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/home")
    public String Home(){
        return "/user/Homepage";
    }

    @RequestMapping("/food")
    public String Food(){
        return "user/Food";
    }

    @RequestMapping("/consumption")
    public String Consumption(){
        return "user/DailyConsumptionRecord";
    }



}
