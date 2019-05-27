package com.demo;

public final class Employee {
    private final int id;
    private final String name;
    private final Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
      /*  Address cloneAdd = new Address();
        cloneAdd.setPin(address.getPin());
        cloneAdd.setCity(address.getCity());
        cloneAdd.setState(address.getState());
        this.address =cloneAdd;*/

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        Address cloneAdd = new Address();
        cloneAdd.setPin(this.address.getPin());
        cloneAdd.setCity(this.address.getCity());
        cloneAdd.setState(address.getState());
        return cloneAdd;
    }
}
