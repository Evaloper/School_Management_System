package com.school;

public class Principal extends Staff {
    public Principal(String name, int age) {
        super(name, age);
    }

    public void admits(Applicant applicantName){
        if (applicantName.getAge() < 12 && applicantName.getScore() < 70){
            System.out.println("Hello " + applicantName.getName() + ". Unfortunately, your application to our school has not been successful, and age criteria played a role in his decision");
        } else {
            System.out.println(getName() + " has admitted " + applicantName.getName());
        }
    }

    public void expel(Student studentName) {
        if (studentName.isStubborn() || studentName.isMalPractise() && studentName.isStubborn() || studentName.isMalPractise()) {
            System.out.println(studentName.getName() + " was found guilty and was expelled by " + getName() + " for breaking the school golden rules");
        } else {
            System.out.println(studentName.getName() + " was not found guilty by " + getName());
        }
    }
}