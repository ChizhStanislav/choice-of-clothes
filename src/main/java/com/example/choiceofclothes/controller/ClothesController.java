package com.example.choiceofclothes.controller;

import com.example.choiceofclothes.dto.ClothesDto;
import com.example.choiceofclothes.service.ClothesService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clothes")
public class ClothesController {

    private final ClothesService clothesService;

    @GetMapping
    public ClothesDto getClothes() {
        return clothesService.find();
    }

}
