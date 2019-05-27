package com.oops1;

public class MyClass2 {
    public static void main(String[] args) {
        Object o = new Animal();

        Object a1 = new AquaticAnimal();
        Animal a2 = new AquaticAnimal();

        Object f1 = new Fish();
        Animal f2 = new Fish();

        AquaticAnimal f3 = new Fish();

    }
}
