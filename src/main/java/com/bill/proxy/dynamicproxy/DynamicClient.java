package com.bill.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wangjf
 * @date 2017 - 08 - 20 23:18
 */
public class DynamicClient {

    /**
     * JDK��̬���������
     */
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h = new TimeHandler(car);
        Class<?> cls = car.getClass();
        /**
         * loader  �������
         * interfaces  ʵ�ֽӿ�
         * h InvocationHandler
         */
        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),
                cls.getInterfaces(), h);
        m.move("����");
    }

}
