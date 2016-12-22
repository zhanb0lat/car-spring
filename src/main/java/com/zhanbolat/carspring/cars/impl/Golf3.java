package com.zhanbolat.carspring.cars.impl;

import com.zhanbolat.carspring.cars.Car;
import com.zhanbolat.carspring.cars.DriveType;
import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.engines.impl.AEE;
import com.zhanbolat.carspring.transmissions.ITransmission;
import com.zhanbolat.carspring.transmissions.impl.M_020;

/**
 * Created by zhanbolat on 18.12.2016.
 */
public class Golf3 extends Car {

    public Golf3(IEngine engine, ITransmission transmission) {
        super(
                "Golf mk3",
                engine,
                transmission,
                DriveType.FrontWheel
        );
    }
}
