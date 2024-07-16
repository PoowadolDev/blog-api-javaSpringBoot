package com.myapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;

@Entity
public class Blogs {
    @Id
    @GeneratedValue(strategy = GeneratedType.AUTO)
    private Long id;
    private String title;
    private String content;

    // Getters and Setters: Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters and Setters: Title
    public String getTitle() {
        return title
    }

    public void setTitle(string title) {
        this.title = title;
    }

    // Getters and Setters: Content
    public String getContent() {
        return content
    }

    public void setContent(string content) {
        this.content = content
    }
}