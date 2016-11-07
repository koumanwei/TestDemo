package com.koumanwei.testdemo.javaClass.singleTon;

/**
 * Created by koumanwei on 2016/11/1.
 */

public class SingleTonDCL {
    private static SingleTonDCL sInstance = null;

    private SingleTonDCL() {
    }

    public static SingleTonDCL getInstance() {
        if (sInstance == null) {
            synchronized (SingleTonDCL.class) {
                sInstance = new SingleTonDCL();
            }
        }
        return sInstance;
    }
    // Double Check Lock 需要时才初始化，又能保证线程安全
}
