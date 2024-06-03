package com.example.Entity;

public class Banner {
    private String title;
    private String url;
    private Integer id;

    public Banner() {
    }

    public Banner(String title, String url, Integer id) {
        this.title = title;
        this.url = url;
        this.id = id;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
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

    public String toString() {
        return "Banner{title = " + title + ", url = " + url + ", id = " + id + "}";
    }
}
