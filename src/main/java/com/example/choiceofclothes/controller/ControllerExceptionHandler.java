package com.example.choiceofclothes.controller;

import com.example.choiceofclothes.exception.NotConnectionException;
import com.example.choiceofclothes.exception.NotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public String notFoundExceptionHandler(Model model, NotFoundException notFoundException) {
        model.addAttribute("error", notFoundException.getMessage());
        return "/error";
    }

    @ExceptionHandler(NotConnectionException.class)
    public String notConnectionExceptionHandler(Model model, NotConnectionException notConnectionException) {
        model.addAttribute("error", notConnectionException.getMessage());
        return "/error";
    }
}
