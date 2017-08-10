package com.atguigu.mgt.manager.bean;

import java.util.Date;

public class TComentar {
    private Integer id;

    private String usercomentar;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsercomentar() {
        return usercomentar;
    }

    public void setUsercomentar(String usercomentar) {
        this.usercomentar = usercomentar == null ? null : usercomentar.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}