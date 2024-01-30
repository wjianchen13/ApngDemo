package com.example.apngdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.apngdemo.apng.ApngActivity;
import com.example.apngdemo.webp.WebpActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Apng 动画
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, ApngActivity.class));
    }

    /**
     * webp 动画
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, WebpActivity.class));
    }

}