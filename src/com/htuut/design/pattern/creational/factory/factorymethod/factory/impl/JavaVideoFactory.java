package com.htuut.design.pattern.creational.factory.factorymethod.factory.impl;

import com.htuut.design.pattern.creational.factory.factorymethod.factory.VideoFactory;
import com.htuut.design.pattern.creational.factory.factorymethod.video.Video;
import com.htuut.design.pattern.creational.factory.factorymethod.video.impl.JavaVideo;

public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getInstance() {

        return new JavaVideo();

    }
}
