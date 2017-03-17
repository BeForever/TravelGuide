package me.BeForever.Information.controller;

import me.BeForever.Information.service.InformationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class InformationController {

    private InformationService informationService;

    @Resource
    public void setInformationService(InformationService informationService) {
        this.informationService = informationService;
    }

    @RequestMapping("informationQueryResult")
    @ResponseBody
    public Map informationQueryResult(int page, int rows, String guide) {
        Map<String, Object> parameter = new HashMap<>();
        parameter.put("page", page);
        parameter.put("rows", rows);
        parameter.put("guide", guide);
        return informationService.listInformation(parameter);
    }

}
