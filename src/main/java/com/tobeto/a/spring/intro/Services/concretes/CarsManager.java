package com.tobeto.a.spring.intro.Services.concretes;

import com.tobeto.a.spring.intro.Services.abstracts.CarService;
import com.tobeto.a.spring.intro.Services.dtos.car.responses.GetListCarResponse;
import com.tobeto.a.spring.intro.repositories.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CarsManager implements CarService {
    private final CarRepository carRepository;

    @Override
    public List<GetListCarResponse> getAll() {
        return carRepository.getAll();
    }
}
