package com.femcoders.monstershop.dtos.product;

public record ProductResponse(
        Long id,
        String name,
        double price,
        String imageUrl,
        double rating,
        int reviewCount,
        boolean featured
) {
}

