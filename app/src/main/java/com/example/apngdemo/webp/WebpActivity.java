package com.example.apngdemo.webp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apngdemo.R;
import com.example.apngdemo.apng.ApngActivity1;
import com.example.apngdemo.apng.ApngActivity2;
import com.example.apngdemo.apng.ApngActivity3;

public class WebpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webp);
    }

    /**
     * Glide 加载动画
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, WebpActivity1.class));
    }

    /**
     *
     * @param v
     */
    public void onTest2(View v) {

    }

    /**
     *
     * @param v
     */
    public void onTest3(View v) {

    }

}