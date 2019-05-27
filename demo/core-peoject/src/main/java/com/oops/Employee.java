package com.oops;

public class Employee extends Person {
    private int empId;

    public Employee(String name,String gender,int empId) {
        super(name,gender);
        this.empId = empId;

    }

    public void work() {

        if (empId==0){
            System.out.println("Not working");
        }else{
            System.out.println("Working as Employee");
        }
    }

    public static void main(String[] args) {
        Person student = new Employee("Deve","Female",0);
        Person employee = new Employee("Ram","Male",6);

        student.work();
        employee.work();

        employee.changeName("Ramjeet Kumar");
        System.out.println(employee.toString());
    }
}
