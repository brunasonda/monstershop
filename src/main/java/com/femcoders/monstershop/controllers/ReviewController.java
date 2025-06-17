package com.femcoders.monstershop.controllers;

import com.femcoders.monstershop.services.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/api/reviews")
    public ResponseEntity<ReviewResponse> addCategory (@Valid @RequestBody ReviewRequest categoryRequest) {
        ReviewResponse newReview = reviewService.addReview(reviewRequest);
        return new ResponseEntity<>(newReview, HttpStatus.CREATED);
    }

}
