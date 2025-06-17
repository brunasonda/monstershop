package com.femcoders.monstershop.controllers;
import com.femcoders.monstershop.models.Review;
import com.femcoders.monstershop.models.Product;
import com.femcoders.monstershop.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/api/reviews/{productId}")
        public ResponseEntity<List<Review>> getReviewsByProductId(@PathVariable Long productId) {
            return ResponseEntity.ok(reviewService.getReviewsByProductId(productId));
        }

    @PostMapping("/api/reviews")
    public ResponseEntity<Review> addReview(@RequestBody Review review) {
        Review savedReview = reviewService.addReview(review);
        return new ResponseEntity<>(savedReview, HttpStatus.CREATED);
    }
}