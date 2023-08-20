package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class FourthStepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_fourth_step);
    }

    public void toFinish(View v) {
        Intent intent = new Intent(this, ExitActivity.class);
        startActivity(intent);
    }

    public void toBack4(View v) {
        Intent intent = new Intent(this, ThirdStepActivity.class);
        startActivity(intent);
    }
}