package com.mindsprint.activity;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Product> products;
    public Inventory(){
        products= new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product Added successfully");
    }
    public  void displayProducts(){
        for(Product p:products){
            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
        }
    }
    public  void removeProduct(int id){
        boolean found=false;
        for(Product p:products){
            if(p.getId()==id){
                found=true;
                products.remove(p);
                System.out.println("Product Removed");
                break;
            }
        }
        if(!found)
            System.out.println("No Product found to delete");
    }
    public  void searchProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name))
                System.out.println(p);
        }
    }
}
