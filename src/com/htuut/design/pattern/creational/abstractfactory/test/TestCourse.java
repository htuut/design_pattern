package com.htuut.design.pattern.creational.abstractfactory.test;

import com.htuut.design.pattern.creational.abstractfactory.Note;
import com.htuut.design.pattern.creational.abstractfactory.Video;
import com.htuut.design.pattern.creational.abstractfactory.factory.CourseFactory;
import com.htuut.design.pattern.creational.abstractfactory.factory.impl.JavaCourseFactory;
import com.htuut.design.pattern.creational.abstractfactory.factory.impl.PythobCourseFactory;

public class TestCourse {

    public static void main(String[] args) {

        CourseFactory courseFactory = new JavaCourseFactory();

        Note note = courseFactory.getNoteInstance();
        Video video = courseFactory.getVideoInstance();
        note.produce();
        video.produce();

        CourseFactory courseFactory2 = new PythobCourseFactory();

        Note note2 = courseFactory2.getNoteInstance();
        Video video2 = courseFactory2.getVideoInstance();
        note2.produce();
        video2.produce();


    }

}
