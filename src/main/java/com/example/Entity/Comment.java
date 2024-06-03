package com.example.Entity;

public class Comment {
    private String bookname;  //书名
    private String shupin;  //书评

    public Comment() {
    }

    public Comment(String bookname, String shupin) {
        this.bookname = bookname;
        this.shupin = shupin;
    }

    /**
     * 获取
     * @return bookname
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * 设置
     * @param bookname
     */
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    /**
     * 获取
     * @return shupin
     */
    public String getShupin() {
        return shupin;
    }

    /**
     * 设置
     * @param shupin
     */
    public void setShupin(String shupin) {
        this.shupin = shupin;
    }

    public String toString() {
        return "Comment{bookname = " + bookname + ", shupin = " + shupin + "}";
    }
}
