package com.htuut.design.pattern.structural.facade;


public class QualifyService {

    public boolean isAvailable(Gift gift) {

        System.out.println("校验礼物名字：" + gift.getName());

        return true;
    }

}
