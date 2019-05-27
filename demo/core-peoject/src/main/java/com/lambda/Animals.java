package com.lambda;

public interface Animals {
    default void food() {
        System.out.println("Animal eat food");
    }
}
class MainClass {
    public static void main(String[] args) {
        Animals lion = new Animals() {
            @Override
            public void food() {
                System.out.println("Lion eat flesh");
            }
        };
        lion.food();
    }
}