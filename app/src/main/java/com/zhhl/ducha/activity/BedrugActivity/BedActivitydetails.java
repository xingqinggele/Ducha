package com.zhhl.ducha.activity.BedrugActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;

import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/11 14:05.
 */
public class BedActivitydetails extends BaseActivity {
    @BindView(R.id.back)
    RelativeLayout back;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bedactivitydetails);
        ButterKnife.bind(this);
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
