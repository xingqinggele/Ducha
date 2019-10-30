package com.zhhl.ducha.activity.ZDActivity.jiyaactivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.alibaba.fastjson.JSON;
import com.example.toollibrary.okhttp.exception.OkHttpException;
import com.example.toollibrary.okhttp.listener.DisposeDataListener;
import com.example.toollibrary.okhttp.request.RequestParams;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;
import com.zhhl.ducha.adapter.ZDKeyAdapter.jiyaadapter.JYJuliuactivitydetalisAdapter;
import com.zhhl.ducha.bean.JYJuliuDeteilsbean;
import com.zhhl.ducha.uri.RequestCenter;
import com.zhhl.ducha.view.NoScrollListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/10/30 11:15.
 */
public class JYJuliuActivityDeteils extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {
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
    private String idcrad;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    ProgressDialog progressDialog;
    private ListView mListView;
    private JYJuliuDeteilsbean jyJuliuDeteilsbean;
    private List<JYJuliuDeteilsbean.AttributesBean.ZdrListBean> zdrListBeans;
    private JYJuliuactivitydetalisAdapter jyJuliuactivitydetalisAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jyjuliuactivitydeteils);
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


    private void getdata() {
        //网络请求
        RequestParams params = new RequestParams();
        params.put("gmsfhm", idcrad);
        RequestCenter.request_Qishi6_details(params, new DisposeDataListener() {
            @Override
            public void onSuccess(Object o) {
                progressDialog.dismiss();
                Log.e("羁押在逃人员详情返回数据", o.toString());
                final String aa = o.toString();
                jyJuliuDeteilsbean = JSON.parseObject(aa, JYJuliuDeteilsbean.class);
                zdrListBeans = jyJuliuDeteilsbean.getAttributes().getZdrList();
                if (zdrListBeans.size() >= 1) {
                    detalisName.setText(zdrListBeans.get(0).getXM());
                    detalisPname.setText(zdrListBeans.get(0).getXMPY());
                    detalisNation.setText(zdrListBeans.get(0).getMZMC());
                    detalisSex.setText(zdrListBeans.get(0).getXBMC());
                    detalisDateofBirth.setText(zdrListBeans.get(0).getCSRQ());
                    detalisPhone.setText(zdrListBeans.get(0).getJZWKRDH());
                    detalisIdNumber.setText(zdrListBeans.get(0).getGMSFHM());
                }
                jyJuliuactivitydetalisAdapter = new JYJuliuactivitydetalisAdapter(JYJuliuActivityDeteils.this, zdrListBeans);
                mListView.setAdapter(jyJuliuactivitydetalisAdapter);
                jyJuliuactivitydetalisAdapter.notifyDataSetChanged();
                mSwipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onFailure(OkHttpException e) {
                progressDialog.dismiss();
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
