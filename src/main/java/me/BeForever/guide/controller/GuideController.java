package me.BeForever.guide.controller;

import me.BeForever.guide.model.Guide;
import me.BeForever.utils.StringUtils;
import me.BeForever.guide.service.GuideService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class GuideController {

    private GuideService guideService;

    @Resource
    public void setGuideService(GuideService guideService) {
        this.guideService = guideService;
    }

    @RequestMapping("guideDetail")
    public ModelAndView guideDetail(String id) {
        ModelAndView modelAndView = new ModelAndView("guide/guideDetail");
        Guide guide = guideService.getGuide(id);
        modelAndView.addObject("guide", guide);
        return modelAndView;
    }

    @RequestMapping("guideList")
    public ModelAndView guideList() {
        return new ModelAndView("guide/guideList");
    }

    @RequestMapping("guideListResult")
    @ResponseBody
    public Map guideListResult(int page, int rows, String name) {
        System.out.println("page"+page);
        System.out.println("rows"+rows);
        System.out.println("name"+name);
        Map<String, Object> parameter = new HashMap<>();
        parameter.put("page", page);
        parameter.put("rows", rows);
        if (StringUtils.isNotEmpty(name)) {
            parameter.put("name", name);
        }
        return guideService.listGuide(parameter);
    }
}
