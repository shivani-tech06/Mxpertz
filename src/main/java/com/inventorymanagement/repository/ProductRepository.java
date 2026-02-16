package com.inventorymanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.inventorymanagement.entity.Product;




public interface ProductRepository extends JpaRepository<Product, Long> {
}