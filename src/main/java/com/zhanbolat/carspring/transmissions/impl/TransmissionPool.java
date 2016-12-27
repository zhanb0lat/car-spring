package com.zhanbolat.carspring.transmissions.impl;

import com.zhanbolat.carspring.pool.IPool;
import com.zhanbolat.carspring.transmissions.ITransmission;

import java.util.Collection;

/**
 * Created by Computer308 on 27.12.2016.
 */
public class TransmissionPool implements IPool<ITransmission> {
    private Collection<ITransmission> transmissionPool;

    @Override
    public Collection<ITransmission> getItems() {
        return transmissionPool;
    }

    @Override
    public void setItems(Collection<ITransmission> items) {
        this.transmissionPool = items;
    }
}
