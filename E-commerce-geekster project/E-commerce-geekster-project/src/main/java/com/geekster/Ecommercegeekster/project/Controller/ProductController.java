package com.geekster.Ecommercegeekster.project.Controller;


import com.geekster.Ecommercegeekster.project.model.Category;
import com.geekster.Ecommercegeekster.project.model.Product;
import com.geekster.Ecommercegeekster.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    ProductService productService ;

    // To fetch All the products
    @GetMapping("products")
    public Map<Integer, Product> getAllProducts(){
        return productService.getAllProducts();
    }

    // To fetch all the products that are below a certain price
    @GetMapping("products/price/{price}")
    public List<Product> getProductsBelowPrice(@PathVariable Double price){
        return productService.getProductsBelowPrice(price);
    }

    // To add a list of products in the map
    @PostMapping("products")
    public String addProducts(@RequestBody List<Product> products){
        return productService.addProducts(products);
    }

    // To add a single product
    @PostMapping("one/product")
    public String addOneProduct(@RequestBody Product product){
        return productService.addOneProduct(product);
    }

    // To fetch all the products that are of a certain category
    @GetMapping("products/category/{category}")
    public List<Product> getProductsOfCategory(@PathVariable Category category){
        return productService.getProductsOfCategory(category);
    }

    @DeleteMapping("product/{productId}")
    public String deleteProduct(@PathVariable Integer productId){
        return productService.deleteProduct(productId);
    }

    @PutMapping("product/category/{category}/discount/{discount}")
    public String editProduct(@PathVariable Category category, @PathVariable Integer discount){
        return productService.editProduct(category, discount);
    }

}
