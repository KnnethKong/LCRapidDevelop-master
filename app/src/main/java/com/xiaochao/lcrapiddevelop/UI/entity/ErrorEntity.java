package com.xiaochao.lcrapiddevelop.UI.entity;

/**
 * Created by kxf on 2017/9/1.
 */
public class ErrorEntity {
    /**
     * err_code : 000004
     * success : false
     * err_msg : 用户名或密码错误
     */

    private String err_code;
    private boolean success;
    private String err_msg;

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }
}
