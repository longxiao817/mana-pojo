package com.atguigu.mgt.manager.bean;

public class TGames {
    private Integer id;

    private String name;

    private String type;

    private Integer downloadnum;

    private Double score;

    private String imgurl;

    private String introduce;

    private String downloadurl;

    private String gameupdate;

    private Integer size;

    private String version;

    private Integer status;

    private String url;

    private String imgurls;

    private String tab;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getDownloadnum() {
        return downloadnum;
    }

    public void setDownloadnum(Integer downloadnum) {
        this.downloadnum = downloadnum;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl == null ? null : downloadurl.trim();
    }

    public String getGameupdate() {
        return gameupdate;
    }

    public void setGameupdate(String gameupdate) {
        this.gameupdate = gameupdate == null ? null : gameupdate.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getImgurls() {
        return imgurls;
    }

    public void setImgurls(String imgurls) {
        this.imgurls = imgurls == null ? null : imgurls.trim();
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab == null ? null : tab.trim();
    }

    @Override
    public String toString() {
        return "TGames [id=" + id + ", name=" + name + ", type=" + type + ", downloadnum=" + downloadnum + ", score="
                + score + ", imgurl=" + imgurl + ", introduce=" + introduce + ", downloadurl=" + downloadurl
                + ", gameupdate=" + gameupdate + ", size=" + size + ", version=" + version + ", status=" + status
                + ", url=" + url + ", imgurls=" + imgurls + ", tab=" + tab + "]";
    }

    
}