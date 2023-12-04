package com.tobeto.a.spring.intro.Services.dtos.car.responses;

import com.tobeto.a.spring.intro.Services.dtos.brand.responses.GetListBrandResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GetListCarResponse {
    private int id;
    private int modelYear;
    private String modelName;
    private GetListBrandResponse brand;
    //private Brand brand; // entityleri dışarı açma!
    //private String brandName;
    //private int brandId;
}
