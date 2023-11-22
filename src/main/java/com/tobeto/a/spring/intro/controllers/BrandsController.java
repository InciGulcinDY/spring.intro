package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.Services.abstracts.BrandService;
import com.tobeto.a.spring.intro.Services.dtos.brand.requests.AddBrandRequest;

import org.springframework.web.bind.annotation.*;

import java.util.List;
//Single Responsibility
@RestController
@RequestMapping("api/brands")
public class BrandsController {
    //Dependency Injection
    private BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public void add(@RequestBody AddBrandRequest addBrandRequest){

    }

}
