package com.school;

public class Teacher extends Staff implements Teach {
    public Teacher(String name) {
        super(name);
    }

    public void squadTaken(Teacher teacherName, Class squadName){
//        squad(teacherName, squadName);
        System.out.println(teacherName.getName() +  " has been assigned to " + squadName.getClassName() );
    }

    @Override
    public void teachCourse() {
//        Teach.super.teachCourse();
        System.out.println(getName() + " teaches Java");
    }
}
