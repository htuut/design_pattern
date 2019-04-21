package com.htuut.design.pattern.creational.factorymethod.video.impl;

import com.htuut.design.pattern.creational.factorymethod.video.Video;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("播放 java 视频");
    }
}
