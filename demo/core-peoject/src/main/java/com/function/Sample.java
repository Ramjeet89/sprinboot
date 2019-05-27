package com.function;

public class Sample {
    private String s;

    Sample(String s) {
        this.s = s;
        System.out.println("Constructed Executed: " + s);
    }
}

interface Interf1 {
    Sample get(String e);
}

class Test7 {
    public static void main(String[] args) {
        Interf1 f = s -> new Sample(s);
        f.get("From Lambda Expression");
        Interf1 f1 = Sample::new;
        f1.get("From Constructor Reference");
    }
}

