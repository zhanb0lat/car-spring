package com.zhanbolat.carspring.cars;

import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.transmissions.ITransmission;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public interface ICar {
    String getModel();
    void setModel(String model);
    IEngine getEngine();
    void setEngine(IEngine engine);
    ITransmission getTransmission();
    void setTranmission(ITransmission tranmission);
    DriveType getDriveType();
    void setDriveType(DriveType driveType);
    void startRide();
    void stopRide();
}
