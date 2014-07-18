package com.jiahaoliuliu.transparentactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class NewActivity extends Activity {

    private Button notClickableButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity_layout);

        notClickableButton = (Button)findViewById(R.id.notClickableButton);
        notClickableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NewActivity.this, "You should not be able to see this", Toast.LENGTH_LONG).show();
            }
        });
    }
}
