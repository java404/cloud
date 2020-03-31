package com.example.demo.client.pbdata.model;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * 类说明： Action处理结果,主要用户封装Action结果数据并序列化为JSON后传递到前端 文件名称：ActionResult.java
 *
 * @param <T> 承载的数据类型
 */
public class ActionResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean success;// 响应是否成功
    private String msg;// 消息
    private T result;// 处理结果

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    //判断结果是否正常可用
    public static boolean isSuccessResult(ActionResult<String> actionResult){
        return actionResult.isSuccess()&& StringUtils.isNotBlank(actionResult.getResult())&&!actionResult.getResult().equals("null");
    }

}