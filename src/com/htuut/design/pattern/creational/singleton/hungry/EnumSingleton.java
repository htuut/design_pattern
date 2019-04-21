package com.htuut.design.pattern.creational.singleton.hungry;

/**
 * 基于枚举的单利模式
 * 可以有效防止序列化和反射的攻击
 */
public enum EnumSingleton {

    INSTANCE;

    private Object object;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }


}
