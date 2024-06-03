package com.example.Entity;

public class User {
    private Integer id;
    private String username;
    private String password;
    private  Integer money;

    private String text;
    private String mail;

    public User() {
    }

    public User(Integer id, String username, String password, Integer money, String text, String mail) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.money = money;
        this.text = text;
        this.mail = mail;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return money
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(Integer money) {
        this.money = money;
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

    /**
     * 获取
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", money = " + money + ", text = " + text + ", mail = " + mail + "}";
    }
}