package com.example.verticalvideo.api;

import io.reactivex.subscribers.ResourceSubscriber;

/**
 * @author xukun
 * @date 2022/10/30
 * @Description:
 */
public abstract class BaseSubscriber<T> extends ResourceSubscriber<T> {
    private static final int LOGIN_ERR_CODE = 9995;

    @Override
    public void onComplete() {
    }

    @Override
    public void onError(Throwable t) {
//        Downloader.ResponseException exception = ExceptionEngine.handleException(t);
//        if (exception.getCode() == LOGIN_ERR_CODE) {
//            // 清除auth
//            UserManager.getInstance().clearAuthorization();
//            // 发出一个登出事件
//            EventBusUtils.sendEvent(new Event(EventCode.LOGIN_STATE_CHANGED, new LoginEventBean(false)));
//            // 跳转到登录
//            RouteManager.startLogin();
//        } else {
//            if (isShowErrorMsg(exception)) {
//                //显示错误信息
//                ToastUtils.showShort(exception.getMessage());
//            }
//        }
    }

    /**
     * @return true 显示toast, false 不显示
     */
//    protected boolean isShowErrorMsg(ResponeException exception) {
//        return true;
//    }

    @Override
    public void onNext(T t) {
        onSuccess(t);
    }

    protected abstract void onSuccess(T response);
}
