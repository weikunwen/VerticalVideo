package com.example.verticalvideo.models.verticalvideo;

import com.example.verticalvideo.api.BaseNetResponse;
import com.example.verticalvideo.api.BaseSubscriber;
import com.example.verticalvideo.api.IBaseNetResponse;
import com.example.verticalvideo.api.IResponseListener;
import com.example.verticalvideo.base.mvp.models.BaseMvpModel;
import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.utils.LogHelper;
import com.example.verticalvideo.utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class VerticalVideoMvpModel extends BaseMvpModel implements IVerticalVideoModel{
    private static final String TAG = "VerticalVideoModel";

    @Override
    public void getVideosInfoList(IResponseListener<VideosInfoBean[]> listener) {
        Flowable<BaseNetResponse<VideosInfoBean[]>> subscriber = RetrofitUtils.getInstance().getApiService().getVideoListInfo();
        subscriber.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribeWith(new BaseSubscriber<IBaseNetResponse<VideosInfoBean[]>>() {
                    @Override
                    public void onSuccess(IBaseNetResponse<VideosInfoBean[]> baseResponse) {
                        LogHelper.i(TAG, "getVideosInfoList onResponse");
                        if((baseResponse.getCode() == 0) && ("成功".equals(baseResponse.getMessage()))) {
//                            listener.onSuccess(baseResponse.getData());
                            listener.onResponseCallback(true, baseResponse.getData(), baseResponse.getMessage(), null);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
//                        videosInfoListCallBack.onError();
                        listener.onResponseCallback(false, null, t.getMessage(), t);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
