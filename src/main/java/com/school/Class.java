package com.school;

public class Class {
    String className;

    public Class(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    void squad(String squadName){
        System.out.println(getClassName() + " is in " + squadName.getClass() );
    }
}
