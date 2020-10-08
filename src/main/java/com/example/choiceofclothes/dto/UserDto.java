package com.example.choiceofclothes.dto;

import lombok.*;

@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private String role;
}
