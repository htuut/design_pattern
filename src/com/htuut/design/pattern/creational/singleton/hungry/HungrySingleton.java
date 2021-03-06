package com.htuut.design.pattern.creational.singleton.hungry;

import java.io.Serializable;

/**
 * 饿汉式：在类加载的时候就被初始化
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

        //防止反射创建对象：静态的方式解决方式（类加载的时候就创建对象了）
        if (instance != null) {
            throw new RuntimeException("单利类不允许反射创建对象");
        }
    }

    public HungrySingleton getInstance() {
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
