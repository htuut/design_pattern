package com.htuut.design.pattern.creational.factory.simplefactory.video.impl;

import com.htuut.design.pattern.creational.factory.simplefactory.video.Video;

public class PathonVideo extends Video {


    @Override
    public void produce() {
        System.out.println("播放 python 视频");
    }
}
