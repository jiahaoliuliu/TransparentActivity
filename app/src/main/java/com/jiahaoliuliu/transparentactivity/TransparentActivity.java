package com.jiahaoliuliu.transparentactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

public class TransparentActivity extends Activity {

    private static final String TAG = "TransparentActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.transparent_activity_layout);
        // It's needed for first activity to receive touch events
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);

        Display display = getWindowManager().getDefaultDisplay();
        // The follow code has been deprecated, but it works
        Log.v(TAG, "Size from transparent activity: " + display.getWidth() + ", " + display.getHeight());

        WindowManager.LayoutParams params = getWindow().getAttributes();
        // Set the starting point
        params.x = 0 - display.getWidth()/2;
        params.y = 0 - display.getHeight()/2;

        params.width = display.getWidth()/2;
        params.height = display.getHeight();

        getWindow().setAttributes(params);
    }
}
