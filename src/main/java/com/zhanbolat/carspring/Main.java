package com.zhanbolat.carspring;

import com.zhanbolat.carspring.cars.ICar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Computer308 on 23.12.2016.
 */
public class Main {
    public static void main(String ... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ICar golf3 = (ICar) context.getBean("Golf3");
        ICar golf3Other = (ICar) context.getBean("Golf3");

        System.out.println(golf3.getModel());

        golf3.startRide();
        golf3.stopRide();


        ICar golf3Empty = (ICar) context.getBean("Golf3Empty");
        golf3Empty.startRide();

        System.out.println();
        System.out.println(golf3Other);
        System.out.println(golf3);
        System.out.println(golf3Empty);
    }
}
