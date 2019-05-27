package com.serializable;

import java.io.*;

public class SerializingCustomerObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Customer c = new Customer();
        c.setCustomerId(1234567);
        c.setName("Ramjeet Kumar");
        c.setAccountNo(876541);

        //Data Serializing
        FileOutputStream fos = new FileOutputStream("C:/Accenture Doc/test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        System.out.println("Serialized data is saved in Employee.ser file");
        oos.close();
        fos.close();

        //Data Deserializing
        FileInputStream fis = new FileInputStream("C:/Accenture Doc/test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        c = (Customer) ois.readObject();
        System.out.println("Serialized data is restored from test.txt file");
        fis.close();
        ois.close();
        System.out.println(c.toString());
    }
}
