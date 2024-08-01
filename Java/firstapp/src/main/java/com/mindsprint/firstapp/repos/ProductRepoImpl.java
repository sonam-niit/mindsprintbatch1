package com.mindsprint.firstapp.repos;

import com.mindsprint.firstapp.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepoImpl implements ProductRepo{


    List<Product> list= new ArrayList<>();

    @Override
    public boolean deleteById(int id) {
        boolean flag=false;
        for(Product p:list){
            if(p.getId()==id){
                flag=true;
                list.remove(p);
                break;
            }
        }
        return flag;
    }
    @Override
    public Product getProductById(int id) {
        Product found=null;
        for(Product p:list){
            if(p.getId()==id){
                found=p; break;
            }
        }
        return  found;
    }
    @Override
    public boolean addProduct(Product product) {
        list.add(product);
        return  true;
    }

    @Override
    public List<Product> getAllProducts() {
        return list;
    }
}
