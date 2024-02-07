package com.school;

public class Student extends Person implements TakeCourse {

    private boolean stubborn;
    private boolean malPractise;

    public Student(String name, int age, boolean stubborn, boolean malPractise) {
        super(name, age);
        this.stubborn = stubborn;
        this.malPractise = malPractise;
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