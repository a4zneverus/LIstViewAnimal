package com.example.ongor2.listviewanimal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<Data> mDatas;
    private LayoutInflater mLayout;

    public MyAdapter(Context context,List<Data> mDatas) {
        mDatas = aList;
        mLayout = LayoutInflater.from(context);
    }
    static class ViewHolder{
        TextView tvTitle;
        TextView tvDesc;
        ImageView img;
    }


    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
    }
}
