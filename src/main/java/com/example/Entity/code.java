package com.example.Entity;

public class code {
    private String codetext;
    private String inputcode;

    public code() {
    }

    public code(String codetext) {
        this.codetext = codetext;
    }

    public code(String codetext, String inputcode) {
        this.codetext = codetext;
        this.inputcode = inputcode;
    }

    /**
     * 获取
     * @return codetext
     */
    public String getCodetext() {
        return codetext;
    }

    /**
     * 设置
     * @param codetext
     */
    public void setCodetext(String codetext) {
        this.codetext = codetext;
    }

    public String toString() {
        return "code{codetext = " + codetext + "}";
    }

    /**
     * 获取
     * @return inputcode
     */
    public String getInputcode() {
        return inputcode;
    }

    /**
     * 设置
     * @param inputcode
     */
    public void setInputcode(String inputcode) {
        this.inputcode = inputcode;
    }
}
