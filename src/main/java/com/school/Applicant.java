package com.school;

public class Applicant {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Applicant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void apply(){
        System.out.println(getName() + " has successfully submitted an application");
    }
}