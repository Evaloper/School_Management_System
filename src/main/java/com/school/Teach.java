package com.school;

public interface Teach {
     default void squad(Teacher teacherName, Class squadName){
         System.out.println();
     }
    default void  teachCourse(){
        System.out.println("Teaches java");
    }


}
