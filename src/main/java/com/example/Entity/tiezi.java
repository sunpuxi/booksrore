package com.example.Entity;

public class tiezi {
    private String username;
    private String text;

    public tiezi() {
    }

    public tiezi(String username, String text) {
        this.username = username;
        this.text = text;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * 设置
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "tiezi{username = " + username + ", text = " + text + "}";
    }
}
