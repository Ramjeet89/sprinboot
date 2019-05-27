package com.interfaces;

public interface Animals {
    abstract void habitat();

    abstract void food();
}

class Lion implements Animals {

    @Override
    public void habitat() {
        System.out.println("Habitat of Lion is land");
    }

    @Override
    public void food() {
        System.out.println("Lion eat - flesh");
    }
}


class Whale implements Animals {
    @Override
    public void habitat() {
        System.out.println("Habitat of Whale is water");
    }

    @Override
    public void food() {
        System.out.println("Whale eat - aquatic animals");
    }
}

class MyClasss {
    public static void main(String[] args) {
        Animals lion = new Lion();
        lion.habitat();
        lion.food();


        Animals whale = new Whale();
        whale.habitat();
        whale.food();
    }
}