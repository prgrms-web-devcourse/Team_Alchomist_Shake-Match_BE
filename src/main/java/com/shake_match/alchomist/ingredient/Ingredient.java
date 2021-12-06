package com.shake_match.alchomist.ingredient;

import com.shake_match.alchomist.cocktail.Cocktail;
import com.shake_match.alchomist.global.BaseEntity;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "ingredients")
public class Ingredient extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String imageUrl;

    @Column(nullable = false)
    String buyingUrl;

    @OneToMany
    List<Cocktail> cocktails = new ArrayList<>();
}
