package com.clonning;

public class Student implements Cloneable {

    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student s1 = new Student(1001, "Ramjeet");
            Student s2 = (Student) s1.clone();

            System.out.println("RollNo:" + s1.rollNo + ", Name:  " + s1.name);
            System.out.println("RollNo:" + s2.rollNo + ", Name:  " + s2.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
