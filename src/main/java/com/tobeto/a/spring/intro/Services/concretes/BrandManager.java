package com.tobeto.a.spring.intro.Services.concretes;

import com.tobeto.a.spring.intro.Services.abstracts.BrandService;
import com.tobeto.a.spring.intro.Services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.intro.Services.dtos.brand.responses.GetListBrandResponse;
import com.tobeto.a.spring.intro.entities.Brand;
import com.tobeto.a.spring.intro.repositories.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void add(AddBrandRequest request) {
        if (request.getName().length() < 3) {
            throw new RuntimeException();
        }

        Brand brand = new Brand();
        brand.setName(request.getName());
        brandRepository.save(brand);
    }

    @Override
    public List<Brand> getByName(String name) {
        return brandRepository.findByNameStartingWith(name);
    }

    @Override
    public List<GetListBrandResponse> getByNameDto(String name) {
        //TODO: Yaklaşım 1: Repositoryden List<Brand>'i alıp Service katmanında Mapleyerek DTO türüne çevirmek.
        /*
        List<Brand> brands = brandRepository.findByNameStartingWith(name);
        List<GetListBrandResponse> dtos = new ArrayList<>();
        for (Brand brand: brands) {
            dtos.add(new GetListBrandResponse(brand.getName()));
        }
        return dtos
        */

        //TODO: Yaklaşım 2: Repositoryde List<GetListBrandResponse> dönebilen yeni bir method oluşturmak.
        return brandRepository.findByName(name);
    }
}
// Custom Queryler yazmak -!-
// Stream API
