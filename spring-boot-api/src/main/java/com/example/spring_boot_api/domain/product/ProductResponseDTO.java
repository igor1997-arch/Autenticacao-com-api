package com.example.spring_boot_api.domain.product;

public record ProductResponseDTO(String id, String name, Integer price) {
    return ProductResponseDTO(Product product){this(product.getId(), product.getName(), product.getPrice());}

}
