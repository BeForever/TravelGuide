package me.BeForever.guide.service;

import me.BeForever.guide.model.Guide;

import java.util.Map;

public interface GuideService {

    Map<String, Object> listGuide(Map<String, Object> parameter);

    Guide getGuide(String id);
}
