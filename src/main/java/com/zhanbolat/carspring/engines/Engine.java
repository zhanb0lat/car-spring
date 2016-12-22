package com.zhanbolat.carspring.engines;

import com.zhanbolat.carspring.engines.IEngine;

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
        return this.MODEL;
    }
    @Override
    public double getCapacity() {
        return this.CAPACITY;
    }
    @Override
    public int getPower() {
        return this.POWER;
    }

    @Override
    public FuelType getFuelType() {
        return this.FUEL_TYPE;
    }

    @Override
    public void startEngine() {
        System.out.println(this.MODEL + ": engine start");
    }
    @Override
    public void stopEngine() {
        System.out.println(this.MODEL + ": engine stop");
    }
}
