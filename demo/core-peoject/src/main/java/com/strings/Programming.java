package com.strings;

import java.util.HashMap;
import java.util.Map;

public class Programming{

    public static char getFirstNonRepeatedChar(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }

    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatedChar("Ramjeet"));
    }
}
