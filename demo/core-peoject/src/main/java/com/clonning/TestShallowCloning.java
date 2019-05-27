package com.clonning;

public class TestShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department d = new Department(1, "HR");

        Employee original = new Employee(101, "Ramjeet", d);

        Employee cloned = (Employee) original.clone();


        //For Shallow cloning

       /* System.out.println(cloned.getEmployeeId());
        System.out.println(original != cloned);
        System.out.println(original.getClass() == original.getClass());
        System.out.println(original.equals(cloned));*/

        //Let change the department name in cloned object and we will verify in original object
        cloned.getDepartment().setName("Finanice");
        System.out.println(original.getDepartment().getName());
        System.out.println(cloned.getDepartment().getName());

    }
}
