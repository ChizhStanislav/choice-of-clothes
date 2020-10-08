package com.example.choiceofclothes.service;

import com.example.choiceofclothes.dto.ClothesDto;
import com.example.choiceofclothes.entity.Clothes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClothesService {

    Clothes save(ClothesDto clothesDto);

    List<ClothesDto> findAllByCity(String city);
}
