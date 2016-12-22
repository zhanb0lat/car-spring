package com.zhanbolat.carspring.engines;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public interface IEngine {
    String getModel();
    double getCapacity();
    int getPower();
    FuelType getFuelType();
    void startEngine();
    void stopEngine();
}
