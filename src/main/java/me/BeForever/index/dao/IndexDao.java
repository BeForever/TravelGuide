package me.BeForever.index.dao;

import me.BeForever.guide.model.Guide;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexDao {

    List<Guide> listPictures();

    List<Guide> top3Guide();

    List<Guide> random3Guide();
}
