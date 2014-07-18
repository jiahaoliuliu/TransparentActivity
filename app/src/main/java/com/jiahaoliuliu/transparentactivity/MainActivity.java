package com.jiahaoliuliu.transparentactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button startNewActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);

        startNewActivityButton = (Button)findViewById(R.id.startNewActivityButton);
        startNewActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start a new activity
                Intent startNewActivityIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(startNewActivityIntent);

                // Trying to start a new activity over it
                Intent startTransparentActivityIntent = new Intent(MainActivity.this, TransparentActivity.class);
                startActivity(startTransparentActivityIntent);
            }
        });
    }
}
