package com.zhanbolat.carspring.testing;

import com.zhanbolat.carspring.engines.FuelType;
import com.zhanbolat.carspring.engines.IEngine;
import com.zhanbolat.carspring.engines.impl.AEE;
import com.zhanbolat.carspring.engines.impl._4B;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by zhanbolat on 17.12.2016.
 */
public class EngineTest {
    IEngine aee = new AEE();
    IEngine _4b = new _4B();

    @Test
    public void checkModel() {
        Assert.assertEquals(aee.getModel(), "AEE");
        Assert.assertEquals(_4b.getModel(), "4B");
    }

    @Test
    public void checkCapacity() {
        Assert.assertEquals(aee.getCapacity(), 1.6, 0.0);
        Assert.assertEquals(_4b.getCapacity(), 1.8, 0.0);
    }

    @Test
    public void checkPower() {
        Assert.assertEquals(aee.getPower(), 75);
        Assert.assertEquals(_4b.getPower(), 90);
    }

    @Test
    public void checkFuelType() {
        Assert.assertEquals(aee.getFuelType(), FuelType.Petrol);
        Assert.assertEquals(_4b.getFuelType(), FuelType.Petrol);
    }

}
