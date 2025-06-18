package com.femcoders.monstershop.dtos.product;

import com.femcoders.monstershop.models.Product;

public class ProductMapper {

    public static Product dtoToEntity(ProductRequest dto, Product product) {
        return new Product(dto.id(), dto.price(), dto.price(), dto.imageUrl(), dto.rating(), dto.reviewCount(), dto.featured());
    }

    public static ProductResponse entityToDto(Product product) {
        return new ProductResponse(product.getId(),product.getName(),product.getPrice(),product.getImageUrl(),product.getRating(),product.getReviewCount(), product.isFeatured());
    }
}