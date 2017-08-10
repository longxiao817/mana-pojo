package com.atguigu.mgt.manager.bean;

import java.util.Date;

public class TReply {
    private Integer id;

    private Integer comentarid;

    private String content;

    private Date time;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComentarid() {
        return comentarid;
    }

    public void setComentarid(Integer comentarid) {
        this.comentarid = comentarid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}