package com.zhanbolat.carspring.transmissions;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public interface ITransmission {
    String getModel();
    TransmissionType getTransmissionType();
    int getGearsCount();
    void gearUp();
    void gearDown();
}
