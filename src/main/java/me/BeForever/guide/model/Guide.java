package me.BeForever.guide.model;

import java.util.Date;

public class Guide {

    private String id;
    private String name;
    private String address;
    private String outline;
    private String tel;
    private String openTime;
    private String closeTime;
    private String history;
    private String features;
    private String pictures;
    private int hit;

    public Guide() {

    }

    public Guide(String id, String name, String address, String outline, String tel, String openTime, String closeTime, String history, String features, String pictures) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.outline = outline;
        this.tel = tel;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.history = history;
        this.features = features;
        this.pictures = pictures;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}
