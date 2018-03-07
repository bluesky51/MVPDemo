package com.exam.sky.mvpdemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.exam.sky.mvpdemo.bean.HotData;

import java.util.List;

/**
 * Created by bluesky on 16/10/24.
 */

public class MyAdapter extends BaseAdapter {
    List<HotData.DataBean> dataBeanList;
    Context context;

    public MyAdapter(List<HotData.DataBean> dataBeanList, Context context) {
        this.dataBeanList = dataBeanList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView =new ImageView(context);
        Glide.with(context).load(dataBeanList.get(position).get_$640_pic())
                .into(imageView);
        return imageView;
    }
}
