package com.htuut.design.pattern.structural.facade;

/**
 * 礼物类
 */
public class Gift {
    /**
     * 礼物名称
     */
    private String name;

    public Gift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
