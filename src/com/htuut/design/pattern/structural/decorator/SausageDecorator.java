package com.htuut.design.pattern.structural.decorator;

/**
 * 火腿肠装饰者
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个火腿";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
