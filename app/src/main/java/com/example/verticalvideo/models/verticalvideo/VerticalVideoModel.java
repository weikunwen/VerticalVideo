package com.example.verticalvideo.models.verticalvideo;

import com.example.verticalvideo.api.BaseResponseI;
import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.utils.LogHelper;
import com.example.verticalvideo.utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

public class VerticalVideoModel implements IVerticalVideoModel{
    private static final String TAG = "VerticalVideoModel";

    @Override
    public void getVideosInfoList(VideosInfoListCallBack videosInfoListCallBack) {
        Flowable<BaseResponseI<VideosInfoBean[]>> flowable = RetrofitUtils.getInstance().getApiService().getVideoListInfo();
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<BaseResponseI<VideosInfoBean[]>>() {
                    @Override
                    public void onNext(BaseResponseI<VideosInfoBean[]> baseResponse) {
                        LogHelper.i(TAG, "getVideosInfoList onResponse");
                        if((baseResponse.getCode() == 0) && ("成功".equals(baseResponse.getMessage()))) {
                            videosInfoListCallBack.onSuccess(baseResponse.getData());
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        videosInfoListCallBack.onError();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
