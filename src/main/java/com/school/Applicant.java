package com.school;

public class Applicant extends Person{

    int score;

    public int getScore() {
        return score;
    }

    public Applicant(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public void apply(){
        System.out.println(getName() + " has successfully submitted an application");
    }
}