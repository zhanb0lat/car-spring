package com.zhanbolat.carspring.testing;

import com.zhanbolat.carspring.transmissions.ITransmission;
import com.zhanbolat.carspring.transmissions.TransmissionType;
import com.zhanbolat.carspring.transmissions.impl.A_01M;
import com.zhanbolat.carspring.transmissions.impl.M_020;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zhanbolat on 17.12.2016.
 */
public class TransmissionTest {
    ITransmission a01m = new A_01M();
    ITransmission m020 = new M_020();

    @Test
    public void checkDescription() {
        Assert.assertEquals(a01m.getModel(), "01M");
        Assert.assertEquals(m020.getModel(), "020");
    }
    @Test
    public void checkTransmissionType() {
        Assert.assertEquals(a01m.getTransmissionType(), TransmissionType.Automatic);
        Assert.assertEquals(m020.getTransmissionType(), TransmissionType.Manual);
    }
    @Test
    public void checkGearsCount() {
        Assert.assertEquals(a01m.getGearsCount(), 4);
        Assert.assertEquals(m020.getGearsCount(), 5);
    }
}
