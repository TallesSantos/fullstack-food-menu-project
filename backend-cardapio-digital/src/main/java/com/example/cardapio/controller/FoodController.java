package com.example.cardapio.controller;

import com.example.cardapio.controller.exceptions.FoodException;
import com.example.cardapio.entities.Food;
import com.example.cardapio.foodService.FoodRepository;
import com.example.cardapio.foodService.FoodRequestDTO;
import com.example.cardapio.foodService.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity saveFood(@RequestBody FoodRequestDTO data) {
        try {
            Food foodData = new Food(data);
            repository.save(foodData);
            return ResponseEntity.ok().body("Added in the menu!!");

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid insertion.. :(");
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity<List<FoodResponseDTO>> getAll() {
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return ResponseEntity.ok().body(foodList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<FoodResponseDTO> getById(@PathVariable Long id) {
        FoodResponseDTO foodResponse = new FoodResponseDTO(repository.getReferenceById(id));
        return ResponseEntity.ok().body(foodResponse);

    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<FoodResponseDTO> updateById(@PathVariable Long id, @RequestBody Food obj) {
        try {
            Food entity = repository.getReferenceById(id);
            updateData(entity, obj);
            repository.save(entity);
            return ResponseEntity.ok().body(new FoodResponseDTO(entity));
        } catch (Exception e) {
            throw new RuntimeException("Unexpected error!!");
        }
    }
    private void updateData(Food entity, Food obj) {
        entity.setTitle(obj.getTitle());
        entity.setImage(obj.getImage());
        entity.setPrice(obj.getPrice());
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteByID(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok().body("Food Deleted");
    }
}
