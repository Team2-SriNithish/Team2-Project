package com.team2.surplusfood.controller;


import com.team2.surplusfood.model.Food;
import com.team2.surplusfood.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> getAllFood() {
        return foodService.getAllFood();
    }

    @PostMapping
    public Food saveFood(@RequestBody Food food) {
        return foodService.saveFood(food);
    }

    // Additional CRUD endpoints if needed
}

