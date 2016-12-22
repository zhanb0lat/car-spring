package com.zhanbolat.carspring.transmissions;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public abstract class Transmission implements ITransmission {
    protected final String DESCRIPTION;
    protected final TransmissionType TRANSMISSION_TYPE;
    protected final int GEARS_COUNT;

    protected Transmission(
            final String description,
            final TransmissionType transmissionType,
            final int gears_count) {

        this.DESCRIPTION = description;
        this.TRANSMISSION_TYPE = transmissionType;
        this.GEARS_COUNT = gears_count;
    }


    @Override
    public String getDescription() {
        return this.DESCRIPTION;
    }

    @Override
    public TransmissionType getTransmissionType() {
        return this.TRANSMISSION_TYPE;
    }

    @Override
    public int getGearsCount() {
        return this.GEARS_COUNT;
    }

    @Override
    public void gearUp() {
        System.out.println(this.DESCRIPTION + ": gear up (+)");
    }

    @Override
    public void gearDown() {
        System.out.println(this.DESCRIPTION + ": gear down (-)");
    }
}
