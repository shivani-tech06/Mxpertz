package com.inventorymanagement.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.inventorymanagement.entity.Product;
import com.inventorymanagement.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    public Product addProduct(Product product) {
        return repository.save(product);
    }


    public List<Product> getAllProducts() {
        return repository.findAll();
    }


    public Product updateQuantity(Long id, int quantity) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setQuantity(quantity);
        return repository.save(product);
    }


    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
