package me.BeForever.index.controller;

import me.BeForever.guide.model.Guide;
import me.BeForever.utils.Result;
import me.BeForever.index.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {

    private IndexService indexService;

    @Resource
    public void setIndexService(IndexService indexService) {
        this.indexService = indexService;
    }

    @RequestMapping("contact")
    public ModelAndView contact() {
        return new ModelAndView("contact");
    }

    @RequestMapping("initPictures")
    @ResponseBody
    public List<Guide> initSliderPictures() {
        return indexService.listPictures();
    }

    @RequestMapping("top3GuideResult")
    @ResponseBody
    public List top3GuideResult() {
        return indexService.top3Guide();
    }

    @RequestMapping("random3GuideResult")
    @ResponseBody
    public List random3GuideResult() {
        return indexService.random3Guide();
    }

    @RequestMapping("contactResult")
    @ResponseBody
    public Result contactResult(){
        return new Result(true,"感谢您的反馈");
    }
}
