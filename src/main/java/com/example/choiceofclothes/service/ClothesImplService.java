package com.example.choiceofclothes.service;

import com.example.choiceofclothes.dictonary.Temperature;
import com.example.choiceofclothes.dto.ClothesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClothesImplService implements ClothesService {

    @Override
    public ClothesDto find() {
        return ClothesDto.builder()
                .id(1L)
                .name("short")
                .temperatureName(Temperature.HOT.name())
                .build();
    }
}
