package com.immutablecls;

import java.util.HashMap;

public class ImmutableClass {
    private final Integer id;
    private final String name;
    private final HashMap<Integer,String> map;

    public ImmutableClass(Integer id, String name, HashMap<Integer, String> map) {
        this.id = id;
        this.name = name;
        this.map = new HashMap<Integer, String>(map);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer, String> getMap() {
        return (HashMap<Integer, String>) map.clone();
    }
}
