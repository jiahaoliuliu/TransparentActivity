package com.jiahaoliuliu.transparentactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button startNewActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);

        startNewActivityButton = (Button)findViewById(R.id.startNewActivityButton);
        startNewActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivityIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(startNewActivityIntent);
            }
        });
    }
}
