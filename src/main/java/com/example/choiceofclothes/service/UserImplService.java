package com.example.choiceofclothes.service;

import com.example.choiceofclothes.exception.NotFoundException;
import com.example.choiceofclothes.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserImplService implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s){
        return userRepository.findByUsername(s)
                .map(user -> org.springframework.security.core.userdetails.User.builder()
                        .username(user.getUsername())
                        .password(user.getPassword())
                        .roles(user.getRole().name())
                        .build()).orElseThrow(() -> new NotFoundException("User with name " + s + " not found"));
    }
}
