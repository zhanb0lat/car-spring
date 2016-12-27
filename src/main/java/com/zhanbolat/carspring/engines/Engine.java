package com.zhanbolat.carspring.engines;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public abstract class Engine implements IEngine {
    protected final String MODEL;
    protected final double CAPACITY;
    protected final int POWER;
    protected final FuelType FUEL_TYPE;

    protected Engine(
            final String model,
            final double capacity,
            final int power,
            final FuelType fuelType) {

        this.MODEL = model;
        this.CAPACITY = capacity;
        this.POWER = power;
        this.FUEL_TYPE = fuelType;
    }

    @Override
    public String getModel() {
        return MODEL;
    }
    @Override
    public double getCapacity() {
        return CAPACITY;
    }
    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public FuelType getFuelType() {
        return FUEL_TYPE;
    }

    @Override
    public void startEngine() {
        System.out.println(MODEL + ": engine start");
    }
    @Override
    public void stopEngine() {
        System.out.println(MODEL + ": engine stop");
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
