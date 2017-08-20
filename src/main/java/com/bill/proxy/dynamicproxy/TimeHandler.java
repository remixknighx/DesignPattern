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
	 * @param proxy  ���������
	 * @param method  ���������ķ���
	 * @param args �����Ĳ���
	 *
	 * @return Object  �����ķ���ֵ
	 */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long starttime = System.currentTimeMillis();
        System.out.println("������ʼ��ʻ....");
        System.out.println((String) args[0]);
        method.invoke(target, args);
        long endtime = System.currentTimeMillis();
        System.out.println("����������ʻ....  ������ʻʱ�䣺"
                + (endtime - starttime) + "���룡");

        return null;
    }
}
