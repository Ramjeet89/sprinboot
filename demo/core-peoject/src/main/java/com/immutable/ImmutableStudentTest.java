package com.immutable;

public class ImmutableStudentTest {
    public static void main(String[] args) {

        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1990);

        ImmutableStudent student = new ImmutableStudent(1, "Ryan", age);
        System.out.println("Ryan age before modification: " + student.getAge().getYear());
      //  age.setYear(1993);
        student.getAge().setYear(1994);
        System.out.println("Ryan age after modification: " + student.getAge().getYear());
    }
}
