package com.htuut.design.pattern.creational.factory.abstractfactory.python.note.impl;

import com.htuut.design.pattern.creational.factory.abstractfactory.Video;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("观看 python 学习视频");
    }
}
