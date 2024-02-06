package com.school;

public interface Drives {
    default void drives(NonAcademicStaff name, Course className){
        System.out.println("I wonder why "+ name.getName() + " drives just " + className.getCourseName() + " class");
    }
}


