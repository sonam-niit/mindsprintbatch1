package com.mindsprint.wrapper;

public class Demo {
    public static void main(String[] args) {
        int num=10;
        Integer number= num; //Autoboxing
        System.out.println(num+" "+number);

        int data= number; //Unboxing
    }
}
