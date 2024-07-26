package com.mindsprint.oops.abstraction;

public class Usage {
    public static void main(String[] args) {
        //annonymous Inner class Impl
        Demo d= new Demo() {
            @Override
            public void myDream() {
                System.out.println("Test Test");
            }
        };
        d.myDream();
    }
}
