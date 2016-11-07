package com.koumanwei.testdemo.javaClass.singleTon;

/**
 * Created by koumanwei on 2016/11/1.
 */

/**
 * 静态内部类单例模式
 */
public class SingleTon {

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return SingleTonHolder.sInstance;
    }

    private static class SingleTonHolder {
        private static final SingleTon sInstance = new SingleTon();
    }

    // 第一次加载SingleTon类的时候，并不会初始化sInstance，只有在第一次调用SingleTon的
    // getInstance方法的时候才会导致sInstance被初始化。因此，第一次调用getInstance方法
    // 会导致虚拟机加载SingleTonHolder类，这种方式不仅能够保证线程安全，也能够保证单例对象
    // 的唯一性，同时也延迟了单例对象的实例化
}

