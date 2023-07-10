package com.geekster.Ecommercegeekster.project.service;

import com.geekster.Ecommercegeekster.project.model.Category;
import com.geekster.Ecommercegeekster.project.model.Product;
import com.geekster.Ecommercegeekster.project.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    // To return all the products
    public Map<Integer, Product> getAllProducts() {
        return productRepo.getProductList();
    }

    // To return all the products below a certain price
    public List<Product> getProductsBelowPrice(Double price) {
        List<Product> productList = new ArrayList<>();
        for( Integer id  : productRepo.getProductList().keySet()){
            if(productRepo.getProductList().get(id).getProductPrice() <= price){
                productList.add(productRepo.getProductList().get(id));
            }
        }
        return productList;
    }

    // To add a list of products
    public String addProducts(List<Product> products) {
        for(Product product : products){
            Integer productId = product.getProductId();
            productRepo.getProductList().put(productId, product);
        }
        return "Products have been added!";
    }

//    public String addProducts(List<Product> products){
//        Map<Integer, Product> productList = getAllProducts();
//        for(Product product : products){
//            productList.put(product.getProductId(), product);
//        }
//        return "products are added !";
//    }

    // Business Logic to add a single product
    public String addOneProduct(Product product) {
        productRepo.getProductList().put(product.getProductId(), product);
        return "Product has been added! Thanks";
    }

    // Business Logic to get products of a certain category
    public List<Product> getProductsOfCategory(Category category) {
        List<Product> productList = new ArrayList<>();
        Map<Integer, Product> product = productRepo.getProductList();
        for (Integer id : product.keySet()){
            if(product.get(id).getProductCategory().equals(category)){
                productList.add(product.get(id));
            }
        }
        return productList;
    }

    public String deleteProduct(Integer productId) {
        productRepo.getProductList().remove(productId);
        return "product has been removed from the map";
    }

    public String editProduct(Category category, Integer discount) {
        Map<Integer, Product> products = productRepo.getProductList();
        for(Integer productId : products.keySet()){
            if(products.get(productId).getProductCategory().equals(category)){
                Double actualPrice = products.get(productId).getProductPrice();
                Double discountedPrice = actualPrice - (actualPrice * (discount/100.0));
                products.get(productId).setProductPrice(discountedPrice);
            }
        }
        return "discount has been made to all the products of category:"+ category;
    }
}
