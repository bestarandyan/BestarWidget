package com.bestar.recyclerview.header;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;

/**
 * Created by lxx  on 2018/1/31
 */
public class Header extends BaseHeader{

    @Override
    public void getItemOffsets(Rect outRect, int itemPosition, RecyclerView parent) {
        if(itemPosition == 0) {
            outRect.set(0, mHeaderHeight, 0, 0);
        }
    }
}
