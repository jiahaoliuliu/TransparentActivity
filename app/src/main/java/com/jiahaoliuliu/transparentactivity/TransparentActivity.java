package com.jiahaoliuliu.transparentactivity;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

public class TransparentActivity extends Activity {

    private static final String TAG = "TransparentActivity";

    private Point screenSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.transparent_activity_layout);
        // It's needed for first activity to receive touch events
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);

        /*
         * Get the screen size based on a point. This method is available form API 13.
         * For API before 13, the method display.getWidth() and display.getHeight()
         * could be used (They are deprecated from API 13)
         */
        Display display = getWindowManager().getDefaultDisplay();
        screenSize = new Point();
        display.getSize(screenSize);

        // The follow code has been deprecated, but it works
        Log.v(TAG, "Size from transparent activity: " + screenSize.x + ", " + screenSize.y);

        WindowManager.LayoutParams params = getWindow().getAttributes();
        // Set the starting point
        params.x = 0 - screenSize.x/2;
        params.y = 0 - screenSize.y/2;

        params.width = screenSize.x/2;
        params.height = screenSize.y;

        getWindow().setAttributes(params);
    }
}
