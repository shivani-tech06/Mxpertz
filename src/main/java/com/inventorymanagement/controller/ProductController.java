package com.inventorymanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.inventorymanagement.entity.Product;
import com.inventorymanagement.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;


    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }


    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }


    @PutMapping("/{id}")
    public Product updateQuantity(@PathVariable Long id,
                                  @RequestParam int quantity) {
        return service.updateQuantity(id, quantity);
    }


    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
        return "Product deleted successfully!";
    }
}
