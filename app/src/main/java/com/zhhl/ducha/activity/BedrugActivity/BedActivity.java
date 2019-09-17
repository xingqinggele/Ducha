package com.zhhl.ducha.activity.BedrugActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;
import com.zhhl.ducha.adapter.Bedrugadapter.BedAdapter;
import com.zhhl.ducha.bean.Detabean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/11 10:18.
 */
public class BedActivity extends BaseActivity implements PullLoadMoreRecyclerView.PullLoadMoreListener {

    @BindView(R.id.bed_title)
    TextView bedTitle;
    @BindView(R.id.sd_sp2)
    Spinner sdSp2;
    @BindView(R.id.sd_listview)
    PullLoadMoreRecyclerView sdListview;
    @BindView(R.id.back)
    RelativeLayout back;
    private String code;

    private List<String> data_list_quyu;
    private ArrayAdapter<String> arr_adapter_quyu;

    private List<Detabean> one_case_dates;
    private RecyclerView mRecyclerView;
    private BedAdapter one_case_adapter;
    private int mCount = 1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bedactivity);
        ButterKnife.bind(this);
        Intent intent = this.getIntent();
        code = intent.getExtras().getString("code");
        Toast.makeText(this, code, Toast.LENGTH_SHORT).show();
        bedTitle.setText(code);


        data_list_quyu = new ArrayList<String>();
        data_list_quyu.add("全部");
        data_list_quyu.add("长春");
        data_list_quyu.add("吉林");
        data_list_quyu.add("四平");
        data_list_quyu.add("公主岭");
        data_list_quyu.add("辽源");
        data_list_quyu.add("通化");
        data_list_quyu.add("梅河口");
        data_list_quyu.add("白山");
        data_list_quyu.add("松原");
        data_list_quyu.add("白城");
        data_list_quyu.add("延边朝鲜族自治州");
        data_list_quyu.add("长白山");


        //适配器
        arr_adapter_quyu = new ArrayAdapter<String>(this, R.layout.adapter_mytopactionbar_spinner, data_list_quyu);
        //设置样式
        arr_adapter_quyu.setDropDownViewResource(R.layout.adapter_mytopactionbar_spinner);
        sdSp2.setAdapter(arr_adapter_quyu);
        initList();
    }

    private void initList() {
        //获取mRecyclerView对象
        mRecyclerView = sdListview.getRecyclerView();
        //代码设置scrollbar无效？未解决！
        mRecyclerView.setVerticalScrollBarEnabled(true);
        //设置下拉刷新是否可见
        //mPullLoadMoreRecyclerView.setRefreshing(true);
        //设置是否可以下拉刷新
        //mPullLoadMoreRecyclerView.setPullRefreshEnable(true);
        //设置是否可以上拉刷新
        sdListview.setPushRefreshEnable(false);
        //显示下拉刷新
        sdListview.setRefreshing(true);
        //设置上拉刷新文字
        sdListview.setFooterViewText("loading");
        //设置上拉刷新文字颜色
        //mPullLoadMoreRecyclerView.setFooterViewTextColor(R.color.white);
        //设置加载更多背景色
        //mPullLoadMoreRecyclerView.setFooterViewBackgroundColor(R.color.colorBackground);
        sdListview.setLinearLayout();

        sdListview.setOnPullLoadMoreListener(this);
        one_case_adapter = new BedAdapter(BedActivity.this);
        sdListview.setAdapter(one_case_adapter);
        getdata();
    }

    private void getdata() {
        one_case_dates = new ArrayList<>();
        Detabean people = new Detabean();
        for (int i = 0; i <= 15; i++) {
            one_case_dates.add(people);
        }
        one_case_adapter.addAllData(one_case_dates);
        sdListview.setPullLoadMoreCompleted();
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

    @OnClick(R.id.back)
    public void onViewClicked(View view) {
        switch (view.getId())
        {
            case R.id.back:
                finish();
                break;
        }
    }
}
