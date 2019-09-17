package com.zhhl.ducha.activity.ZDActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/9 15:55.
 */
public class HomeReportActivity extends BaseActivity {
    @BindView(R.id.back)
    RelativeLayout back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homereportactivity);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.back)
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.back:
                finish();
            break;
        }

    }
}
