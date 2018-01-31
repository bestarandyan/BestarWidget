package com.bestar.recyclerview.header;

import android.support.v7.widget.RecyclerView;

/**
 * Created by lxx  on 2018/1/31
 */
public class BaseHeader extends RecyclerView.ItemDecoration {

    protected int mHeaderHeight;

    public void setHeight(int height){
        mHeaderHeight = height;
    }

    public int getHeight(){
        return mHeaderHeight;
    }
}
