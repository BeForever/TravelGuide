package me.BeForever.index.service;

import me.BeForever.guide.model.Guide;

import java.util.List;

public interface IndexService {

    List<Guide> listPictures();

    List<Guide> top3Guide();

    List<Guide> random3Guide();
}
