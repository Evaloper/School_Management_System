package com.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Applicant FullName: ");
//        String nameOfApplicant = reader.nextLine();
//
//        System.out.print("Enter Address: ");
//        String address  = reader.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = reader.nextInt();
//
//        System.out.print("Enter High School Marks: ");
//        int score = reader.nextInt();

        Principal principal1 = new Principal("Mr David", 32);
        Applicant applicant = new Applicant("Great", 10, 69);
        Applicant applicant2 = new Applicant("Fortune", 11, 69);
        Student student1 = new Student("Oghenefejiro", 14 ,true, false);
        Student student2 = new Student("Praise", 13, false, false);
        Teacher teacher1 = new Teacher("Teacher Edith", 28);
        Course subject = new Course("Dot.net");
        Class section = new Class("Sq020");
        NonAcademicStaff janitor = new NonAcademicStaff("Mrs Grace", 32);
        NonAcademicStaff driver = new NonAcademicStaff(" Mr Okon", 45);


        applicant.apply();
        principal1.admits(applicant);
        applicant2.apply();
        principal1.admits(applicant2);
        principal1.expel(student1);
        principal1.expel(student2);
        teacher1.teachCourse(teacher1, subject);
        student1.takeCourseStu(subject);
        teacher1.squadTaken(teacher1, section);
        janitor.cleans(janitor);
        driver.drives(driver, subject);


    }
}
