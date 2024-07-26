package com.mindsprint.oops.exception;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        try {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter 2 numbers");
            int num1=sc.nextInt();
            int num2= sc.nextInt();

            double result= num1/num2;
            System.out.println("Result: "+result);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
