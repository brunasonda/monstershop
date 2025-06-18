package com.femcoders.monstershop.dtos.review;

import com.femcoders.monstershop.models.Review;
import com.femcoders.monstershop.models.Product;

public class ReviewMapper {

    public static Review dtoToEntity(ReviewRequest dto, Product product) {
        Review review = new Review();
        review.setId(dto.id());
        review.setUsername(dto.username());
        review.setRating(dto.rating());
        review.setBody(dto.body());
        review.setProduct(product);
        return review;
    }

    public static ReviewResponse entityToDto(Review review) {
        return new ReviewResponse(
                review.getId(),
                review.getProduct().getId(),
                review.getUsername(),
                review.getRating(),
                review.getBody()
        );
    }
}