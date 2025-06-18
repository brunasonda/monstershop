package com.femcoders.monstershop.dtos.review;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

public record ReviewRequest(
        Long id,
        Long productId,

        @NotBlank(message = "Name is required")
        @Size(min = 2, max = 50, message = "Name must contain mín 2 max 50 characters")
        String username,

        @Min(1)
        @Max(5)
        double rating,

        @NotBlank(message = "Body is required")
        String body
) {}