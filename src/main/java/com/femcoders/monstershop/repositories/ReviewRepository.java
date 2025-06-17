package com.femcoders.monstershop.repositories;
import com.femcoders.monstershop.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findByName(String reviewName);
    List<Review> findByProductId(Long productId);
}

