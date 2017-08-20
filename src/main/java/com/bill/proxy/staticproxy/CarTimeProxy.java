package com.bill.proxy.staticproxy;

/**
 * @author wangjf
 * @date 2017 - 08 - 20 23:01
 */
public class CarTimeProxy implements Moveable {

    private Moveable moveable;

    public CarTimeProxy(Moveable moveable) {
        super();
        this.moveable = moveable;
    }

    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("������ʼ��ʻ....");
        moveable.move();
        long endtime = System.currentTimeMillis();
        System.out.println("����������ʻ....  ������ʻʱ�䣺"
                + (endtime - starttime) + "���룡");
    }
}
