package com.immutable;

import java.util.HashMap;


public class CustomKey {

    private String name;

    public CustomKey(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        HashMap<CustomKey, String> map = new HashMap<CustomKey, String>();
        map.put(new CustomKey("Shamik"), "Shamik Mitra");
        String val = map.get(new CustomKey("Shamik"));
        System.out.println("Missing equals and hascode so value is not accessible from Map " + val);
    }
}
