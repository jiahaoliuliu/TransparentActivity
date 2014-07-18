package com.jiahaoliuliu.transparentactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class TransparentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transparent_activity_layout);
        // It's needed for first activity to receive touch events
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
    }
}
