package com.example.apngdemo.apng;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.example.apngdemo.R;

public class ApngActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apng);
    }

    /**
     * Glide 加载动画
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, ApngActivity1.class));
    }

    /**
     * RecycleView 显示，测试性能
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, ApngActivity2.class));
    }

    /**
     * 加载Drawable
     * @param v
     */
    public void onTest3(View v) {
        startActivity(new Intent(this, ApngActivity3.class));
    }

}