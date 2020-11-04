package com.example.choiceofclothes.repository;

import com.example.choiceofclothes.entity.Clothes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothesRepository extends CrudRepository<Clothes,Long> {

    List<Clothes> findAll();
}
