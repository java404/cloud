package com.example.demo.client.general;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnCode {
    private int returnCode;
    private String message;

    public ReturnCode() {
    }

    public ReturnCode(int returnCode, String message) {
        this.returnCode = returnCode;
        this.message = message;
    }

    @JsonIgnore
    public boolean isOk() {
        return 0 == returnCode;
    }

    @JsonProperty("retcode")
    public int getReturnCode() {
        return returnCode;
    }

    @JsonProperty("retcode")
    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ReturnCode{" + "returnCode=" + returnCode + '}';
    }

    public static ReturnCode okStatus() {
        return new ReturnCode(0, null);
    }
}
