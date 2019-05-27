package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("rvk");
        l.add("rk");
        l.add("rkv");
        l.add("rvki");
        l.add("rvkir");
        System.out.println(l);
        List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);

        //Count the character
        long count  = l.stream().filter(s->s.length()==5).count();
        System.out.println("Total Count:: "+count);

        List<String> l3=l.stream().sorted().collect(Collectors.toList());
        System.out.println("According to default natural sorting order:: "+l3);

        //List<String> l4  =l.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        List<String> l4  =l.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println("According to customize sorting order:: "+l4);

        //String min=l.stream().min((s1,s2) -> s1.compareTo(s2)).get();
        String min=l.stream().min(String::compareTo).get();
        System.out.println("minimum value is:"+min);

        //String max=l.stream().max((s1,s2) -> s1.compareTo(s2)).get();
        String max=l.stream().max(String::compareTo).get();
        System.out.println("Maximum_Value_is:: "+max);

    }
}
