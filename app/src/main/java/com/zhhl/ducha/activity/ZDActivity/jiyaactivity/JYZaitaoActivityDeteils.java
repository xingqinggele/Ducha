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
import com.zhhl.ducha.adapter.ZDKeyAdapter.jiyaadapter.JYZaitaoactivitydetalisAdapter;
import com.zhhl.ducha.bean.JYZaitaoDeteilsbean;
import com.zhhl.ducha.uri.RequestCenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/18 9:05.
 */
public class JYZaitaoActivityDeteils extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener
{
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
    private JYZaitaoactivitydetalisAdapter one_case_adapter;
    private String idcrad;
    private ListView mListView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private JYZaitaoDeteilsbean zDyiniandetailsbean;
    private List<JYZaitaoDeteilsbean.AttributesBean.ZdrListBean> zdrListBeans;
    ProgressDialog progressDialog;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jyzaitaoactivitydeteils);
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
        params.put("gmsfhm",idcrad);
        RequestCenter.request_Qishi5_details(params, new DisposeDataListener()
        {
            @Override
            public void onSuccess(Object o)
            {
                progressDialog.dismiss();
                Log.e("羁押在逃人员详情返回数据", o.toString());
                final String aa = o.toString();
                zDyiniandetailsbean = JSON.parseObject(aa, JYZaitaoDeteilsbean.class);
                zdrListBeans = zDyiniandetailsbean.getAttributes().getZdrList();
                if (zdrListBeans.size()>=1)
                {
                    detalisName.setText(zdrListBeans.get(0).getXM());
                    detalisPname.setText(zdrListBeans.get(0).getXMPY());
                    detalisNation.setText(zdrListBeans.get(0).getMZMC());
                    detalisSex.setText(zdrListBeans.get(0).getXBMC());
                    detalisDateofBirth.setText(zdrListBeans.get(0).getCSRQ());
                    detalisPhone.setText(zdrListBeans.get(0).getJZWKRDH());
                    detalisIdNumber.setText(zdrListBeans.get(0).getGMSFHM());
                }
                one_case_adapter = new JYZaitaoactivitydetalisAdapter(JYZaitaoActivityDeteils.this, zdrListBeans);
                mListView.setAdapter(one_case_adapter);
                one_case_adapter.notifyDataSetChanged();
                mSwipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onFailure(OkHttpException e)
            {
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
