package com.zhanbolat.carspring.engines.impl;

import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.pool.IPool;

import java.util.Collection;

/**
 * Created by Computer308 on 27.12.2016.
 */
public class EnginePool implements IPool<IEngine> {
    private Collection<IEngine> enginePool;

    @Override
    public Collection<IEngine> getItems() {
        return enginePool;
    }

    @Override
    public void setItems(Collection<IEngine> items) {
        this.enginePool = items;
    }

}
