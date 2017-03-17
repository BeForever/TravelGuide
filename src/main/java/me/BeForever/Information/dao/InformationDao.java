package me.BeForever.Information.dao;

import me.BeForever.Information.model.Information;

import java.util.List;
import java.util.Map;

public interface InformationDao {

    List<Information> listInformation(Map<String, Object> map);

    int count(Map<String,Object> parameter);
}

