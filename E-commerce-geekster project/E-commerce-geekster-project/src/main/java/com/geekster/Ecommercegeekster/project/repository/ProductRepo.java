package com.geekster.Ecommercegeekster.project.repository;

import com.geekster.Ecommercegeekster.project.Controller.ProductController;
import com.geekster.Ecommercegeekster.project.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepo {
    @Autowired
    Map<Integer, Product> products;

    public Map<Integer, Product> getProductList(){
        return products;
    }
}
