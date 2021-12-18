package com.shake_match.alchomist.review.repository;

import com.shake_match.alchomist.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("select r from reviews r where r.cocktailId=:cocktailId")
    List<Review> findByCocktailId(@Param("cocktailId") Long cocktailId);
}
