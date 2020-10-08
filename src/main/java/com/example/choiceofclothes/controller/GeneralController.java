package com.example.choiceofclothes.controller;

import com.example.choiceofclothes.dto.ClothesDto;
import com.example.choiceofclothes.service.ClothesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class GeneralController {

    private final ClothesService clothesService;

    @GetMapping
    public String getPage() {
        return "/general";
    }

    @PostMapping
    public String getClothesByCity(Model model, @RequestParam("city") String city) {
        List<ClothesDto> allClothesByCity = clothesService.findAllByCity(city);
        model.addAttribute("clothes", allClothesByCity);
        return "/general";
    }
}
