package com.xlx.springbootmybatis.response;

/**
 * @author xueleixi
 * @date 2018/7/31 上午11:34
 */
public class JsonResponse {

    private String message;
    private Object data;
    private int status;

    public static final int STATUS_OK = 1;
    public static final int STATUS_ERROR = 0;


    public JsonResponse() {
    }

    public JsonResponse(Object data, String message, int status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public static JsonResponse ok(Object data, String message) {
        return new JsonResponse(data, message, STATUS_OK);
    }
    public static JsonResponse ok(Object data) {
        return ok(data, null);
    }

    public static JsonResponse error(Object data, String message) {
        return new JsonResponse(data, message, STATUS_ERROR);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
