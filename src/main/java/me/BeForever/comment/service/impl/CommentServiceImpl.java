package me.BeForever.comment.service.impl;

import me.BeForever.comment.model.Comment;
import me.BeForever.comment.dao.CommentDao;
import me.BeForever.comment.service.CommentService;
import me.BeForever.user.model.User;
import me.BeForever.utils.IdGenerator;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.*;

import javax.annotation.Resource;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentDao commentDao;

    @Resource
    public void setCommentDao(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    private List<Comment> getChildrenManyGroup(List<Comment> list, String parent) {
        List<Comment> arr = new ArrayList<>();
        list.stream().filter(comment -> parent.equals(comment.getParent())).forEach(comment -> {
            comment.setComments(getChildrenManyGroup(list, comment.getId()));
            arr.add(comment);
        });
        return arr;
    }

    public Map<String, Object> listComment(Map<String, Object> parameter) {
        Integer index = (Integer) parameter.get("page");
        Integer size = (Integer) parameter.get("rows");
        int totalCount = commentDao.count(parameter);
        int totalPage = totalCount % size == 0 ? totalCount / size : totalCount / size + 1;
        int from = (index - 1) * size + 1;
        int to = index * size < totalCount ? index * size : totalCount;
        parameter.put("from", from);
        parameter.put("to", to);
        List<Comment> comments = commentDao.listComment(parameter);
        String guide = (String) parameter.get("guide");
        List<Comment> result = getChildrenManyGroup(comments, guide);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("list", result);
        dataMap.put("totalCount", totalCount);
        dataMap.put("totalPage", totalPage);
        dataMap.put("currentPage", index);
        return dataMap;

    }

    public void addComment(String content, int type, String parent,
                           User user) throws ParseException {
        String id = IdGenerator.getId();
        Comment comment = new Comment(id, new Date(), content, 0, 0, type, parent);
        comment.setUser(user);
        commentDao.addComment(comment);
    }

    public void deleteComment(String id) {
        commentDao.deleteComment(id);
    }
}
