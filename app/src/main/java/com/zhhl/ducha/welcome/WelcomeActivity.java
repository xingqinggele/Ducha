package com.zhhl.ducha.welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.toollibrary.activity.BaseActivity;
import com.example.toollibrary.bean.LoginBean;
import com.example.toollibrary.okhttp.exception.OkHttpException;
import com.example.toollibrary.okhttp.listener.DisposeDataListener;
import com.example.toollibrary.okhttp.request.RequestParams;
import com.example.toollibrary.projectwrapper.SplashActivityWrapper;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.MainActivity;
import com.zhhl.ducha.uri.RequestCenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/12 9:18.
 */
public class WelcomeActivity extends SplashActivityWrapper {

    @BindView(R.id.tiaozhuan)
    Button tiaozhuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
        ButterKnife.bind(this);
        //网络请求
        RequestParams params =new RequestParams();

        RequestCenter.requestLogin(params, new DisposeDataListener()
        {
            @Override
            public void onSuccess(Object o) {
                Log.e("onSuccess",o.toString());
            }

            @Override
            public void onFailure(OkHttpException e)
            {
                Log.e("onFailure",e.toString());
            }
        });
    }

    @OnClick(R.id.tiaozhuan)
    public void onViewClicked(View view) {
        switch (view.getId())
        {
            case R.id.tiaozhuan:
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
        }

    }

    /**
     * 统一验证登录成功
     * @param s 加密票据字符串
     * @param loginBean 返回的用户信息类
     */
    @Override
    public void login(String s, LoginBean loginBean) {

    }

    @Override
    public void uaacApiError(String s) {

    }


}
