package com.femcoders.monstershop.dtos.product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public record ProductRequest(
        Long id,
        @NotBlank(message = "Name is required")
        @Size(min = 2, max = 50, message = "Name must contain mín 2 max 50 characters")
        String name,
        @NotBlank(message = "Price is required")
        double price,
        @NotBlank(message = "Image URL is required")
        String imageUrl,
        double rating,
        int reviewCount,
        boolean featured
) {
}
