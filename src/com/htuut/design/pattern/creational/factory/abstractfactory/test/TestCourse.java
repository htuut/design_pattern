package com.htuut.design.pattern.creational.factory.abstractfactory.test;

import com.htuut.design.pattern.creational.factory.abstractfactory.Note;
import com.htuut.design.pattern.creational.factory.abstractfactory.Video;
import com.htuut.design.pattern.creational.factory.abstractfactory.factory.CourseFactory;
import com.htuut.design.pattern.creational.factory.abstractfactory.factory.impl.JavaCourseFactory;
import com.htuut.design.pattern.creational.factory.abstractfactory.factory.impl.PythobCourseFactory;

public class TestCourse {

    public static void main(String[] args) {

        CourseFactory courseFactory = new JavaCourseFactory();

        Note note = courseFactory.getNoteInstance();
        Video video = courseFactory.getVideoInstance();
        note.produce();
        video.produce();

        System.out.println("====================================");

        CourseFactory courseFactory2 = new PythobCourseFactory();
        Note note2 = courseFactory2.getNoteInstance();
        Video video2 = courseFactory2.getVideoInstance();
        note2.produce();
        video2.produce();


    }

}
