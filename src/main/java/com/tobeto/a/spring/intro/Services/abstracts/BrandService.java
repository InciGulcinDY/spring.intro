package com.tobeto.a.spring.intro.Services.abstracts;

import com.tobeto.a.spring.intro.Services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.intro.Services.dtos.brand.responses.GetListBrandResponse;
import com.tobeto.a.spring.intro.entities.Brand;

import java.util.List;

public interface BrandService {
    void add(AddBrandRequest request);
    List<Brand> getByName(String name);
    List<GetListBrandResponse> getByNameDto(String name);
}
