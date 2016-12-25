package com.zhanbolat.carspring.cars.impl;

import com.zhanbolat.carspring.cars.Car;
import com.zhanbolat.carspring.cars.DriveType;
import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.transmissions.ITransmission;

/**
 * Created by zhanbolat on 18.12.2016.
 */
public class Golf3 extends Car {

    public Golf3() {
        super();
    }

    public Golf3(IEngine engine, ITransmission transmission) {
        super(
                "Golf mk3",
                engine,
                transmission,
                DriveType.FrontWheel
        );
    }

    public void preInit() {
        System.out.println("Golf3 init... ");
    }

    public void preDestroy() {
        System.out.println("Golf3 destroy... ");
    }
}
