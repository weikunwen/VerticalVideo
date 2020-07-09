package com.example.verticalvideo.utils;

import com.example.verticalvideo.api.RetrofitService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {
    //1创建一个单列模式
    private static volatile RetrofitUtils instance;
    private final Retrofit retrofit;
    private static final String BASE_URL = "http://114.67.81.61/";

    //2创建一个私有的无参构造
    private RetrofitUtils(){

        //创建Retrofit
        retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())//默认Gson进行解析
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//使用RxJava2的适配器
            .baseUrl(BASE_URL)//接口
            .build();
    }

    //4.创建一个静态方法，得到instance 判断是否为空
    public static RetrofitUtils getInstance() {
        if (instance == null) {
            synchronized (RetrofitUtils.class) {
                if (instance == null) {
                    instance = new RetrofitUtils();
                }
            }
        }
        return instance;
    }

    //6创建方法 方便调用
    public RetrofitService getApiService(){
        return  retrofit.create(RetrofitService.class);
    }
}
