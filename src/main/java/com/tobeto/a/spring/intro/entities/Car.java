package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

//ORM => Object Relation Mapping
@Table(name="cars")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "daily_price")
    private double dailyPrice;
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "model_year")
    private int modelYear;
    @Column(name = "color")
    private String color;
    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
