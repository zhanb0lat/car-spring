package com.zhanbolat.carspring.cars.impl;

import com.zhanbolat.carspring.cars.Car;
import com.zhanbolat.carspring.cars.DriveType;
import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.transmissions.ITransmission;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhanbolat on 18.12.2016.
 */
public class Golf3 extends Car implements InitializingBean, DisposableBean {
    public static final String MODEL = "Golf mk3";

    public Golf3() {
        this(null, null);
    }

    @Autowired
    public Golf3(IEngine engine, ITransmission transmission) {
        super(
                MODEL,
                engine,
                transmission,
                DriveType.FrontWheel
        );
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[InitializingBean] " + getModel() + " init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[DisposableBean] " + getModel() + " destroy");
    }

}
