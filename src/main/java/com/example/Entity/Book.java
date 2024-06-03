package com.example.Entity;

public class Book {
    private Integer id;
    private String name;
    private String url;
    private String catename;  //所属分类
    private Double price;
    private Double intro;  //推荐值
    private String jianjie;
    private Integer islike;  //判断是否加入书架
    private Integer time;

    public Book() {
    }

    public Book(Integer id, String name, String url, String catename, Double price, Double intro, String jianjie, Integer islike, Integer time) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.catename = catename;
        this.price = price;
        this.intro = intro;
        this.jianjie = jianjie;
        this.islike = islike;
        this.time = time;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取
     * @return catename
     */
    public String getCatename() {
        return catename;
    }

    /**
     * 设置
     * @param catename
     */
    public void setCatename(String catename) {
        this.catename = catename;
    }

    /**
     * 获取
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return intro
     */
    public Double getIntro() {
        return intro;
    }

    /**
     * 设置
     * @param intro
     */
    public void setIntro(Double intro) {
        this.intro = intro;
    }

    /**
     * 获取
     * @return jianjie
     */
    public String getJianjie() {
        return jianjie;
    }

    /**
     * 设置
     * @param jianjie
     */
    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }

    /**
     * 获取
     * @return islike
     */
    public Integer getIslike() {
        return islike;
    }

    /**
     * 设置
     * @param islike
     */
    public void setIslike(Integer islike) {
        this.islike = islike;
    }

    /**
     * 获取
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置
     * @param time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    public String toString() {
        return "Book{id = " + id + ", name = " + name + ", url = " + url + ", catename = " + catename + ", price = " + price + ", intro = " + intro + ", jianjie = " + jianjie + ", islike = " + islike + ", time = " + time + "}";
    }
}