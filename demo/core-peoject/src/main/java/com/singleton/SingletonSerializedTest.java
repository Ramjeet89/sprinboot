package com.singleton;

import java.io.*;

public class SingletonSerializedTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        //Serialization
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("fileName.ser"));
        out.writeObject(instanceOne);
        out.close();

        //De-serialized
        ObjectInput in = new ObjectInputStream(new FileInputStream("fileName.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        System.out.println("instanceOne hashcode:: " + instanceOne.hashCode());
        System.out.println("instanceTwo hashcode:: " + instanceTwo.hashCode());
    }
}
