package com.mindsprint.exception;

import java.util.Scanner;

public class TryWithRec {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num1= sc.nextInt();
            int num2= sc.nextInt();
            System.out.println(num1/num2);
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
        //Scanner object close automatically
    }
}
