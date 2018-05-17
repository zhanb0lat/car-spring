package com.zhanbolat.carspring.engines.impl;

import com.zhanbolat.carspring.engines.FuelType;
import com.zhanbolat.carspring.engines.IEngine;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public class Engine implements IEngine {
    private String model;
    private final double capacity;
    private final int power;
    private final FuelType fuelType;

    protected Engine(
            final String model,
            final double capacity,
            final int power,
            final FuelType fuelType) {

        this.model = model;
        this.capacity = capacity;
        this.power = power;
        this.fuelType = fuelType;
    }

    @Override
    public String getModel() {
        return model;
    }
    @Override
    public double getCapacity() {
        return capacity;
    }
    @Override
    public int getPower() {
        return power;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println(model + ": engine start");
    }
    @Override
    public void stopEngine() {
        System.out.println(model + ": engine stop");
    }

    @Override
    public String toString() {
        return "[Двигатель] \n" +
                "Модель: " + getModel() + "\n" +
                "Объем: " + getCapacity() + "\n" +
                "Мощность: " + getPower() + " л.с. \n" +
                "Тип топлива: " + getFuelType().getName() + "\n";
    }
}
