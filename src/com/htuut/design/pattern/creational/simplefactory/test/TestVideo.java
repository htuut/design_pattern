package com.htuut.design.pattern.creational.simplefactory.test;

import com.htuut.design.pattern.creational.simplefactory.factory.VideoFactory;
import com.htuut.design.pattern.creational.simplefactory.video.Video;
import com.htuut.design.pattern.creational.simplefactory.video.impl.PathonVideo;

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
