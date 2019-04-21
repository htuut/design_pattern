package com.htuut.design.pattern.creational.factorymethod.factory.impl;

import com.htuut.design.pattern.creational.factorymethod.factory.VideoFactory;
import com.htuut.design.pattern.creational.factorymethod.video.Video;
import com.htuut.design.pattern.creational.factorymethod.video.impl.JavaVideo;

public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getInstance() {

        return new JavaVideo();

    }
}
