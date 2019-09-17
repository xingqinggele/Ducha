package com.zhhl.ducha.activity.ZDActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.alibaba.fastjson.JSON;
import com.example.toollibrary.okhttp.exception.OkHttpException;
import com.example.toollibrary.okhttp.listener.DisposeDataListener;
import com.example.toollibrary.okhttp.request.RequestParams;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;
import com.zhhl.ducha.adapter.ZDKeyAdapter.KeyperdetalisAdapter;
import com.zhhl.ducha.bean.Homedetalisbean;
import com.zhhl.ducha.uri.RequestCenter;
import com.zhhl.ducha.view.NoScrollListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/9 16:19.
 */
public class KeypersonnelActivityDetalis extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {

    @BindView(R.id.back)
    RelativeLayout back;
    @BindView(R.id.de_t1)
    TextView deT1;
    @BindView(R.id.detalis_name)
    TextView detalisName;
    @BindView(R.id.tt3)
    TextView tt3;
    @BindView(R.id.detalis_pname)
    TextView detalisPname;
    @BindView(R.id.view1)
    View view1;
    @BindView(R.id.de_t2)
    TextView deT2;
    @BindView(R.id.detalis_nation)
    TextView detalisNation;
    @BindView(R.id.tt2)
    TextView tt2;
    @BindView(R.id.detalis_sex)
    TextView detalisSex;
    @BindView(R.id.view2)
    View view2;
    @BindView(R.id.de_t3)
    TextView deT3;
    @BindView(R.id.detalis_dateof_birth)
    TextView detalisDateofBirth;
    @BindView(R.id.tt1)
    TextView tt1;
    @BindView(R.id.detalis_phone)
    TextView detalisPhone;
    @BindView(R.id.view3)
    TextView view3;
    @BindView(R.id.de_t4)
    TextView deT4;
    @BindView(R.id.detalis_id_number)
    TextView detalisIdNumber;
    private KeyperdetalisAdapter one_case_adapter;
    private String idcrad;
    private Homedetalisbean homedetalisbean;
    private List<Homedetalisbean.AttributesBean.ListDataBean> extraData;
    private ListView mListView;
    private SwipeRefreshLayout mSwipeRefreshLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keypersonnelactivity_detalis);
        ButterKnife.bind(this);
        Intent intent = this.getIntent();
        idcrad = intent.getExtras().getString("Idcard");
        initView();
    }

    public void initView() {
        mListView = (ListView) findViewById(R.id.listview);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorScheme(android.R.color.holo_blue_bright, android.R.color.holo_green_light, android.R.color.holo_orange_light, android.R.color.holo_red_light);
        getdata();
    }

    private void getdata() {
        //网络请求
        RequestParams params = new RequestParams();
        params.put("sfzh", idcrad);
        Log.e("提交的数据", idcrad);
        RequestCenter.request_Qishi1_Detalis(params, new DisposeDataListener() {
            @Override
            public void onSuccess(Object o) {
                Log.e("返回数据", o.toString());
                final String aa = o.toString();
                homedetalisbean = JSON.parseObject(aa, Homedetalisbean.class);
                extraData = homedetalisbean.getAttributes().getListData();
                if (extraData.size()>=1)
                {
                    detalisName.setText(extraData.get(0).getXM());
                    detalisPname.setText(extraData.get(0).getXMPY());
                    detalisNation.setText(extraData.get(0).getMZMC());
                    detalisSex.setText(extraData.get(0).getXBMC());
                    detalisDateofBirth.setText(extraData.get(0).getCSRQ());
                    detalisPhone.setText(extraData.get(0).getJZWKRDH());
                    detalisIdNumber.setText(extraData.get(0).getGMSFHM());
                }
                one_case_adapter = new KeyperdetalisAdapter(KeypersonnelActivityDetalis.this, extraData);
                mListView.setAdapter(one_case_adapter);
                one_case_adapter.notifyDataSetChanged();
                mSwipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onFailure(OkHttpException e) {
                Log.e("失败", e.getEmsg() + "");
            }

        });
    }

    public void onRefresh() {
        getdata();
    }

    @OnClick(R.id.back)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
        }
    }
}
