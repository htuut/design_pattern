package com.htuut.design.pattern.creational.factory.abstractfactory.factory.impl;

import com.htuut.design.pattern.creational.factory.abstractfactory.Note;
import com.htuut.design.pattern.creational.factory.abstractfactory.Video;
import com.htuut.design.pattern.creational.factory.abstractfactory.factory.CourseFactory;
import com.htuut.design.pattern.creational.factory.abstractfactory.java.note.impl.JavaVideo;
import com.htuut.design.pattern.creational.factory.abstractfactory.java.video.impl.JavaNote;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideoInstance() {
        return new JavaVideo();
    }

    @Override
    public Note getNoteInstance() {
        return new JavaNote();
    }
}
