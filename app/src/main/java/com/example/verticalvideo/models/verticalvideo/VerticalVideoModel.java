package com.example.verticalvideo.models.verticalvideo;

import com.example.verticalvideo.api.BaseNetNetResponse;
import com.example.verticalvideo.api.BaseSubscriber;
import com.example.verticalvideo.api.IBaseNetRespone;
import com.example.verticalvideo.api.IResponseListener;
import com.example.verticalvideo.base.mvp.models.BaseModel;
import com.example.verticalvideo.beans.VideosInfoBean;
import com.example.verticalvideo.utils.LogHelper;
import com.example.verticalvideo.utils.RetrofitUtils;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class VerticalVideoModel extends BaseModel implements IVerticalVideoModel{
    private static final String TAG = "VerticalVideoModel";

    @Override
    public void getVideosInfoList(IResponseListener<VideosInfoBean[]> listener) {
        Flowable<BaseNetNetResponse<VideosInfoBean[]>> subscriber = RetrofitUtils.getInstance().getApiService().getVideoListInfo();
        subscriber.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribeWith(new BaseSubscriber<IBaseNetRespone<VideosInfoBean[]>>() {
                    @Override
                    public void onSuccess(IBaseNetRespone<VideosInfoBean[]> baseResponse) {
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
