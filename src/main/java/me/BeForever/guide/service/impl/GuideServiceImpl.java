package me.BeForever.guide.service.impl;

import me.BeForever.guide.dao.GuideDao;
import me.BeForever.guide.model.Guide;
import me.BeForever.guide.service.GuideService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GuideServiceImpl implements GuideService {

    private GuideDao guideDao;

    @Resource
    public void setGuideDao(GuideDao guideDao) {
        this.guideDao = guideDao;
    }

    public Map<String, Object> listGuide(Map<String, Object> parameter) {
        Integer index = (Integer) parameter.get("page");
        Integer size = (Integer) parameter.get("rows");
        int totalCount = guideDao.count(parameter);
        int totalPage = totalCount % size == 0 ? totalCount / size : totalCount / size + 1;
        int from = (index - 1) * size + 1;
        int to = index * size < totalCount ? index * size : totalCount;
        parameter.put("from", from);
        parameter.put("to", to);
        List<Guide> guides = guideDao.listGuide(parameter);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("totalCount", totalCount);
        dataMap.put("totalPage", totalPage);
        dataMap.put("currentPage", index);
        dataMap.put("list", guides);
        return dataMap;
    }

    public Guide getGuide(String id) {
        guideDao.updateHit(id);
        return guideDao.getGuide(id);
    }
}
