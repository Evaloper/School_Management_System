package com.school;

public interface Teach  {

    default void  teachCourse(Teacher name, Course courseName){
        System.out.println(name.getName() + " teaches " + courseName.getCourseName());
    }


}
