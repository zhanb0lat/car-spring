package com.zhanbolat.carspring.cars;

import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.transmissions.ITransmission;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public abstract class Car implements ICar {
    protected String model;
    protected IEngine engine;
    protected ITransmission transmission;
    protected DriveType driveType;
    protected boolean isRide = false;

    protected Car(
            String model,
            IEngine engine,
            ITransmission transmission,
            DriveType driveType){
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.driveType = driveType;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    @Override
    public void setTranmission(ITransmission tranmission) {
        this.transmission = tranmission;
    }

    @Override
    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public IEngine getEngine() {
        return engine;
    }

    @Override
    public ITransmission getTransmission() {
        return transmission;
    }

    @Override
    public DriveType getDriveType() {
        return driveType;
    }

    @Override
    public void startRide() {
        if (engine == null || transmission == null) {
            System.err.println("Warning! " + model + ": No engine and/or transmission");
        } else if (!isRide) {
            isRide = true;
            System.out.println(model + ": starting ride...");
            engine.startEngine();
            transmission.gearUp();
        }
    }

    @Override
    public void stopRide() {
        if (isRide && engine != null && transmission != null) {
            isRide = false;
            System.out.println(model + ": stopping ride...");
            transmission.gearDown();
            engine.stopEngine();
        }
    }
}
