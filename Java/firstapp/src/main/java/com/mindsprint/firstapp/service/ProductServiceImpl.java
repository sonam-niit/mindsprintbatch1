package com.mindsprint.firstapp.service;

import com.mindsprint.firstapp.models.Product;
import com.mindsprint.firstapp.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo repo;
    @Override
    public boolean addProduct(Product product) {
        return repo.addProduct(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.getAllProducts();
    }

    @Override
    public Product getProductById(int id) {
        return repo.getProductById(id);
    }
    @Override
    public boolean deleteById(int id) {
        return repo.deleteById(id);
    }

}
