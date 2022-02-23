package com.rabiloo.springbootssl.dto;

public class ResponseDto {
    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseDto(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
