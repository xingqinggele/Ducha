package com.zhhl.ducha.activity.ZDActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.alibaba.fastjson.JSON;
import com.example.toollibrary.okhttp.exception.OkHttpException;
import com.example.toollibrary.okhttp.listener.DisposeDataListener;
import com.example.toollibrary.okhttp.request.RequestParams;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;
import com.zhhl.ducha.bean.ZDtablenianbean;
import com.zhhl.ducha.bean.ZDtableyuebean;
import com.zhhl.ducha.uri.RequestCenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/9 15:55.
 */
public class HomeReportActivity extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {
    @BindView(R.id.back)
    RelativeLayout back;
    @BindView(R.id.zdy_cc)
    TextView zdyCc;
    @BindView(R.id.zdn_cc)
    TextView zdnCc;
    @BindView(R.id.zdy_jl)
    TextView zdyJl;
    @BindView(R.id.zdn_jl)
    TextView zdnJl;
    @BindView(R.id.zdy_sp)
    TextView zdySp;
    @BindView(R.id.zdn_sp)
    TextView zdnSp;
    @BindView(R.id.zdy_gzl)
    TextView zdyGzl;
    @BindView(R.id.zdn_gzl)
    TextView zdnGzl;
    @BindView(R.id.zdy_ly)
    TextView zdyLy;
    @BindView(R.id.zdn_ly)
    TextView zdnLy;
    @BindView(R.id.zdy_mhk)
    TextView zdyMhk;
    @BindView(R.id.zdn_mhk)
    TextView zdnMhk;
    @BindView(R.id.zdy_bs)
    TextView zdyBs;
    @BindView(R.id.zdn_bs)
    TextView zdnBs;
    @BindView(R.id.zdy_sy)
    TextView zdySy;
    @BindView(R.id.zdn_sy)
    TextView zdnSy;
    @BindView(R.id.zdy_bc)
    TextView zdyBc;
    @BindView(R.id.zdn_bc)
    TextView zdnBc;
    @BindView(R.id.zdy_yb)
    TextView zdyYb;
    @BindView(R.id.zdn_yb)
    TextView zdnYb;
    @BindView(R.id.zdy_cbs)
    TextView zdyCbs;
    @BindView(R.id.zdn_cbs)
    TextView zdnCbs;
    @BindView(R.id.zdy_hj)
    TextView zdyHj;
    @BindView(R.id.zdn_hj)
    TextView zdnHj;
    @BindView(R.id.swipe_refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    ProgressDialog progressDialog;
    //    月数据
    private ZDtableyuebean zDtableyuebean;
    //年数据
    private ZDtablenianbean zDtablenianbean;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homereportactivity);
        ButterKnife.bind(this);
        initView();


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
        getDate_yue();
        getDate_nian();
    }


    private void getDate_yue() {
        //网络请求
        RequestParams params = new RequestParams();
        RequestCenter.request_zd_baobiao_yue(params, new DisposeDataListener() {
            @Override
            public void onSuccess(Object o) {
                progressDialog.dismiss();
                Log.e("重点人表格月返回数据", o.toString());
                final String aa = o.toString();
                zDtableyuebean = JSON.parseObject(aa, ZDtableyuebean.class);
                Log.e("长春",zDtableyuebean.getAttributes().getThreeCount().getCc()+"");
                zdyCc.setText(zDtableyuebean.getAttributes().getThreeCount().getCc()+"");
                zdyJl.setText(zDtableyuebean.getAttributes().getThreeCount().getJl()+"");
                zdySp.setText(zDtableyuebean.getAttributes().getThreeCount().getSp()+"");
                zdyGzl.setText(zDtableyuebean.getAttributes().getThreeCount().getGzl()+"");
                zdyLy.setText(zDtableyuebean.getAttributes().getThreeCount().getLy()+"");
                zdyMhk.setText(zDtableyuebean.getAttributes().getThreeCount().getMhk()+"");
                zdyBs.setText(zDtableyuebean.getAttributes().getThreeCount().getBs()+"");
                zdySy.setText(zDtableyuebean.getAttributes().getThreeCount().getSy()+"");
                zdyBc.setText(zDtableyuebean.getAttributes().getThreeCount().getBc()+"");
                zdyYb.setText(zDtableyuebean.getAttributes().getThreeCount().getYj()+"");
                zdyCbs.setText(zDtableyuebean.getAttributes().getThreeCount().getCbs()+"");
                zdyHj.setText(zDtableyuebean.getAttributes().getThreeCount().getLy()+"");
                mSwipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onFailure(OkHttpException e) {
                progressDialog.dismiss();

                Log.e("失败", e.getEmsg() + "");
            }

        });
    }

    private void getDate_nian() {
        //网络请求
        RequestParams params = new RequestParams();
        RequestCenter.request_zd_baobiao_nian(params, new DisposeDataListener() {
            @Override
            public void onSuccess(Object o) {
                progressDialog.dismiss();
                Log.e("重点人表格年返回数据", o.toString());
                final String aa = o.toString();
                zDtablenianbean = JSON.parseObject(aa,ZDtablenianbean.class);
                zdnCc.setText(zDtablenianbean.getAttributes().getAllCount().getCc()+"");
                zdnJl.setText(zDtablenianbean.getAttributes().getAllCount().getJl()+"");
                zdnSp.setText(zDtablenianbean.getAttributes().getAllCount().getSp()+"");
                zdnGzl.setText(zDtablenianbean.getAttributes().getAllCount().getGzl()+"");
                zdnLy.setText(zDtablenianbean.getAttributes().getAllCount().getLy()+"");
                zdnMhk.setText(zDtablenianbean.getAttributes().getAllCount().getMhk()+"");
                zdnBs.setText(zDtablenianbean.getAttributes().getAllCount().getBs()+"");
                zdnSy.setText(zDtablenianbean.getAttributes().getAllCount().getSy()+"");
                zdnBc.setText(zDtablenianbean.getAttributes().getAllCount().getBc()+"");
                zdnYb.setText(zDtablenianbean.getAttributes().getAllCount().getYj()+"");
                zdnCbs.setText(zDtablenianbean.getAttributes().getAllCount().getCbs()+"");
                zdnHj.setText(zDtablenianbean.getAttributes().getAllCount().getLy()+"");
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
        getDate_yue();
        getDate_nian();
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
