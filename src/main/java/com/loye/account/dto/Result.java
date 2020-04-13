package com.loye.account.dto;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> {
    private int status;

    private T data;// 成功时返回的数据

    private String error;// 错误信息

    public Result() {
    }

    // 成功时的构造器
    public Result(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
