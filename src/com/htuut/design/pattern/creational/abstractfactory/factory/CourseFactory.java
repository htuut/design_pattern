package com.htuut.design.pattern.creational.abstractfactory.factory;

import com.htuut.design.pattern.creational.abstractfactory.Note;
import com.htuut.design.pattern.creational.abstractfactory.Video;

public interface CourseFactory {

    Video getVideoInstance();

    Note getNoteInstance();

}
