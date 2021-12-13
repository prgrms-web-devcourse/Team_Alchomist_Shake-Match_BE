package com.shake_match.alchomist.ingredient.repository;

import com.shake_match.alchomist.ingredient.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    Optional<Ingredient> findByName(String name);
}
