package com.example.choiceofclothes.service;

import com.example.choiceofclothes.dto.ClothesDto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ClothesService {

    List<ClothesDto> findAll();
}
