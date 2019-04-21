package com.htuut.design.pattern.creational.singleton.lazy;

/**
 * 静态内部类
 */
public class StaticInnerClassSingleton {


    private static class InnerClass {

        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    private StaticInnerClassSingleton() {

    }


}
