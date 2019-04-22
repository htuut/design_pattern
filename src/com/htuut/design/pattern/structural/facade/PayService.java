package com.htuut.design.pattern.structural.facade;

public class PayService {

    public boolean pay(Gift gift) {
        System.out.println("支付成功：" + gift.getName());
        return true;
    }
}
