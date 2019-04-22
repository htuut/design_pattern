package com.htuut.design.pattern.structural.decorator;

/**
 * 抽象的煎饼类
 */
public abstract class ABattercake {

    /**
     * 描述
     *
     * @return
     */
    protected abstract String getDesc();

    /**
     * 计算价格
     *
     * @return
     */
    protected abstract int cost();

}
