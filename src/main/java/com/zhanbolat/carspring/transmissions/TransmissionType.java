package com.zhanbolat.carspring.transmissions;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public enum TransmissionType {
    Manual("Механика"),
    Automatic("Автомат"),
    Tiptronic("Типтроник"),
    Variable("Вариатор"),
    Robot("Робот");

    private String name;

    TransmissionType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}