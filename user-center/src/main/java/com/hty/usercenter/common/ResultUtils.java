package com.hty.usercenter.common;

/**
 * 返回工具类
 * @author hty
 */
public class ResultUtils {
    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"ok");
    }
    /**
     * 失败
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode);
    }
}
