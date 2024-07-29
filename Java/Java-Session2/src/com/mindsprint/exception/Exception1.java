package com.mindsprint.exception;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        try{
            double result= num1/num2;
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){
            System.out.println("Error occured: "+e.getMessage());
            e.printStackTrace();
        }finally {
            sc.close();
            System.out.println("Scanner Closed");
        }

    }
}
