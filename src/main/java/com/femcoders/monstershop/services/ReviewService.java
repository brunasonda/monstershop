package com.femcoders.monstershop.services;
import com.femcoders.monstershop.repositories.ReviewRepository;
import org.springframework.stereotype.Service;
import com.femcoders.monstershop.models.Review;
import java.util.List;

@Service
public class ReviewService {
    private  final ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getReviewsByProductId(Long productId) {
            return reviewRepository.findByProductId(productId);
        }

    public Review addReview(Review review) {
            return reviewRepository.save(review);
    }
}
