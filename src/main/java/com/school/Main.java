package com.school;

public class Main {
    public static void main(String[] args) {
        Principal principalName = new Principal("Mr David", 32);
        Applicant applicant = new Applicant("Eva", 16);
        Student studentName = new Student("Oghenefejiro", true, false);
        Teacher teacher1 = new Teacher("Teacher Edith", 28);
        Course subject = new Course("Dot.net");
        Class section = new Class("Sq020");
        NonAcademicStaff janitor = new NonAcademicStaff("Mrs Grace", 32);
        NonAcademicStaff driver = new NonAcademicStaff(" Mr Okon", 45);


        applicant.apply();
        principalName.admits(applicant);
        principalName.expel(studentName);
        teacher1.teachCourse(teacher1, subject);
        studentName.takeCourse(subject);
        teacher1.squadTaken(teacher1, section);
        janitor.cleans(janitor);
        driver.drives(driver, subject);


    }
}
