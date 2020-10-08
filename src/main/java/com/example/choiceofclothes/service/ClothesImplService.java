package com.example.choiceofclothes.service;

import com.example.choiceofclothes.dictonary.Temperature;
import com.example.choiceofclothes.dto.ClothesDto;
import com.example.choiceofclothes.entity.Clothes;
import com.example.choiceofclothes.exception.NotFoundException;
import com.example.choiceofclothes.repository.ClothesRepository;
import com.example.choiceofclothes.util.RequestTemperature;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ClothesImplService implements ClothesService {

    private final ClothesRepository clothesRepository;
    private final RequestTemperature requestTemperature;

    @Override
    @Transactional
    public Clothes save(ClothesDto clothesDto) {
        return clothesRepository.save(Clothes.builder()
                .name(clothesDto.getName())
                .temperature(Temperature.valueOf(clothesDto.getTemperatureName()))
                .build());
    }

    @Override
    public List<ClothesDto> findAllByCity(String city) {

        Integer currentTemperature = requestTemperature.getTemperature(city);

        Optional<Temperature> first = Arrays.stream(Temperature.values())
                .filter(temperature -> temperature.getMinimumTemperature() <= currentTemperature && temperature.getMaximumTemperature() >= currentTemperature)
                .findFirst();

        return clothesRepository.findAllByTemperature(first.get()).stream()
                .map(clothes -> ClothesDto.builder()
                        .id(clothes.getId())
                        .name(clothes.getName())
                        .build())
                .collect(Collectors.toList());
    }
}
