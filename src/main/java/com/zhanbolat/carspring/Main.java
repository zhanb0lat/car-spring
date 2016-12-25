package com.zhanbolat.carspring;

import com.zhanbolat.carspring.cars.ICar;
import com.zhanbolat.carspring.engines.impl._4B;
import com.zhanbolat.carspring.transmissions.impl.A_01M;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Computer308 on 23.12.2016.
 */
public class Main {
    public static void main(String ... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ICar golf3 = (ICar) context.getBean("Golf3");

    }
}
