package com.hty.usercenter.common;

/**
 * 返回工具类
 * @author hty
 */
public class ResultUtils {
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"ok");
    }
}
