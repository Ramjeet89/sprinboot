package com.immutablecls;

import java.util.HashMap;

public class ImmutableClassTest {

    public static void main(String[] args) {
        Integer localId = new Integer(1);
        String localName = new String("Ankit");
        HashMap<Integer, String> localMap = new HashMap<Integer, String>();
        localMap.put(11, "Audi");

        ImmutableClass immutableClass = new ImmutableClass(localId, localName, localMap);

        System.out.println("----Display ImmutableClass members before changing----");
        System.out.println(immutableClass.getName());  // "ankit"
        System.out.println(immutableClass.getId());        // 1
        System.out.println(immutableClass.getMap());   //{11=audi}

        //Comparing ImmutableClass members with local before changing
        System.out.println(localName == immutableClass.getName());  //true
        System.out.println(localId == immutableClass.getId());      //true
        System.out.println(localMap == immutableClass.getMap());  //false

        //change local
        localId = new Integer(2);
        localName = new String("mittal");
        localMap.put(12, "ferarri");

        System.out.println("----Display ImmutableClass members before changing----");
        System.out.println(immutableClass.getName());  // "ankit"
        System.out.println(immutableClass.getId());        // 1
        System.out.println(immutableClass.getMap());   //{11=audi}

        //Comparing ImmutableClass members with local before changing
        System.out.println(localName == immutableClass.getName());  //true
        System.out.println(localId == immutableClass.getId());     //true
        System.out.println(localMap == immutableClass.getMap());  //false
    }
}
