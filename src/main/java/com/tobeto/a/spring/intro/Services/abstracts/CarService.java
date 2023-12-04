package com.tobeto.a.spring.intro.Services.abstracts;

import com.tobeto.a.spring.intro.Services.dtos.car.responses.GetListCarResponse;

import java.util.List;

public interface CarService {
    List<GetListCarResponse> getAll();
}
