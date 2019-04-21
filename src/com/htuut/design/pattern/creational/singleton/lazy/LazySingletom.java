package com.htuut.design.pattern.creational.singleton.lazy;

import java.io.Serializable;

/**
 * 懒加载
 */
public class LazySingletom implements Serializable {

    private static LazySingletom instance = null;

    private LazySingletom() {

        //懒加载的方式没法避免反射问题（在多线程环境下，如果反射先拿到对象，就完了）

    }

    /**
     * synchronized 加载静态方法上，锁的是 class，锁的范围比较大
     *
     * @return
     */
    public synchronized static LazySingletom getInstance() {
        if (instance == null) {
            instance = new LazySingletom();
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
