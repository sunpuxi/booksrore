package com.example.Entity;

public class Admin {
    private Integer id;
    private String adminname;
    private String password;

    public Admin() {
    }

    public Admin(Integer id, String adminname, String password) {
        this.id = id;
        this.adminname = adminname;
        this.password = password;
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
     * @return adminname
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * 设置
     * @param adminname
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname;
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

    public String toString() {
        return "Admin{id = " + id + ", adminname = " + adminname + ", password = " + password + "}";
    }
}
