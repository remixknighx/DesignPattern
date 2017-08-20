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
        System.out.println("汽车开始行驶....");
        moveable.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");
    }
}
