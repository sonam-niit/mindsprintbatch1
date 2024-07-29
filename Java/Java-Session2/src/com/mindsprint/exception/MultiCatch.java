package com.mindsprint.exception;

import java.util.Scanner;

public class MultiCatch {

    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,90};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any index number to access");
        try {
            int index = sc.nextInt();
            System.out.println(arr[index]);
            System.out.println("Enter any number");
            String data = sc.next();
            int number = Integer.parseInt(data);
            System.out.println("Number: " + number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Error: "+e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Number Format: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("General Exception: "+e.getMessage());
        }

    }
}
