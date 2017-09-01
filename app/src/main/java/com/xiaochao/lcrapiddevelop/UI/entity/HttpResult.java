package com.xiaochao.lcrapiddevelop.UI.entity;

/**
 * Created by liukun on 16/3/5.
 */
public class HttpResult<T> {


    /**
     * data : []
     * requestTime : 2016-11-02 14:00:25
     * code : 1
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

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
