package com.bill.proxy.staticproxy;

import java.util.Random;

/**
 * @author wangjf
 * @date 2017 - 08 - 20 17:56
 */
public class Car implements Moveable {

    public void move() {
        //ʵ�ֿ���
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("������ʻ��....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
