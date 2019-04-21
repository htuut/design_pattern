package com.htuut.design.pattern.creational.simplefactory.factory;

import com.htuut.design.pattern.creational.simplefactory.video.Video;
import com.htuut.design.pattern.creational.simplefactory.video.impl.JavaVideo;
import com.htuut.design.pattern.creational.simplefactory.video.impl.PathonVideo;

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

    public static Video getInstance(Class<? extends Video> clazz) {

        Video video = null;

        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return video;

    }

}
