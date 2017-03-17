package me.BeForever.comment.service;

import me.BeForever.user.model.User;

import java.text.ParseException;
import java.util.Map;

public interface CommentService {

    Map<String, Object> listComment(Map<String, Object> parameter);

    void addComment(String content, int type, String parent, User user) throws ParseException;

    void deleteComment(String id);
}
