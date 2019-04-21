package com.htuut.design.pattern.creational.factory.abstractfactory.factory.impl;

import com.htuut.design.pattern.creational.factory.abstractfactory.Note;
import com.htuut.design.pattern.creational.factory.abstractfactory.Video;
import com.htuut.design.pattern.creational.factory.abstractfactory.factory.CourseFactory;
import com.htuut.design.pattern.creational.factory.abstractfactory.python.note.impl.PythonVideo;
import com.htuut.design.pattern.creational.factory.abstractfactory.python.video.impl.PythonNote;

public class PythobCourseFactory implements CourseFactory {
    @Override
    public Video getVideoInstance() {
        return new PythonVideo();
    }

    @Override
    public Note getNoteInstance() {
        return new PythonNote();
    }
}
