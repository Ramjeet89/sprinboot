package com.serializable;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int age;
    private transient int semesters;
    private transient String comments;

    public Student(String name, int age, int semesters, String comments) {
        this.name = name;
        this.age = age;
        this.semesters = semesters;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", age: " + age +
                ", semesters: " + semesters +
                ", comments: " + comments;
    }
}
