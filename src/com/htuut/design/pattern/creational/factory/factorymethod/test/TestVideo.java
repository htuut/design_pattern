package com.htuut.design.pattern.creational.factory.factorymethod.test;

import com.htuut.design.pattern.creational.factory.factorymethod.factory.VideoFactory;
import com.htuut.design.pattern.creational.factory.factorymethod.factory.impl.JavaVideoFactory;
import com.htuut.design.pattern.creational.factory.factorymethod.factory.impl.PythonVideoFactory;
import com.htuut.design.pattern.creational.factory.factorymethod.video.Video;

public class TestVideo {

    public static void main(String[] args) {

        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getInstance();
        video.produce();


        VideoFactory videoFactory2 = new PythonVideoFactory();
        Video video2 = videoFactory2.getInstance();
        video2.produce();

    }

}
