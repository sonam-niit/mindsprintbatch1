package com.mindsprint.firstapp.controller;

import com.mindsprint.firstapp.models.Product;
import com.mindsprint.firstapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/api/product")
    public List<Product> getAllProducts(){
        return  service.getAllProducts();
    }
    @GetMapping("/api/product/{id}")
    public Object getProductByID(@PathVariable int id){
        Product p=  service.getProductById(id);
        if(p!=null){
            return  p;
        }else{
            return "No Data Found";
        }
    }
    @DeleteMapping("/api/product/{id}")
    public Object deleteProductByID(@PathVariable int id){
        if(service.deleteById(id)){
            return  "Product Deleted";
        }else{
            return "No Data Found to delete";
        }
    }
    @PostMapping("/api/product")
    public boolean addProduct(@RequestBody Product product){
        return  service.addProduct(product);
    }

}
