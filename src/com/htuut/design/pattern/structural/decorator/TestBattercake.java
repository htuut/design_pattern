package com.htuut.design.pattern.structural.decorator;

public class TestBattercake {

    public static void main(String[] args) {

        //抽象的煎饼
        ABattercake aBattercake;
        //new 一个普通的煎饼
        aBattercake = new Battercake();
        //加一个鸡蛋
        aBattercake = new EggDecorator(aBattercake);
        //再加一个鸡蛋
        aBattercake = new EggDecorator(aBattercake);
        //加一个香肠
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc());
        System.out.println(aBattercake.cost());


    }

}
