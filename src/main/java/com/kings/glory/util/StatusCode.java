package com.kings.glory.util;

public enum StatusCode {
    SUCCESS("20000", "成功"), FALL("50000", "失败"), REQUEST_PARAM_ERROR("50001", "请求参数错误");

    private String code;

    private String message;

    StatusCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
