package com.femcoders.monstershop.dtos.review;

public record ReviewResponse(
        Long id,
        Long productId,
        String username,
        double rating,
        String body
) {
}
