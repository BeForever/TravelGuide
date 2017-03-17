package me.BeForever.comment.dao;

import me.BeForever.comment.model.Comment;

import java.util.List;
import java.util.Map;

public interface CommentDao {

    List<Comment> listComment(Map<String, Object> parameter);

    int count(Map<String, Object> parameter);

    void addComment(Comment comment);

    void deleteComment(String id);
}

