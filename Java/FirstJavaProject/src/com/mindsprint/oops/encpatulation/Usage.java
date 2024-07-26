package com.mindsprint.oops.encpatulation;

public class Usage {
    public static void main(String[] args) {
        Customer obj= new Customer();
        obj.setId(1); obj.setName("Sonam");obj.setEmail("sonam@gmail.com");
        obj.setAddess("Mumbai");

        System.out.println("Name: "+obj.getName());
    }
}
