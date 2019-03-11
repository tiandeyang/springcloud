package com.dytian.yuemee.common;


import com.alibaba.fastjson.JSON;

import java.util.HashMap;

/**
 * @Author: CYN
 * @Date: 2019/2/19 10:31
 * @Description:返回结果封装
 */
public class Result extends HashMap<String, Object> {

    private static final int OK = 1;
    private static final int FAIL = 0;

    private static final String CODE = "code";
    private static final String MSG = "msg";
    private static final String DATA = "data";

    private static final String OK_MSG = "操作成功";
    private static final String FAIL_MSG = "操作失败";

    private static final long serialVersionUID = -135314893999383188L;

    public static Result ok() {
        return new Result().setCode(OK)
                .setMsg(OK_MSG);
    }

    public static Result ok(Object data) {
        return new Result().setCode(OK)
                .setMsg(OK_MSG).setData(data);
    }

    public static Result okMsg(String msg) {
        return new Result().setCode(OK)
                .setMsg(msg);
    }

    public static Result failMsg(String message) {
        return new Result().setCode(FAIL)
                .setMsg(message);
    }

    public static Result fail() {
        return new Result().setCode(FAIL)
                .setMsg(FAIL_MSG);
    }




    private Result setCode(int code) {
        this.put(CODE, code);
        return this;
    }

    private Result setData(Object data) {
        this.put(DATA, data);
        return this;
    }

    private Result setMsg(String msg) {
        this.put(MSG, msg);
        return this;
    }

    public boolean isOk() {
        return OK == getCode();
    }

    public int getCode(){
        return (int)get(CODE);
    }



    public Object getData() {
        return get(DATA);
    }
    public Object getMsg() {
        return this.get(MSG);
    }

    public static Result ifOk(boolean isOk,String errmsg){
        if (isOk){
            return Result.ok();
        }
        return Result.failMsg(errmsg);
    }

    public static Result ifNull(Object data){
        if (null == data){
            return Result.failMsg("NOT FOUND");
        }
        return Result.ok(data);
    }

    public static <T> T parseObject(Result result, Class<T> klass){
        return JSON.parseObject(JSON.toJSONString(result.getData()), klass);
    }




}
