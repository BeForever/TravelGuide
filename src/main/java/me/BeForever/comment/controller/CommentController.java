package me.BeForever.comment.controller;

import me.BeForever.comment.service.CommentService;

import me.BeForever.user.model.User;
import me.BeForever.utils.Result;
import me.BeForever.utils.StringUtils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CommentController {

    private CommentService commentService;

    @Resource
    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @RequestMapping("comment")
    public ModelAndView comment() {
        return new ModelAndView("comment/comment");
    }


    @RequestMapping("commentQueryResult")
    @ResponseBody
    public Map commentQueryResult(int page, int rows, String guide) {
        Map<String, Object> parameter = new HashMap<>();
        parameter.put("page", page);
        parameter.put("rows", rows);
        if (StringUtils.isNotEmpty(guide)) {
            parameter.put("guide", guide);
        }
        return commentService.listComment(parameter);
    }


    @RequestMapping("commentInsertResult")
    @ResponseBody
    public Result commentInsertResult(String content, int type, String parent, HttpServletRequest request) {
        try {
            commentService.addComment(content, type, parent, (User)request.getSession().getAttribute("user"));
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "评论失败");
        }
        return new Result(true, "");
    }

    @RequestMapping("commentDeleteResult")
    @ResponseBody
    public Result commentDeleteResult(String id) {
        try {
            commentService.deleteComment(id);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
        return new Result(true, "");
    }
}
