package com.hxd.aoptest.model;

import java.util.Date;

public class Img {
    private Long id;

    private String camera;

    private String utcCreateTime;

    private Date createTime;

    private String imageUrl;

    private String photoName;

    private String author;

    private String country;

    private String coverUrl;

    private Date rksj;

    private String coverUrlLocal;

    private String smallUrlLocal;

    private String des;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera == null ? null : camera.trim();
    }

    public String getUtcCreateTime() {
        return utcCreateTime;
    }

    public void setUtcCreateTime(String utcCreateTime) {
        this.utcCreateTime = utcCreateTime == null ? null : utcCreateTime.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName == null ? null : photoName.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl == null ? null : coverUrl.trim();
    }

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    public String getCoverUrlLocal() {
        return coverUrlLocal;
    }

    public void setCoverUrlLocal(String coverUrlLocal) {
        this.coverUrlLocal = coverUrlLocal == null ? null : coverUrlLocal.trim();
    }

    public String getSmallUrlLocal() {
        return smallUrlLocal;
    }

    public void setSmallUrlLocal(String smallUrlLocal) {
        this.smallUrlLocal = smallUrlLocal == null ? null : smallUrlLocal.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    @Override
    public String toString() {
        return "Img{" +
                "id=" + id +
                ", camera='" + camera + '\'' +
                ", utcCreateTime='" + utcCreateTime + '\'' +
                ", createTime=" + createTime +
                ", imageUrl='" + imageUrl + '\'' +
                ", photoName='" + photoName + '\'' +
                ", author='" + author + '\'' +
                ", country='" + country + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                ", rksj=" + rksj +
                ", coverUrlLocal='" + coverUrlLocal + '\'' +
                ", smallUrlLocal='" + smallUrlLocal + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}