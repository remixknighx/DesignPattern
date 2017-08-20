package com.bill.proxy.staticproxy;

/**
 * 使用聚合方式实现的静态代理样例
 *
 * @author wangjf
 * @date 2017 - 08 - 20 23:02
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        Moveable carTimeProxy = new CarTimeProxy(car);
        Moveable carLogProxy = new CarLogProxy(carTimeProxy);

        carLogProxy.move();
    }

}
