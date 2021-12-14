package com.shake_match.alchomist.users.dto.request;

import lombok.Getter;

@Getter
public class UserRequest {

    private String email;

    private String nickname;

    private String imageUrl;

    private boolean isMan;

    private int age;

    private String mbti;

    public UserRequest(String email, String nickname, String imageUrl, boolean isMan, int age,
                       String mbti) {
        this.email = email;
        this.nickname = nickname;
        this.imageUrl = imageUrl;
        this.isMan = isMan;
        this.age = age;
        this.mbti = mbti;
    }
}
