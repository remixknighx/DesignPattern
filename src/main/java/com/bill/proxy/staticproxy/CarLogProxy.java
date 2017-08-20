package com.bill.proxy.staticproxy;

/**
 * @author wangjf
 * @date 2017 - 08 - 20 17:59
 */
public class CarLogProxy implements Moveable {

    private Moveable moveable;

    public CarLogProxy(Moveable moveable) {
        super();
        this.moveable = moveable;
    }

    public void move() {
        System.out.println("��־��ʼ...");
        moveable.move();
        System.out.println("��־����...");
    }
}
