package com.zhanbolat.carspring.transmissions;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public interface ITransmission {
    String getDescription();
    TransmissionType getTransmissionType();
    int getGearsCount();
    void gearUp();
    void gearDown();
}
