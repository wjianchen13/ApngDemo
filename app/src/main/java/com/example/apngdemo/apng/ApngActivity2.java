package com.example.apngdemo.apng;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apngdemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Glide 加载动画
 */
public class ApngActivity2 extends AppCompatActivity {

    private String url = "https://img.ayomet.com/upload/user_tag/2023-11-02/b5f28f2c256c1aacb3c272d6680d0b69.png?imageslim";
    private List<String> datas = new ArrayList<>();
    private ApngAdapter2 adapter;
    private RecyclerView rv;

    private GridLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apng2);
        initRecyclerView();
    }

    public void initRecyclerView(){
        rv = findViewById(R.id.recyclerview_vertical);
        layoutManager = new GridLayoutManager(this, 1);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(layoutManager);
        rv.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
                outRect.left = 10;
                outRect.top = 10;
                outRect.right = 10;
                outRect.bottom = 10;
            }
        });

        for(int i = 0; i < 200; i ++) {
            datas.add(url);
        }
        adapter = new ApngAdapter2(this, datas);
        rv.setAdapter(adapter);
    }

    public void onTest1(View v) {

    }

}