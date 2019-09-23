package com.kings.glory.util;

import java.io.Serializable;

public class R<T> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String code;

    private String msg;

    private T datas;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getDatas() {
        return datas;
    }

    public void setDatas(T datas) {
        this.datas = datas;
    }
}
