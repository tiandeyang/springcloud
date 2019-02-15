package com.dytian.yuemee.common;

import java.io.Serializable;

public class Response implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String ERR_MSG = "操作失败";
    private static final String OK_MSG = "操作成功";

    private static final int ERR_CODE = 0;
    private static final int OK_CODE = 1;

    private int code;
    private String msg;
    // private Object data;

    public static Response ok(){
        return new Response(OK_CODE,OK_MSG);
    }
    public static Response fail(){
        return new Response(ERR_CODE,ERR_MSG);
    }

    /**
     * 如果不加无参构造函数  则feign调用无法正常返回
     */
    public Response(){
        System.out.println("response inited............");
    }

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

//    public Object getData() {
//        return data;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }
}
