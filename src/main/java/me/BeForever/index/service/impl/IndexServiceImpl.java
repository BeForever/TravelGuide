package me.BeForever.index.service.impl;

import me.BeForever.guide.model.Guide;
import me.BeForever.index.dao.IndexDao;
import me.BeForever.index.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    private IndexDao indexDao;

    @Resource
    public void setIndexDao(IndexDao indexDao) {
        this.indexDao = indexDao;
    }

    public List<Guide> listPictures() {
        return indexDao.listPictures();
    }

    public List<Guide> top3Guide() {
        return indexDao.top3Guide();
    }

    public List<Guide> random3Guide() {
        return indexDao.random3Guide();
    }
}
