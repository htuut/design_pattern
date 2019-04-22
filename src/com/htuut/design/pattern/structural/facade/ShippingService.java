package com.htuut.design.pattern.structural.facade;

public class ShippingService {

    public boolean ship(Gift gift) {

        System.out.println("发送物流：" + gift);

        return true;
    }
}
