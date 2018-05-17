package com.zhanbolat.carspring.transmissions.impl;

import com.zhanbolat.carspring.transmissions.ITransmission;
import com.zhanbolat.carspring.transmissions.TransmissionType;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public class Transmission implements ITransmission {
    private final String MODEL;
    private final TransmissionType TRANSMISSION_TYPE;
    private final int GEARS_COUNT;

    protected Transmission(
            final String description,
            final TransmissionType transmissionType,
            final int gears_count) {

        this.MODEL = description;
        this.TRANSMISSION_TYPE = transmissionType;
        this.GEARS_COUNT = gears_count;
    }


    @Override
    public String getModel() {
        return MODEL;
    }
    @Override
    public TransmissionType getTransmissionType() {
        return TRANSMISSION_TYPE;
    }
    @Override
    public int getGearsCount() {
        return GEARS_COUNT;
    }

    @Override
    public void gearUp() {
        System.out.println(MODEL + ": gear up (+)");
    }
    @Override
    public void gearDown() {
        System.out.println(MODEL + ": gear down (-)");
    }

    @Override
    public String toString() {
        return "[КПП] \n" +
                "Модель: " + getModel() + "\n" +
                "Тип КПП: " + getTransmissionType().getName() + "\n" +
                "Кол-во передач: " + getGearsCount() + "\n";
    }
}
