package com.zhanbolat.carspring.testing;

import com.zhanbolat.carspring.cars.DriveType;
import com.zhanbolat.carspring.cars.ICar;
import com.zhanbolat.carspring.cars.impl.Golf3;
import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.engines.impl.AEE;
import com.zhanbolat.carspring.transmissions.ITransmission;
import com.zhanbolat.carspring.transmissions.impl.M_020;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhanbolat on 18.12.2016.
 */
public class CarTest {
    IEngine aee = new AEE();
    ITransmission m020 = new M_020();

    ICar golf3 = new Golf3(aee, m020);

    @Test
    public void checkModel() {
        Assert.assertEquals(golf3.getModel(), "Golf mk3");
    }

    @Test
    public void checkDriveType() {
        Assert.assertEquals(golf3.getDriveType(), DriveType.FrontWheel);
    }
}
