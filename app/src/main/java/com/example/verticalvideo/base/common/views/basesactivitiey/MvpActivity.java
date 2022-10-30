package com.example.verticalvideo.base.common.views.basesactivitiey;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.verticalvideo.base.common.presenters.IMvpPresenter;
import com.example.verticalvideo.base.common.views.IMvpView;

public abstract class MvpActivity<P extends IMvpPresenter> extends AppCompatActivity implements IMvpView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
