package com.atguigu.mgt.manager.bean;

public class TUserRole {
    private Integer id;

    private Integer userid;

    private Integer roleid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
    
    public TUserRole() {
    }

    public TUserRole(Integer userid, Integer roleid) {
        super();
        this.userid = userid;
        this.roleid = roleid;
    }
    
    
}