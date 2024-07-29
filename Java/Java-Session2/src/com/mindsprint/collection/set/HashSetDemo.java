package com.mindsprint.collection.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(10);
        set.add(80);
        set.add(30);
        set.add(20);
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
