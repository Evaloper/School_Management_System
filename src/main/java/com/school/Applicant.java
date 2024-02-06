package com.school;

public class Applicant extends Person{
    public Applicant(String name, int age) {
        super(name, age);
    }

    public void apply(){
        System.out.println(getName() + " has successfully submitted an application");
    }
}