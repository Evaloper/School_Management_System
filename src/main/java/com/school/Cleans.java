package com.school;

public interface Cleans {
    default void cleans(NonAcademicStaff name){
        System.out.println(name.getName() + " cleans the school daily");
    }
}
