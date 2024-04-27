package com.example.cardapio.foodService;

import com.example.cardapio.entities.Food;

public record FoodResponseDTO(String title, String image, Integer price) {
    public FoodResponseDTO(Food food){
        this(food.getTitle(), food.getImage(), food.getPrice());
    }
}
