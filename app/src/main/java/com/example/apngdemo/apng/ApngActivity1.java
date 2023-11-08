package com.example.apngdemo.apng;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.apngdemo.R;

/**
 * Glide 加载动画
 */
public class ApngActivity1 extends AppCompatActivity {

    private String url = "https://img.ayomet.com/upload/user_tag/2023-11-02/b5f28f2c256c1aacb3c272d6680d0b69.png?imageslim";

    private ImageView imgvTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apng1);
        imgvTest1 = findViewById(R.id.imgv_test1);
    }

    public void onTest1(View v) {
        Glide.with(this).load(url).into(imgvTest1);
    }

}