package com.htuut.design.pattern.structural.decorator;

/**
 * 实体煎饼
 * 最原始的煎饼，没加加任何装饰
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
