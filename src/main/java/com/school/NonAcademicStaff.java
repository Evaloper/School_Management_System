package com.school;

public class NonAcademicStaff extends Staff implements Cleans, Drives {
    public NonAcademicStaff(String name, int age) {
        super(name, age);
    }

    @Override
    public void cleans(NonAcademicStaff name) {
        Cleans.super.cleans(name);
    }

    @Override
    public void drives(NonAcademicStaff name, Course className) {
        Drives.super.drives(name, className);
    }
}
