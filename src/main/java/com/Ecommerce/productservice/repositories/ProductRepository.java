package com.Ecommerce.productservice.repositories;

import com.Ecommerce.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
