package com.htuut.design.pattern.creational.simplefactory;

public class TestVideo {

    public static void main(String[] args) {

        Video java = VideoFactory.getInstance("java");

        java.produce();

    }


}
