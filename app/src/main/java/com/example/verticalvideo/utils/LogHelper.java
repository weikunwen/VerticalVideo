package com.example.verticalvideo.utils;

import android.util.Log;

public class LogHelper {
    private static final String TAG = "VerticalVideo";

    public static final void i(String tag, String logInfo) {
        Log.i(TAG, tag + ": " + logInfo);
    }

    public static final void d(String tag, String logInfo) {
        Log.d(TAG, tag + ": " + logInfo);
    }

    public static final void w(String tag, String logInfo) {
        Log.w(TAG, tag + ": " + logInfo);
    }

    public static final void e(String tag, String logInfo) {
        Log.e(TAG, tag + ": " + logInfo);
    }
}
