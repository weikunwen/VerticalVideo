package com.example.verticalvideo.api;

/**
 * @author xukun
 * @date 2022/10/30
 * @Description:
 */
public interface IBaseNetRespone<T> {
    /**
     * api response bean
     *
     * @return
     */
    T getData();

    /**
     * api response bean
     *
     * @return
     */
    String getMessage();

    int getCode();
}
