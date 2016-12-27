package com.zhanbolat.carspring.cars;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public enum DriveType {
    FrontWheel("Передний привод"),
    RearWheel("Задний привод"),
    AllWheel("Полный привод");

    private String name;

    DriveType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
