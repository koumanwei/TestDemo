package com.koumanwei.testdemo.javaClass.singleTon;

/**
 * Created by koumanwei on 2016/11/1.
 */

/**
 * 懒汉式单例模式
 */
public class SingleTonLazy {

    private static SingleTonLazy sInstance = null;

    private SingleTonLazy() {
    }

    public static synchronized SingleTonLazy getInstance() {
        if (sInstance == null) {
            sInstance = new SingleTonLazy();
        }
        return sInstance;
    }
    // 同步降低了效率
}
