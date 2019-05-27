package com.collections;

import java.util.HashMap;
import java.util.Map;

public class StringInMapExample {
    public static void main(String[] args) {
        Map<Integer,String> hm= new HashMap<Integer, String>();
        hm.put(1,"data");
        hm.put(1, "data OVERRIDDEN");

        System.out.println(hm.get(1));
    }
}
