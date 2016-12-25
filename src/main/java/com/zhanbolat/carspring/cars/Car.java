package com.zhanbolat.carspring.cars;

import com.zhanbolat.carspring.cars.DriveType;
import com.zhanbolat.carspring.cars.ICar;
import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.transmissions.ITransmission;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public abstract class Car implements ICar {
    protected final String MODEL;
    protected final IEngine ENGINE;
    protected final ITransmission TRANSMISSION;
    protected final DriveType DRIVE_TYPE;
    protected boolean isRide = false;

    protected Car() {
        this.MODEL = "undefined car";
        this.ENGINE = null;
        this.TRANSMISSION = null;
        this.DRIVE_TYPE = null;
    }
    protected Car(
            final String model,
            final IEngine engine,
            final ITransmission transmission,
            final DriveType driveType){
        this.MODEL = model;
        this.ENGINE = engine;
        this.TRANSMISSION = transmission;
        this.DRIVE_TYPE = driveType;
    }

    @Override
    public String getModel() {
        return this.MODEL;
    }

    @Override
    public IEngine getEngine() {
        return this.ENGINE;
    }

    @Override
    public ITransmission getTransmission() {
        return this.TRANSMISSION;
    }

    @Override
    public DriveType getDriveType() {
        return this.DRIVE_TYPE;
    }

    @Override
    public void startRide() {
        if (this.ENGINE == null || this.TRANSMISSION == null) {
            System.err.println("Warning! " + this.MODEL + ": No engine and/or transmission");
        } else if (!isRide) {
            this.isRide = true;
            System.out.println(this.MODEL + ": starting ride...");
            this.ENGINE.startEngine();
            this.TRANSMISSION.gearUp();
        }
    }

    @Override
    public void stopRide() {
        if (isRide) {
            this.isRide = false;
            System.out.println(this.MODEL + ": stopping ride...");
            this.TRANSMISSION.gearDown();
            this.ENGINE.stopEngine();
        }
    }
}
