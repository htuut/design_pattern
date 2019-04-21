package com.htuut.design.pattern.creational.singleton.lazy;

import java.io.Serializable;

/**
 * 双重检查
 */
public class LazyDoubleCheckSingletom implements Serializable {

    /**
     * volatile 禁止指令重排序
     */
    private volatile static LazyDoubleCheckSingletom instance = null;

    private LazyDoubleCheckSingletom() {

        //懒加载的方式没法避免反射问题（在多线程环境下，如果反射先拿到对象，就完了）

    }


    public static LazyDoubleCheckSingletom getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingletom.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingletom();
                    //第 2 步和第 3 步可能出现指令重排序的问题
                    //1、分配内存
                    //2、初始化对象
                    //3、引用指向对象
                }
            }
        }
        return instance;
    }

    /**
     * 序列化问题：
     * 把该单例序列化到一个文件中，然后再读出来
     * inputStream 的 readObject() 方法( hasReadResolveMethod() )会判断有没有 readResolve() 这个方法，如果没有，就 new 一个新对象
     *
     * @return
     */
    private Object readResolve() {
        return instance;
    }

}
