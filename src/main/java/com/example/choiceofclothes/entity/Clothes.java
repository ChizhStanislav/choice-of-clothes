package com.example.choiceofclothes.entity;

import com.example.choiceofclothes.dictonary.Temperature;
import lombok.*;

import javax.persistence.*;

@Builder
@Setter
@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clothes", schema = "public")
public class Clothes extends BaseEntity<Long> {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Temperature temperature;

}
