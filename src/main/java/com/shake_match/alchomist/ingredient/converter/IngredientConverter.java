package com.shake_match.alchomist.ingredient.converter;

import com.shake_match.alchomist.ingredient.Ingredient;
import com.shake_match.alchomist.ingredient.dto.request.IngredientDetailRequest;
import com.shake_match.alchomist.ingredient.dto.response.IngredientResponse;
import org.springframework.stereotype.Component;

@Component
public class IngredientConverter {

    public Ingredient converterIngredient(IngredientDetailRequest request) { // dto -> entity
        return Ingredient.builder()
                .id(request.getIngredientId())
                .name(request.getIngredientName())
                .cocktails(request.getCocktails())
                .build();
    }

    // entity -> dto
    public IngredientResponse converterIngredientResponse(Ingredient ingredient){
        return new IngredientResponse(ingredient.getName());
    }

}
