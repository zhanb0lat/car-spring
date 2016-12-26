package com.zhanbolat.carspring.conveyor;

import com.zhanbolat.carspring.cars.ICar;

/**
 * Created by Computer308 on 26.12.2016.
 */
public abstract class CarConveyor implements IConveyor {
    @Override
    public abstract ICar getCar();
}
