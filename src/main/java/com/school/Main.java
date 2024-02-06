package com.school;

public class Main {
    public static void main(String[] args) {
        Principal principal1 = new Principal("Mr David", 32);
        Applicant applicant = new Applicant("Eva", 16);
        Student student1 = new Student("Oghenefejiro", true, false);
        Student student2 = new Student("Praise", false, false);
        Teacher teacher1 = new Teacher("Teacher Edith", 28);
        Course subject = new Course("Dot.net");
        Class section = new Class("Sq020");
        NonAcademicStaff janitor = new NonAcademicStaff("Mrs Grace", 32);
        NonAcademicStaff driver = new NonAcademicStaff(" Mr Okon", 45);


        applicant.apply();
        principal1.admits(applicant);
        principal1.expel(student1);
        principal1.expel(student2);
        teacher1.teachCourse(teacher1, subject);
        student1.takeCourseStu(subject);
        teacher1.squadTaken(teacher1, section);
        janitor.cleans(janitor);
        driver.drives(driver, subject);


    }
}
