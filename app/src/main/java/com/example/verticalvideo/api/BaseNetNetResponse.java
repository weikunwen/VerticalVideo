package com.example.verticalvideo.api;

public class BaseNetNetResponse<T> implements IBaseNetRespone<T> {
    private int code;
    private String message;
    private T data;

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }

    @Override
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
