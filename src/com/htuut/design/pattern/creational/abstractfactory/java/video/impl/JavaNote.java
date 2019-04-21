package com.htuut.design.pattern.creational.abstractfactory.java.video.impl;

import com.htuut.design.pattern.creational.abstractfactory.Note;

public class JavaNote extends Note {
    @Override
    public void produce() {
        System.out.println("记录 java 学习笔记");
    }
}
