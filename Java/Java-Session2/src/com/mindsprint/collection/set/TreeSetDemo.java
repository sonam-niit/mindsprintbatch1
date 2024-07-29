package com.mindsprint.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set= new TreeSet<>();
        set.add(10);
        set.add(80);
        set.add(30);
        set.add(20);
//        set.add(null); //Not allowed in TreeSet
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
