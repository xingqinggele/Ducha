package com.zhhl.ducha.activity.ZDActivity.ZhongDianactivity;

import android.app.ProgressDialog;
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
import com.zhhl.ducha.activity.ZDActivity.WenKongkaochaActivity.WenKongDeteilsActivity1;
import com.zhhl.ducha.adapter.ZDKeyAdapter.WenKongkaochaadpter.WenKongdetalisAdapter1;
import com.zhhl.ducha.adapter.ZDKeyAdapter.ZhongDianadpter.ZhongDiandetalisAdapter;
import com.zhhl.ducha.bean.WenKongDeteilsbean1;
import com.zhhl.ducha.bean.ZhongDianDeteilsbean;
import com.zhhl.ducha.uri.RequestCenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/10/30 16:02.
 */
public class ZhongDianDeteilsActivity extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {
    private String idcrad;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    ProgressDialog progressDialog;
    private ListView mListView;
    @BindView(R.id.back)
    RelativeLayout back;
    @BindView(R.id.detalis_name)
    TextView detalisName;
    @BindView(R.id.detalis_pname)
    TextView detalisPname;
    @BindView(R.id.detalis_nation)
    TextView detalisNation;
    @BindView(R.id.detalis_sex)
    TextView detalisSex;
    @BindView(R.id.detalis_dateof_birth)
    TextView detalisDateofBirth;
    @BindView(R.id.detalis_phone)
    TextView detalisPhone;
    @BindView(R.id.detalis_id_number)
    TextView detalisIdNumber;
    private ZhongDianDeteilsbean zhongDianDeteilsbean;
    private List<ZhongDianDeteilsbean.AttributesBean.VarListBean>zdrListBeans;
    private ZhongDiandetalisAdapter zhongDiandetalisAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhongdiandeteilsactivity);
        ButterKnife.bind(this);
        Intent intent = this.getIntent();
        idcrad = intent.getExtras().getString("Idcard");
        initView();
    }

    public void initView() {
        mListView = findViewById(R.id.listview);
        mSwipeRefreshLayout = findViewById(R.id.swipe_refresh_layout);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorScheme(android.R.color.holo_blue_bright, android.R.color.holo_green_light, android.R.color.holo_orange_light, android.R.color.holo_red_light);
        if (progressDialog == null)
            progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("正在请求，请稍后...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        getdata();

    }

    public void onRefresh() {
        getdata();
    }

    private void getdata() {
        //网络请求
        RequestParams params = new RequestParams();
        params.put("gmsfhm", idcrad);
        RequestCenter.request_Qishi9_details(params, new DisposeDataListener() {
            @Override
            public void onSuccess(Object o) {
                progressDialog.dismiss();
                Log.e("重点人信息录入不全详情页", o.toString());
                final String aa = o.toString();
                zhongDianDeteilsbean = JSON.parseObject(aa, ZhongDianDeteilsbean.class);
                zdrListBeans = zhongDianDeteilsbean.getAttributes().getVarList();
                if (zdrListBeans.size() >= 1) {
                    detalisName.setText(zdrListBeans.get(0).getXM());
                    detalisPname.setText(zdrListBeans.get(0).getXMPY());
                    detalisNation.setText(zdrListBeans.get(0).getMZMC());
                    detalisSex.setText(zdrListBeans.get(0).getXBMC());
                    detalisDateofBirth.setText(zdrListBeans.get(0).getCSRQ());
                    detalisPhone.setText(zdrListBeans.get(0).getJZWKRDH());
                    detalisIdNumber.setText(zdrListBeans.get(0).getGMSFHM());
                }
                zhongDiandetalisAdapter = new ZhongDiandetalisAdapter(ZhongDianDeteilsActivity.this, zdrListBeans);
                mListView.setAdapter(zhongDiandetalisAdapter);
                zhongDiandetalisAdapter.notifyDataSetChanged();
                mSwipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onFailure(OkHttpException e) {
                progressDialog.dismiss();
                Log.e("失败", e.getEmsg() + "");
            }

        });


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
