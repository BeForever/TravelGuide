package me.BeForever.Information.model;

import java.util.Date;

public class Information {

    private String id;//资讯主键id
    private Date time;//资讯时间
    private String title;//资讯标题
    private String content;//内容
    private String source;//单位

    public Information() {

    }

    public Information(String id,Date time, String title, String content, String source) {
        this.id = id;
        this.time = time;
        this.title = title;
        this.content = content;
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

