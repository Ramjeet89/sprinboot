package com.oops1;

public class Employee {
   private Integer id;

    public String getId() {
        return String.valueOf(id);
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }
}
