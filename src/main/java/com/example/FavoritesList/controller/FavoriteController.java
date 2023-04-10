package com.example.FavoritesList.controller;

import com.example.FavoritesList.model.FavoriteList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.FavoritesList.sharedModel.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {
    private FavoriteList favoriteList;

    @GetMapping
    public List<Property> getFavoriteProperties(@RequestParam Long userId) {
        //should return favorite properties
        return null;
    }

    @PostMapping
    public void addPropertyToFavorites(@RequestParam Long userId, @RequestBody Property property) {
        //should add favorite properties
    }

    @DeleteMapping("/{propertyId}")
    public void removePropertyFromFavorites(@RequestParam Long userId, @PathVariable Long propertyId) {
        //should delete favorite properties
    }
}
