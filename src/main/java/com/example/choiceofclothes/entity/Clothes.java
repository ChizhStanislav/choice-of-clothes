package com.example.choiceofclothes.entity;

import com.example.choiceofclothes.dictonary.Temperature;
import lombok.*;

@Builder
@Setter
@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Clothes {


    private String name;
    private Temperature temperature;

}
