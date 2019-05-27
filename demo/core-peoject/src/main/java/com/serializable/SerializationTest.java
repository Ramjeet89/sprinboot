package com.serializable;

import java.io.IOException;

public class SerializationTest {
    public static void main(String[] args) {

        String fileName = "employee.ser";
        Employee emp = new Employee();
        emp.setId(10101);
        emp.setName("Ronit Kumar");
        emp.setSalary(50000);

        try {
            SerializationUtil.serialize(emp, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Employee empNew = null;
        try {
            empNew = (Employee) SerializationUtil.deserialize(fileName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("emp Object::" + emp);
        System.out.println("empNew Object::" + empNew);
    }
}
