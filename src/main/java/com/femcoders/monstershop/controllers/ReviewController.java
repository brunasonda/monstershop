package com.femcoders.monstershop.controllers;
import com.femcoders.monstershop.models.Review;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.femcoders.monstershop.dtos.review.ReviewRequest;
import com.femcoders.monstershop.services.ReviewService;

import java.util.List;

@RestController
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/api/reviews/{productId}")
    public ResponseEntity<List<Review>> getReviewsByProductId(@PathVariable("productId") Long productId) {
        return ResponseEntity.ok(reviewService.getReviewsByProductId(productId));
    }

    @PostMapping("/api/reviews")
    public ResponseEntity<Review> addReview(@RequestBody ReviewRequest reviewRequest) {
        Review savedReview = reviewService.saveReview(reviewRequest);
        return new ResponseEntity<>(savedReview, HttpStatus.CREATED);
    }
}