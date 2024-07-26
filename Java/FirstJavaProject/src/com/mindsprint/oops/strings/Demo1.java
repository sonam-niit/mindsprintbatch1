package com.mindsprint.oops.strings;

public class Demo1 {
    public static void main(String[] args) {
        String s1= "Hello World";
        String s2= "Hello World";
        System.out.println(s1==s2);//true
        String s3= new String("Hello World");
        String s4= new String("Hello World");
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true
        System.out.println(s3.equalsIgnoreCase("HELLO WORLD"));//true
        System.out.println(s3.contains("Hello"));
        System.out.println("String length: "+s3.length());

    }
}
