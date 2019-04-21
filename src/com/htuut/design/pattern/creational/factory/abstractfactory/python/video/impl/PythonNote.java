package com.htuut.design.pattern.creational.factory.abstractfactory.python.video.impl;

import com.htuut.design.pattern.creational.factory.abstractfactory.Note;

public class PythonNote extends Note {
    @Override
    public void produce() {
        System.out.println("记录 python 学习笔记");
    }
}
