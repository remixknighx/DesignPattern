package com.bill.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangjf
 * @date 2017 - 08 - 20 23:12
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
	 * @param proxy  被代理对象
	 * @param method  被代理对象的方法
	 * @param args 方法的参数
	 *
	 * @return Object  方法的返回值
	 */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");
        System.out.println((String) args[0]);
        method.invoke(target, args);
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");

        return null;
    }
}
