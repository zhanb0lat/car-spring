package com.zhanbolat.carspring.cars;

import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.transmissions.ITransmission;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public interface ICar {
    String getModel();
    IEngine getEngine();
    ITransmission getTransmission();
    DriveType getDriveType();
    void startRide();
    void stopRide();
}
