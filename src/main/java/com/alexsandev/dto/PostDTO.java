package com.alexsandev.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.alexsandev.domain.Post;

public class PostDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private LocalDateTime date;
    private String title;
    private String body;
    private AuthorDTO author;
    
    public PostDTO() {
    }

    public PostDTO(Post post) {
        this.id = post.getId();
        this.date = post.getDate();
        this.title = post.getTitle();
        this.body = post.getBody();
        this.author = post.getAuthor();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public AuthorDTO getAuthor() {
        return author;
    }
}
