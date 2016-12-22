package com.zhanbolat.carspring.engines;

import java.lang.ref.SoftReference;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public enum FuelType {
    Petrol("Бензин"),
    Diesel("Дизель"),
    LPG("Автогаз"),
    Hybrid("Гибрид"),
    Electric("Электро");

    private String name;

    FuelType(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
