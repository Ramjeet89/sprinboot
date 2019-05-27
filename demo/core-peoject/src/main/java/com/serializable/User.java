package com.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {

    private int age;
    private String userName;

    public User() {

    }

    public User(int age, String userName) {
        this.age = age;
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        userName = (String) in.readObject();
        age = in.readInt();
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(userName);
        out.writeInt(age);
    }
}
