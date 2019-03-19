package com.example.hehe;

import android.app.Application;
import android.util.Log;


import com.blankj.utilcode.util.Utils;
import org.litepal.LitePal;

public class FaceApplication extends Application {

    private static final String TAG = FaceApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);

        Utils.init(this.getApplicationContext());

    }


}
