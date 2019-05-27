package com.demo;

public class EmployeeDetails {

    public static void main(String[] args) {

        Address address = new Address();
        address.setPin(560036);
        address.setCity("Bangalore");
        address.setState("KA");

        Employee emp = new Employee(101, "Ryan", address);

        System.out.println("Ryan address before modification: " + emp.getAddress().getState());
        //address.setState("KA");
        emp.getAddress().setState("JH");
        System.out.println("Ryan address before modification: " + emp.getAddress().getState());
    }
}