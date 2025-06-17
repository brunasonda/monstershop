package com.femcoders.monstershop.services;

import com.femcoders.monstershop.dtos.review.ReviewResponse;
import com.femcoders.monstershop.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private  final ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public ReviewResponse addReview(ReviewRequest categoryRequest){
        Review newReview = ReviewMapper.dtoToEntity(categoryRequest);
        Review savedReview = ReviewRepository.save(newReview);
        return ReviewMapper.entityToDto(ReviewCategory);
    }

}
