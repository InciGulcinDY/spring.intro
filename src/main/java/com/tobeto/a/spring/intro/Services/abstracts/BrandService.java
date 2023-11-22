package com.tobeto.a.spring.intro.Services.abstracts;

import com.tobeto.a.spring.intro.Services.dtos.brand.requests.AddBrandRequest;

public interface BrandService {
    void add(AddBrandRequest request);
}
