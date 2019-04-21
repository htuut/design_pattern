package com.htuut.design.pattern.creational.simplefactory;

public class VideoFactory {


    public static Video getInstance(String type) {

        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        }

        if ("python".equalsIgnoreCase(type)) {
            return new PathonVideo();
        }

        return null;

    }

}
