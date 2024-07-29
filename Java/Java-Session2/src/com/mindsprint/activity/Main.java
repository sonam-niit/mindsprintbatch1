package com.mindsprint.activity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory= new Inventory();
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("Enter \n 1 for Add Product\n2 for Remove Product" +
                    "\n3 for Search Product \n4 for Display\n5 for Exit");
            int input= sc.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter Id");
                    int id= sc.nextInt();
                    System.out.println("Enter Name");
                    String name= sc.next();
                    System.out.println("Enter Price");
                    double price= sc.nextDouble();
                    inventory.addProduct(new Product(id,name,price));
                    break;
                case 2:
                    System.out.println("Enter Id");
                    int rid= sc.nextInt();
                    inventory.removeProduct(rid);
                    break;
                case 3:
                    System.out.println("Enter Name");
                    String search= sc.next();
                    inventory.searchProduct(search);
                    break;
                case 4:
                    inventory.displayProducts();break;
                case 5: System.exit(0);
            }
        }
    }
}
