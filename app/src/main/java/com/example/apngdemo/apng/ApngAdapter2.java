package com.example.apngdemo.apng;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.apngdemo.R;

import java.util.List;

/**
 * 电影位
 */
public class ApngAdapter2 extends RecyclerView.Adapter<ApngAdapter2.ViewHolder>{

    private Context mContext;
    private List<String> mDataset;

    public ApngAdapter2(Context context, List<String> dataset) {
        super();
        this.mContext = context;
        mDataset = dataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = View.inflate(viewGroup.getContext(), R.layout.item_apng, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Glide.with(mContext).load(mDataset.get(i)).into(viewHolder.imgvTest);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgvTest;

        public ViewHolder(View itemView) {
            super(itemView);
            imgvTest = itemView.findViewById(R.id.imgv_test1);
        }
    }
}
