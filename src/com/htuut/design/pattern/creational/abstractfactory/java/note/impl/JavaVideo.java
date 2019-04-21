package com.htuut.design.pattern.creational.abstractfactory.java.note.impl;

import com.htuut.design.pattern.creational.abstractfactory.Video;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("观看 java 学习视频");
    }
}
