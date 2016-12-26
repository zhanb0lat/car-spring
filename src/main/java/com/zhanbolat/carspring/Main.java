package com.zhanbolat.carspring;

import com.zhanbolat.carspring.cars.ICar;
import com.zhanbolat.carspring.conveyor.IConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Computer308 on 23.12.2016.
 */
public class Main {
    public static ApplicationContext context;

    public static void main(String ... args) {
        context = new ClassPathXmlApplicationContext("config.xml");
        IConveyor carConveyor = (IConveyor) context.getBean("CarConveyor");

        ICar golf1 = carConveyor.getCar();
        ICar golf2 = carConveyor.getCar();
        ICar golf3 = carConveyor.getCar();

        System.out.println(golf1);
        System.out.println(golf2);
        System.out.println(golf3);
    }
}
