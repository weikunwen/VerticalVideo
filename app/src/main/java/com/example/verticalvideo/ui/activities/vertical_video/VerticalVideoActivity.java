package com.example.verticalvideo.ui.activities.vertical_video;

import android.os.Bundle;

import com.example.verticalvideo.R;
import com.example.verticalvideo.base.mvp.views.baseactivity.BaseAppMvpActivity;

public class VerticalVideoActivity extends BaseAppMvpActivity<VerticalVideoContract.View, VerticalVideoPresenter>
    implements VerticalVideoContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
