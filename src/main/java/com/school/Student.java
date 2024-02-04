package com.school;

public class Student {
    private String name;
    private boolean stubborn;
    private boolean malpractise;

    public Student(String name, boolean stubborn, boolean malpractise) {
        this.name = name;
        this.stubborn = stubborn;
        this.malpractise = malpractise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStubborn() {
        return stubborn;
    }

    public void setStubborn(boolean stubborn) {
        this.stubborn = stubborn;
    }

    public boolean isMalpractise() {
        return malpractise;
    }

    public void setMalpractise(boolean malpractise) {
        this.malpractise = malpractise;
    }

    public void takeCourse(Course course){
        System.out.println(getName() + " is taking the course: " +  course.getCourseName());
    }


}