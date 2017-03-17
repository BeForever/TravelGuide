package me.BeForever.guide.dao;

import me.BeForever.guide.model.Guide;

import java.util.List;
import java.util.Map;

public interface GuideDao {

    Guide getGuide(String id);

    List<Guide> listGuide(Map<String, Object> parameter);

    int count(Map<String,Object> parameter);

    void updateHit(String id);
}

