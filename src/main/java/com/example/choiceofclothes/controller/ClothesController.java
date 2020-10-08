package com.example.choiceofclothes.controller;

import com.example.choiceofclothes.dictonary.Temperature;
import com.example.choiceofclothes.dto.ClothesDto;
import com.example.choiceofclothes.service.ClothesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/clothes")
public class ClothesController {

    private final ClothesService clothesService;

    @GetMapping
    public String getClothes(Model model) {
        model.addAttribute("temperature", Temperature.values());
        return "/clothes";
    }

    @PostMapping
    public String saveClothes(Model model, ClothesDto clothesDto) {
        clothesService.save(clothesDto);
        model.addAttribute("temperature", Temperature.values());
        return "/clothes";
    }

}
