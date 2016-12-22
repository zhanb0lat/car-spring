package com.zhanbolat.carspring.engines.impl;

import com.zhanbolat.carspring.engines.Engine;
import com.zhanbolat.carspring.engines.FuelType;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public class AEE extends Engine {
    public AEE() {
        super("AEE", 1.6, 75, FuelType.Petrol);
    }
}
