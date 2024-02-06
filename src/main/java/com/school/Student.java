package com.school;

public class Student implements TakeCourse {
    private String name;
    private boolean stubborn;
    private boolean malPractise;

    public Student(String name, boolean stubborn, boolean malPractise) {
        this.name = name;
        this.stubborn = stubborn;
        this.malPractise = malPractise;
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

    public boolean isMalPractise() {
        return malPractise;
    }

    public void setMalPractise(boolean malPractise) {
        this.malPractise = malPractise;
    }


    @Override
    public void takeCourseStu(Course course) {
        System.out.println(getName() + " is taking the course: " +  course.getCourseName());
    }
}