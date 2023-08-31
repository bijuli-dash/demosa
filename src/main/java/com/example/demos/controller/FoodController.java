package com.example.demos.controller;

import com.example.demos.entity.Food;
import com.example.demos.functions.FoodUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

public class FoodController {

    @Autowired
    private FoodUpdateService foodUpdateServiceservices;   //service

    @RequestMapping("/Updated")           //saves user data in  database
    public String updateFoodtable(Food food) {
        System.out.print("saved");
        foodUpdateServiceservices.savefoodinfo(food);     //calls service method to save userinfo
        return "Food";
    }

    @GetMapping("/FoodSection")
    public String displayfood(Model model){
        List<Food> foodList = foodUpdateServiceservices.allfood();
        model.addAttribute("foodlist", foodList); // Create a new Person object for the form
        return "redirect:/Food?Successfullyinserted?";
    }

}
