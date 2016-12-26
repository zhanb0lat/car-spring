package com.zhanbolat.carspring.cars.impl;

import com.zhanbolat.carspring.cars.Car;
import com.zhanbolat.carspring.cars.DriveType;
import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.transmissions.ITransmission;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by zhanbolat on 18.12.2016.
 */
public class Golf3 extends Car implements InitializingBean, DisposableBean {

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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[InitializingBean] " + this.getModel() + " init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[DisposableBean] " + this.getModel() + " destroy");
    }

}
