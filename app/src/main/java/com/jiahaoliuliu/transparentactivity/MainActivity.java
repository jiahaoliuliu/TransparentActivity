package com.jiahaoliuliu.transparentactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private static final String TAG = "TransparentActivity";

    private Button startNewActivityButton;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);

        context = this;

        startNewActivityButton = (Button)findViewById(R.id.startNewActivityButton);
        startNewActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the transparent activity going to the home
                Intent i = new Intent(MainActivity.this, TransparentActivity.class);
                i.setAction(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_HOME);
                startActivity(i);
                finish();
            }
        });
    }
}
