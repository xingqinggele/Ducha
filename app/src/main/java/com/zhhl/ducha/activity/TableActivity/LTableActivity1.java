package com.zhhl.ducha.activity.TableActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
import com.zhhl.ducha.bean.LTablebean1;
import com.zhhl.ducha.bean.ZDtablenianbean;
import com.zhhl.ducha.uri.RequestCenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/10/30 16:37.
 */
public class LTableActivity1 extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {
    @BindView(R.id.back)
    RelativeLayout back;
    @BindView(R.id.zdy_cc)
    TextView zdyCc;
    @BindView(R.id.zdy_jl)
    TextView zdyJl;
    @BindView(R.id.zdy_sp)
    TextView zdySp;
    @BindView(R.id.zdy_gzl)
    TextView zdyGzl;
    @BindView(R.id.zdy_ly)
    TextView zdyLy;
    @BindView(R.id.zdy_mhk)
    TextView zdyMhk;
    @BindView(R.id.zdy_bs)
    TextView zdyBs;
    @BindView(R.id.zdy_sy)
    TextView zdySy;
    @BindView(R.id.zdy_bc)
    TextView zdyBc;
    @BindView(R.id.zdy_yb)
    TextView zdyYb;
    @BindView(R.id.zdy_cbs)
    TextView zdyCbs;
    @BindView(R.id.zdy_th)
    TextView zdyTh;
    @BindView(R.id.zdy_hj)
    TextView zdyHj;
    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    ProgressDialog progressDialog;
    private LTablebean1 lTablebean1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ltableactivity1);
        ButterKnife.bind(this);
        initView();
        getDate();
    }

    public void initView() {
        mSwipeRefreshLayout = findViewById(R.id.swipe_refresh_layout);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorScheme(android.R.color.holo_blue_bright, android.R.color.holo_green_light, android.R.color.holo_orange_light, android.R.color.holo_red_light);
        if (progressDialog == null)
            progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("正在请求，请稍后...");
        progressDialog.setCancelable(false);
        progressDialog.show();

    }

    private void getDate() {
        //网络请求
        RequestParams params = new RequestParams();
        RequestCenter.request_Qishi10(params, new DisposeDataListener() {
            @Override
            public void onSuccess(Object o) {
                progressDialog.dismiss();
                Log.e("重点人表格年返回数据", o.toString());
                final String aa = o.toString();
                lTablebean1 = JSON.parseObject(aa, LTablebean1.class);

                zdyCc.setText(lTablebean1.getAttributes().getVarList().get(0).getCC() + "");
                zdyJl.setText(lTablebean1.getAttributes().getVarList().get(0).getJL() + "");
                zdySp.setText(lTablebean1.getAttributes().getVarList().get(0).getSP() + "");
                zdyGzl.setText(lTablebean1.getAttributes().getVarList().get(0).getGZL() + "");
                zdyLy.setText(lTablebean1.getAttributes().getVarList().get(0).getLY() + "");
                zdyMhk.setText(lTablebean1.getAttributes().getVarList().get(0).getMHK() + "");
                zdyBs.setText(lTablebean1.getAttributes().getVarList().get(0).getBS() + "");
                zdySy.setText(lTablebean1.getAttributes().getVarList().get(0).getSY() + "");
                zdyBc.setText(lTablebean1.getAttributes().getVarList().get(0).getBC() + "");
                zdyYb.setText(lTablebean1.getAttributes().getVarList().get(0).getYJ() + "");
                zdyCbs.setText(lTablebean1.getAttributes().getVarList().get(0).getCBS() + "");
                zdyTh.setText(lTablebean1.getAttributes().getVarList().get(0).getTH() + "");
                zdyHj.setText(lTablebean1.getAttributes().getVarList().get(0).getHEJI() + "");

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
        getDate();
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
