package me.BeForever.Information.service.impl;

import me.BeForever.Information.dao.InformationDao;
import me.BeForever.Information.model.Information;
import me.BeForever.Information.service.InformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InformationServiceImpl implements InformationService {

    private InformationDao informationDao;

    @Resource
    public void setInformationDao(InformationDao informationDao) {
        this.informationDao = informationDao;
    }

    public Map<String, Object> listInformation(Map<String, Object> parameter) {
        Integer index = (Integer) parameter.get("page");
        Integer size = (Integer) parameter.get("rows");
        int totalCount = informationDao.count(parameter);
        int totalPage = totalCount % size == 0 ? totalCount / size : totalCount / size + 1;
        int from = (index - 1) * size;
        int to = index * size - 1 < totalCount ? index * size - 1 : totalCount;
        parameter.put("from", from);
        parameter.put("to", to);
        List<Information> informations = informationDao.listInformation(parameter);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("totalCount", totalCount);
        dataMap.put("totalPage", totalPage);
        dataMap.put("currentPage", index);
        dataMap.put("list", informations);
        return dataMap;
    }
}
