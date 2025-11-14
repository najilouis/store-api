package com.najilouis.store_api.repositories;

import com.najilouis.store_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}