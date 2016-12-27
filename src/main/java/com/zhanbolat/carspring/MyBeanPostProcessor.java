package com.zhanbolat.carspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Computer308 on 26.12.2016.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
//        System.out.println("[postProcessBeforeInitialization] " + o.toString());
//
//        ApplicationContext context = Main.context;
//        if (o instanceof ICar) {
//            System.out.println("Car setting...");
//            ICar car = (ICar) o;
//            if (car.getEngine() == null) {
//                System.out.println("setting engine...");
//                car.setEngine((IEngine) context.getBean("AEE"));
//                System.out.println(car.getModel() + ": Engine - " + car.getEngine().getModel());
//            }
//            if (car.getTransmission() == null) {
//                System.out.println("setting transmission...");
//                car.setTranmission((ITransmission) context.getBean("020"));
//                System.out.println(car.getModel() + ": Transmission - " + car.getTransmission().getModel());
//            }
//            o = (Object) car;
//        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        //System.out.println("[postProcessAfterInitialization] " + o.toString());
        return o;
    }
}