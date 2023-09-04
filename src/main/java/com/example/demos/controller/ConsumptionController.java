package com.example.demos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.demos.Repository.foodrepository;
import com.example.demos.Repository.userrepository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ConsumptionController {

    @Autowired
    private foodrepository foodrep;
    @Autowired
    private userrepository userrep;

    @RequestMapping("/DailyConsumption")
    public String DCpage(){
        return "user/DailyConsumptionRecord";
    }

    @

}
