package com.zgm.aotodemo.util;


import java.io.Serializable;

public class ResBean<T> implements Serializable {

    private int statusCode;
    private String message;
    private T data;
    private Object ext;


    public static ResBean me() {
        return new ResBean();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public ResBean setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public ResBean setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResBean setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResBean setData(T data) {
        this.data = data;
        return this;
    }

    public Object getExt() {
        return ext;
    }

    public ResBean setExt(Object ext) {
        this.ext = ext;
        return this;
    }
}