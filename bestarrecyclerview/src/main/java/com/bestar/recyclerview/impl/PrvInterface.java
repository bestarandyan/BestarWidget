package com.bestar.recyclerview.impl;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bestar.recyclerview.BestarRecyclerView;
import com.bestar.recyclerview.loadmore.BaseLoadMoreView;


/**
 * Created by lxx  on 2018/1/31
 */
public interface PrvInterface{
    void setOnRefreshComplete();
    void setOnLoadMoreComplete();//onFinishLoading,加载更多完成
    void setPagingableListener(BestarRecyclerView.PagingableListener pagingableListener);
    void setEmptyView(View emptyView);
    void setAdapter(RecyclerView.Adapter adapter);
    void addHeaderView(View view);
    void removeHeader();//移除header
    void setFooter(View view);
    void scrollToPosition(int position);
    void smoothScrollToPosition(int position);
    void setLoadMoreFooter(BaseLoadMoreView loadMoreFooter);
    BaseLoadMoreView getLoadMoreFooter();
    void addOnScrollListener(BestarRecyclerView.OnScrollListener onScrollLinstener);
    RecyclerView.LayoutManager getLayoutManager();
    void onFinishLoading(boolean hasMoreItems, boolean needSetSelection);
    void setSwipeEnable(boolean enable);//设置是否可以下拉
    boolean isSwipeEnable();//返回当前组件是否可以下拉
    RecyclerView getRecyclerView();
    void setLayoutManager(RecyclerView.LayoutManager layoutManager);
    void setLoadMoreCount(int count);//如果不达到count数量不让加载更多
    void release();
}
