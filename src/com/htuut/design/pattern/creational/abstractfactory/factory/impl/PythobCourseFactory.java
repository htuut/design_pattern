package com.htuut.design.pattern.creational.abstractfactory.factory.impl;

import com.htuut.design.pattern.creational.abstractfactory.Note;
import com.htuut.design.pattern.creational.abstractfactory.Video;
import com.htuut.design.pattern.creational.abstractfactory.factory.CourseFactory;
import com.htuut.design.pattern.creational.abstractfactory.python.note.impl.PythonVideo;
import com.htuut.design.pattern.creational.abstractfactory.python.video.impl.PythonNote;

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
