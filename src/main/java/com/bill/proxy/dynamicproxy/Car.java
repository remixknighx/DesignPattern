package com.bill.proxy.dynamicproxy;

import java.util.Random;

/**
 * @author wangjf
 * @date 2017 - 08 - 20 23:12
 */
public class Car implements Moveable {

    public void move() {
        //实现开车
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void move(String carName) {
        System.out.println(carName + "正在行驶中...");
    }
}
