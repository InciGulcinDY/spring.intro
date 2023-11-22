package com.tobeto.a.spring.intro.Services.concretes;

import com.tobeto.a.spring.intro.Services.abstracts.BrandService;
import com.tobeto.a.spring.intro.Services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.intro.entities.Brand;
import com.tobeto.a.spring.intro.repositories.BrandRepository;
import org.springframework.stereotype.Service;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void add(AddBrandRequest request) {
        if(request.getName().length()<3){
            throw new RuntimeException();
        }

        Brand brand = new Brand();
        brand.setName(request.getName());
        brandRepository.save(brand);
    }
}
