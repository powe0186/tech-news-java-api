package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String commentText;
    private Integer userId;
    private Integer postId;

    public Comment() {
    }

    public Comment(Integer id, String commentText, Integer userId, Integer postId) {
        Id = id;
        this.commentText = commentText;
        this.userId = userId;
        this.postId = postId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(Id, comment.Id) &&
                Objects.equals(commentText, comment.commentText) &&
                Objects.equals(userId, comment.userId) &&
                Objects.equals(postId, comment.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, commentText, userId, postId);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "Id=" + Id +
                ", commentText='" + commentText + '\'' +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
