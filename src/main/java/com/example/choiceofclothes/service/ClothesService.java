package com.example.choiceofclothes.service;

import com.example.choiceofclothes.dto.ClothesDto;
import org.springframework.stereotype.Service;


@Service
public interface ClothesService {

    ClothesDto find();
}
