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
        return this.model;
    }

    @Override
    public IEngine getEngine() {
        return this.engine;
    }

    @Override
    public ITransmission getTransmission() {
        return this.transmission;
    }

    @Override
    public DriveType getDriveType() {
        return this.driveType;
    }

    @Override
    public void startRide() {
        if (this.engine == null || this.transmission == null) {
            System.err.println("Warning! " + this.model + ": No engine and/or transmission");
        } else if (!isRide) {
            this.isRide = true;
            System.out.println(this.model + ": starting ride...");
            this.engine.startEngine();
            this.transmission.gearUp();
        }
    }

    @Override
    public void stopRide() {
        if (isRide) {
            this.isRide = false;
            System.out.println(this.model + ": stopping ride...");
            this.transmission.gearDown();
            this.engine.stopEngine();
        }
    }
}
