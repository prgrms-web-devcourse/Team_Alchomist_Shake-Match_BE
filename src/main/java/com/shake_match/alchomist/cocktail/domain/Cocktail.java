package com.shake_match.alchomist.cocktail.domain;

import com.shake_match.alchomist.global.BaseEntity;
import com.shake_match.alchomist.review.Review;
import com.shake_match.alchomist.theme.domain.Theme;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity(name = "cocktails")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Cocktail extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    List<Volume> volumes = new ArrayList<>();

    @OneToMany
    List<Theme> themes = new ArrayList<>();

    @OneToMany(mappedBy = "cocktails")
    List<Review> reviews = new ArrayList<>();

    @Column
    String recipe; //TODO: 프론트와 recipe의 상세 확인해보기

    @Column
    String imageUrl;

    @Column
    String youtubeLink;

    @Column
    int likes;

    @Column
    float totalRating;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public int getLikes() {
        return likes;
    }

    public float getTotalRating() {
        return totalRating;
    }

    public Cocktail(String name, String recipe, String imageUrl, String youtubeLink, List<Theme> themes, List<Volume> volumes) {
        this.name = name;
        this.recipe = recipe;
        this.imageUrl = imageUrl;
        this.youtubeLink = youtubeLink;
        this.themes = themes;
        this.volumes = volumes;
        this.likes = 0;
        this.totalRating = 0;
    }

    public void addThemes(Theme theme) {
        themes.add(theme);
    }

    public void addLikes(Boolean bool){
        if(bool){
            likes++;
        }
        else{
            likes--;
        }
    }
}
