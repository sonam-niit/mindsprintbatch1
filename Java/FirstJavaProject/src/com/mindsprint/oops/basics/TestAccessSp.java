package com.mindsprint.oops.basics;

public class TestAccessSp {
    public static void main(String[] args) {
        AccessSpecifier obj= new AccessSpecifier();
        System.out.println("default "+ obj.num1);
        //System.out.println("Private "+ obj.num2);//private is not
        //accessible outside the class
        System.out.println("Public "+ obj.num3);
        System.out.println("Protected "+ obj.num4);
    }
}
