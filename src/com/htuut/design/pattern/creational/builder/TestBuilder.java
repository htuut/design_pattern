package com.htuut.design.pattern.creational.builder;

public class TestBuilder {

    public static void main(String[] args) {

        Course course = new Course.CourseBuilder()
                .bulidCourseName("java 设计模式")
                .bulidCourseNote("java 设计模式笔记")
                .bulidCoursePPT("java 设计模式 PPT")
                .bulidCourseQA("java 设计模式wenti")
                .bulidCourseVideo("java 设计模式视频")
                .build();

        System.out.println(course);

    }

}
