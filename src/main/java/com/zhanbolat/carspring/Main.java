package com.zhanbolat.carspring;

import com.zhanbolat.carspring.cars.ICar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Computer308 on 23.12.2016.
 */
public class Main {
    public static ApplicationContext context;

    public static void main(String ... args) {
        context = new ClassPathXmlApplicationContext("config.xml");
        ICar car = (ICar) context.getBean("Golf3");
        car.startRide();
    }
}
