package com.immutable;

import javafx.scene.control.RadioMenuItem;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Wrapper {
    public static void main(String[] args)throws Exception {
        Map map  = new HashMap();
        map = System.getProperties();
        Random r = new Random();
        while (true){
            map.put(r.nextInt(),"randomeValue");
            System.out.println(r);
        }
    }
}
