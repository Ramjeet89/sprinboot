package com.oops;

public abstract class Vehicle {
    public abstract int getNoOfWeels();
}

class Bus extends Vehicle {
    public int getNoOfWeels() {
        return 6;
    }
}

class Auto extends Vehicle {
    public int getNoOfWeels() {
        return 3;
    }
}

class Bike extends Vehicle {
    public int getNoOfWeels() {
        return 2;
    }
}

class Test {

    public static void main(String[] args) {

        Bus bus = new Bus();
        System.out.println(bus.getNoOfWeels());

        Auto auto = new Auto();
        System.out.println(auto.getNoOfWeels());

        Bike bike  = new Bike();
        System.out.println(bike.getNoOfWeels());
    }
}
