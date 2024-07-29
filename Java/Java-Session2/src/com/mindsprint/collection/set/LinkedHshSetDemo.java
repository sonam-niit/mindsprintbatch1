package com.mindsprint.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHshSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        set.add(10);
        set.add(80);
        set.add(30);
        set.add(20);
        set.add(null);
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
