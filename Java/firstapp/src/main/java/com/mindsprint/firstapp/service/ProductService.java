package com.mindsprint.firstapp.service;

import com.mindsprint.firstapp.models.Product;

import java.util.List;

public interface ProductService {
    public boolean addProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(int id);
    public boolean deleteById(int id);
}
