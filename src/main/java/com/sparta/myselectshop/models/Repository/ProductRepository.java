package com.sparta.myselectshop.models.Repository;

import com.sparta.myselectshop.models.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}