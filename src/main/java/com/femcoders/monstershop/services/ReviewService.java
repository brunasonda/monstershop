package com.femcoders.monstershop.services;
import com.femcoders.monstershop.repositories.ReviewRepository;
import org.springframework.stereotype.Service;
import com.femcoders.monstershop.models.Review;
import com.femcoders.monstershop.dtos.review.ReviewRequest;
import com.femcoders.monstershop.repositories.ProductRepository;
import com.femcoders.monstershop.models.Product;
import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final ProductRepository productRepository;

    public ReviewService(ReviewRepository reviewRepository, ProductRepository productRepository) {
        this.reviewRepository = reviewRepository;
        this.productRepository = productRepository;
    }

    public List<Review> getReviewsByProductId(Long productId) {
        return reviewRepository.findByProductId(productId);
    }

    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review saveReview(ReviewRequest reviewRequest) {
        Product product = productRepository.findById(reviewRequest.productId())
                .orElseThrow(() -> new RuntimeException("Produto no encontrado con ID: " + reviewRequest.productId()));

        Review review = new Review();
        review.setUsername(reviewRequest.username());
        review.setRating(reviewRequest.rating());
        review.setBody(reviewRequest.body());

        review.setProduct(product);

        return reviewRepository.save(review);

    }
}

