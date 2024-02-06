package com.school;

public class NonAcademicStaff extends Staff implements Cleans, Drives {
    public NonAcademicStaff(String name, int age) {
        super(name, age);
    }

    @Override
    public void cleans(NonAcademicStaff name) {
//        Cleans.super.cleans(name);
        System.out.println(name.getName() + " cleans the school daily");
    }

    @Override
    public void drives(NonAcademicStaff name, Course className) {
//        Drives.super.drives(name, className);
        System.out.println("I wonder why "+ name.getName() + " drives just " + className.getCourseName() + " class");
    }
}
