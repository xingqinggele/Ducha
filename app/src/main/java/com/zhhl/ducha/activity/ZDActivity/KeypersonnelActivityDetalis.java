package com.zhhl.ducha.activity.ZDActivity;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;
import com.zhhl.ducha.adapter.Keypersonadpter;
import com.zhhl.ducha.adapter.ZDKeyAdapter.KeyperdetalisAdapter;
import com.zhhl.ducha.bean.Detabean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by qgl on 2019/9/9 16:19.
 */
public class KeypersonnelActivityDetalis extends BaseActivity implements PullLoadMoreRecyclerView.PullLoadMoreListener {


    @BindView(R.id.listview)
    PullLoadMoreRecyclerView listview;
    private List<Detabean> one_case_dates;
    private RecyclerView mRecyclerView;
    private KeyperdetalisAdapter one_case_adapter;
    private int mCount = 1;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keypersonnelactivity_detalis);
        ButterKnife.bind(this);
        initList();
    }

    private void getdata()
    {
        one_case_dates = new ArrayList<>();
        Detabean people=new Detabean();
        for (int i = 0;i<=15;i++)
        {
            one_case_dates.add(people);
        }
        one_case_adapter.addAllData(one_case_dates);
        listview.setPullLoadMoreCompleted();
    }

    private void initList() {
        //获取mRecyclerView对象
        mRecyclerView = listview.getRecyclerView();
        //代码设置scrollbar无效？未解决！
        mRecyclerView.setVerticalScrollBarEnabled(true);
        //设置下拉刷新是否可见
        //mPullLoadMoreRecyclerView.setRefreshing(true);
        //设置是否可以下拉刷新
        //mPullLoadMoreRecyclerView.setPullRefreshEnable(true);
        //设置是否可以上拉刷新
        listview.setPushRefreshEnable(false);
        //显示下拉刷新
        listview.setRefreshing(true);
        //设置上拉刷新文字
        listview.setFooterViewText("loading");
        //设置上拉刷新文字颜色
        //mPullLoadMoreRecyclerView.setFooterViewTextColor(R.color.white);
        //设置加载更多背景色
        //mPullLoadMoreRecyclerView.setFooterViewBackgroundColor(R.color.colorBackground);
        listview.setLinearLayout();

        listview.setOnPullLoadMoreListener(this);
        one_case_adapter = new KeyperdetalisAdapter(KeypersonnelActivityDetalis.this);
        listview.setAdapter(one_case_adapter);
        getdata();
    }


    @Override
    public void onRefresh() {
        Log.e("wxl", "onRefresh");
        setRefresh();
        getdata();
    }

    @Override
    public void onLoadMore() {
        Log.e("wxl", "onLoadMore");
        mCount = mCount + 1;
    }

    private void setRefresh() {
        one_case_adapter.clearData();
        mCount = 1;
    }

}
