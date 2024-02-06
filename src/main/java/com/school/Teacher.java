package com.school;

public class Teacher extends Staff implements Teach {
    public Teacher(String name, int age) {
        super(name, age);
    }


    public void squadTaken(Teacher teacherName, Class squadName){
//        squad(teacherName, squadName);
        System.out.println(teacherName.getName() +  " has been assigned to " + squadName.getClassName() );
    }

    @Override
    public void teachCourse(Teacher name, Course courseName) {
//        Teach.super.teachCourse(name, courseName);
        System.out.println(name.getName() + " teaches " + courseName.getCourseName());
    }
}
