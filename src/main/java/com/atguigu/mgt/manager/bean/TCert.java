package com.atguigu.mgt.manager.bean;

public class TCert {
    private Integer id;

    private String certName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName == null ? null : certName.trim();
    }
}