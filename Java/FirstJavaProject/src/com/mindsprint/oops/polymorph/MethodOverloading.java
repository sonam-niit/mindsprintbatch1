package com.mindsprint.oops.polymorph;

public class MethodOverloading {
    public int add(int a,int b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading m= new MethodOverloading();
        System.out.println(m.add(23,34));
        System.out.println(m.add(23.87,34.89));
        System.out.println(m.add(23.87f,34.89f));
    }
}
