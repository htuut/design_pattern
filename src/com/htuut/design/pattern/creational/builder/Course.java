package com.htuut.design.pattern.creational.builder;

public class Course {

    private String courseName;

    private String coursePPT;

    private String courseVideo;

    private String courseNote;

    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseNote = courseBuilder.courseNote;
        this.courseQA = courseBuilder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseNote='" + courseNote + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    /**
     * 链式
     */
    public static class CourseBuilder {

        private String courseName;

        private String coursePPT;

        private String courseVideo;

        private String courseNote;

        private String courseQA;

        public CourseBuilder bulidCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder bulidCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder bulidCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder bulidCourseNote(String courseNote) {
            this.courseNote = courseNote;
            return this;
        }

        public CourseBuilder bulidCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }


    }

}
