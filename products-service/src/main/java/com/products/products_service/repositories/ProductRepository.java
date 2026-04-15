package com.products.products_service.repositories;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.products_service.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

  boolean existsBySku(String sku);

  Page<Product> findByNameContainingIgnoreCase(String name, Pageable pageable);

  Page<Product> findBySku(String sku, Pageable pageable);
}
