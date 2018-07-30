package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String userName;

    public ForumUser(){
        userName = "JohnDoe";
    }

    public String getUserName() {
        return userName;
    }
}
