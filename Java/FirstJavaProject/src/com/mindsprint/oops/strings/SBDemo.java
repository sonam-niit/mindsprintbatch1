package com.mindsprint.oops.strings;

public class SBDemo {
    public static void main(String[] args) {
//        StringBuilder sb= new StringBuilder("Hello World");
        StringBuffer sb= new StringBuffer("Hello World");
        System.out.println(sb.toString());
        sb.append(" Hello");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());

    }
}
