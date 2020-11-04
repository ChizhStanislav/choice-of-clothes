package com.example.choiceofclothes.service;

import com.example.choiceofclothes.dto.ClothesDto;
import com.example.choiceofclothes.entity.Clothes;
import com.example.choiceofclothes.repository.ClothesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class ClothesImplService implements ClothesService {

    private final ClothesRepository clothesRepository;

    @Override
    public List<ClothesDto> findAll() {
        List<Clothes> all = clothesRepository.findAll();
        return all.stream().map(clothes -> ClothesDto.builder()
                .id(clothes.getId())
                .name(clothes.getName())
                .build())
                .collect(toList());
    }
}
