package com.koumanwei.testdemo.javaClass.singleTon;

/**
 * Created by koumanwei on 2016/11/1.
 */

/**
 * 饿汉式单例模式
 */
public class SingleTonHunger {

    private static final SingleTonHunger sInstance = new SingleTonHunger();

    private SingleTonHunger() {
    }

    public static SingleTonHunger getInstance() {
        return sInstance;
    }
    // 不能保证线程安全
}

