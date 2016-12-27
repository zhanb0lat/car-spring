package com.zhanbolat.carspring;

import com.zhanbolat.carspring.pool.IPool;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Computer308 on 23.12.2016.
 */
public class Main {
    public static ApplicationContext context;

    public static void main(String ... args) {
        context = new ClassPathXmlApplicationContext("config.xml");
        IPool enginePool = (IPool) context.getBean("enginePool");

        for (Object engine : enginePool.getItems())
            System.out.println(engine);

        IPool transmissionPool = (IPool) context.getBean("transmissionPool");

        for (Object transmissoin : transmissionPool.getItems())
            System.out.println(transmissoin);
    }
}
