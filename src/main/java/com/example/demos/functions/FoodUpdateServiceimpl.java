package com.example.demos.functions;

import com.example.demos.entity.Food;

import java.util.List;

public interface FoodUpdateServiceimpl {
    List<Food> allfood();

    void savefoodinfo(Food food);
}
