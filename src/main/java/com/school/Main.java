package com.school;

public class Main {
    public static void main(String[] args) {
        Principal principalName = new Principal("Mr David");
        Applicant applicant = new Applicant("Eva", 16);
        Student studentName = new Student("Oghenefejiro", true, false);
        Teacher teacher1 = new Teacher("Teacher Edith");
        Course subject = new Course("Dot.net");
        Class section = new Class("Sq020");


        applicant.apply();
        principalName.admits(applicant);
        principalName.expel(studentName);
        teacher1.teachCourse();
        studentName.takeCourse(subject);
        teacher1.squadTaken(teacher1, section);

    }
}
