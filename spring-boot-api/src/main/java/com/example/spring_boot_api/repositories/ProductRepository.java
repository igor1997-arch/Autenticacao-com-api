package com.example.spring_boot_api.repositories;

import com.example.spring_boot_api.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {

}
