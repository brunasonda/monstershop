package com.femcoders.monstershop.controllers;

import com.femcoders.monstershop.services.ReviewService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
}
