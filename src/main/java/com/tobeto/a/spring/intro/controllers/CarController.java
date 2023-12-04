package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.Services.abstracts.CarService;
import com.tobeto.a.spring.intro.Services.dtos.car.responses.GetListCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cars")
@AllArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping
    public List<GetListCarResponse> getAll(){
        return carService.getAll();
    }
}
