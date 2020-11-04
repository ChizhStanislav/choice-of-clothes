package com.example.choiceofclothes.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Setter
@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public", name = "clothes")
public class Clothes {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY )
    private Long id;

    @Column
    private String name;

}
