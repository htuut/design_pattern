package com.htuut.design.pattern.creational.simplefactory;

public class TestVideo {

    public static void main(String[] args) {

        //1、使用类型的方式， 优点是：不用导入自类的包，减少依赖
        Video java = VideoFactory.getInstance("java");
        java.produce();

        //2、使用反射的方式， 优点是：扩展性强
        Video python = VideoFactory.getInstance(PathonVideo.class);
        python.produce();

    }
}
