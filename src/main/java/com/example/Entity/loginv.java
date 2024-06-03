package com.example.Entity;
public class loginv {
    private User User;
    private code code;

    public loginv() {
    }

    public loginv(User user, code code) {
        this.User = user;
        this.code = code;
    }
    public loginv(code code) {
        this.code = code;
    }

    /**
     * 获取
     * @return user
     */
    public User getUser() {
        return User;
    }

    /**
     * 设置
     * @param user
     */
    public void setUser(User user) {
        this.User = user;
    }

    /**
     * 获取
     * @return code
     */
    public code getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(code code) {
        this.code = code;
    }

    public String toString() {
        return "loginv{user = " + User + ", code = " + code + "}";
    }
}
