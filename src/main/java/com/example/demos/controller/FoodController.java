package com.example.demos.controller;

import com.example.demos.Repository.foodrepository;
import com.example.demos.entity.Food;
import com.example.demos.functions.FoodUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;


@Controller
public class FoodController {

    @Autowired
    private FoodUpdateService foodUpdateServiceservices;   //service

    @Autowired
    private foodrepository frepo;

    @RequestMapping ("/foodsection")
    public String foodsectionpage(Model model)  /*method handler*/ {
        model.addAttribute("allFood",frepo.findAll());
        return "Food";
    }

    @RequestMapping("/update")           //saves user data in  database
    public String updateFoodtable(Food food) {
        System.out.print("saved");
        foodUpdateServiceservices.savefoodinfo(food);     //calls service method to save userinfo
        System.out.print(food.toString());
        return "redirect:/Food";
    }

//    @PostMapping("/updated")
//    public String displayfood(Model model){
//        List<Food> foodList = foodUpdateServiceservices.allfood();
//        model.addAttribute("foodlist",foodlist);
//
//        return "redirect:/Food?Successfullyinserted?";
//    }

    @PostMapping("/updated")
    public String displayfood(@ModelAttribute Model model, Food foodlist , Principal principal){
//        List<Food> foodlist = foodUpdateServiceservices.allfood();
//        System.out.print(foodlist.getName());
//        System.out.print(foodlist.getKcal());
//        System.out.print(foodlist.getProtein());
//        System.out.print(foodlist.getCarb());
//        System.out.print(foodlist.getSugar());                //it just prints the input in console
//        System.out.print(foodlist.getFat());
//        System.out.print(foodlist.getFibre());
//        System.out.print(foodlist.getPrice());
//
//        model.addAttribute("name", foodlist.getName());
//        model.addAttribute("kcal", foodlist.getKcal());
//        model.addAttribute("protein", foodlist.getProtein());
//        model.addAttribute("carb", foodlist.getCarb());
//        model.addAttribute("sugar", foodlist.getSugar());
//        model.addAttribute("fat", foodlist.getFat());
//        model.addAttribute("fibre", foodlist.getFibre());
//        model.addAttribute("price", foodlist.getPrice());
            model.addAttribute("allFood",frepo.findAll());
        return "redirect:/Food";
    }

}




