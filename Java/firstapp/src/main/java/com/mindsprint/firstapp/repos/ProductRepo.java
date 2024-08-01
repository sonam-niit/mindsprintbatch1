package com.mindsprint.firstapp.repos;

import com.mindsprint.firstapp.models.Product;

import java.util.List;

public interface ProductRepo {

    public boolean addProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(int id);
    public boolean deleteById(int id);
}
