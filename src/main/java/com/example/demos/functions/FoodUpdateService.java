package com.example.demos.functions;

import com.example.demos.Repository.foodrepository;
import com.example.demos.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodUpdateService implements FoodUpdateServiceimpl {

    @Autowired
    private foodrepository updfood; //repository

    @Override
    public void savefoodinfo(Food food){    //method to save foodinput
        updfood.save(food);
    }

    @Override
    public List<Food> allfood(){            //GETS ALL THE USER INPUT
        return updfood.findAll();
    }  // not in use currently

}
