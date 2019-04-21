package com.htuut.design.pattern.creational.factory.abstractfactory.factory;

import com.htuut.design.pattern.creational.factory.abstractfactory.Note;
import com.htuut.design.pattern.creational.factory.abstractfactory.Video;

public interface CourseFactory {

    Video getVideoInstance();

    Note getNoteInstance();

}
