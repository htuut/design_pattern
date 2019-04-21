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

        //防止反射创建对象：静态的方式解决方式（类加载的时候就创建对象了）
        if (InnerClass.instance != null) {
            throw new RuntimeException("单利类不允许反射创建对象");
        }
    }


}
