package com.serializable;

import java.io.*;

public class UserConcreteMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File f = new File("C:/Accenture Doc/test.txt");

        User user = new User(26, "Anita");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(user);
        System.out.println("User data saved successfully");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        user = (User) ois.readObject();
        System.out.println("After  de externalizing user name: " + user.getUserName() + " and age is:" + user.getAge());
    }
}
