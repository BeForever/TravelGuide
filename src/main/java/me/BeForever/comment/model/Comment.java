package me.BeForever.comment.model;

import java.util.Date;
import java.util.List;

import me.BeForever.user.model.User;

public class Comment {

    private String id;
    private Date time;
    private String content;
    private int approval;
    private int disapproval;
    private int type;

    private String parent;
    private List<Comment> comments;

    private User user;

    public Comment() {

    }

    public Comment(String id, Date time, String content, int approval, int disapproval, int type, String parent) {
        this.id = id;
        this.time = time;
        this.content = content;
        this.approval = approval;
        this.disapproval = disapproval;
        this.type = type;
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getApproval() {
        return approval;
    }

    public void setApproval(int approval) {
        this.approval = approval;
    }

    public int getDisapproval() {
        return disapproval;
    }

    public void setDisapproval(int disapproval) {
        this.disapproval = disapproval;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
