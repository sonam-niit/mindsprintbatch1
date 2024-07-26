package com.mindsprint.oops.basics;

public class AccessSpecifier {
    int num1=10; //default
    private int num2=20;
    public int num3=30;
    protected int num4=40;

    public static void main(String[] args) {
        AccessSpecifier obj= new AccessSpecifier();
        System.out.println("default "+ obj.num1);
        System.out.println("Private "+ obj.num2);
        System.out.println("Public "+ obj.num3);
        System.out.println("Protected "+ obj.num4);
    }

}
