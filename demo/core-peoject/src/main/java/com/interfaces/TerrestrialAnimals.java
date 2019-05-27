package com.interfaces;

public abstract class TerrestrialAnimals {
    void habitat() {
        System.out.println("Habitat of Terrestrial animal is land");
    }

    abstract void food();
}


class Lion1 extends TerrestrialAnimals {
    @Override
    void food() {
        System.out.println("Lion eat - flesh");
    }
}

class Goat extends TerrestrialAnimals {
    @Override
    void food() {
        System.out.println("Goat eat - grass");
    }
}


class MyClasses1 {
    public static void main(String[] args) {

        TerrestrialAnimals lion = new Lion1();
        lion.food();
        lion.habitat();

        System.out.println(">>>>>>>>>>>>>>>>>");

        TerrestrialAnimals goat = new Goat();
        goat.habitat();
        goat.food();
    }
}