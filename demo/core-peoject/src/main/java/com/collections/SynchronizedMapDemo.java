package com.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("1","Malya");
        map.put("2","Ankit");
        map.put("3","Chetan");
        Map<String,String> synMap  = Collections.synchronizedMap(map);
        System.out.println("Synchronized Map is:  "+synMap);
    }
}
