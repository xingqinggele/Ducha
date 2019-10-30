package com.zhhl.ducha.activity.TableActivity;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;

import butterknife.ButterKnife;

/**
 * Created by qgl on 2019/10/30 17:14.
 */
public class SWTableActivity extends BaseActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swtableactivity);
        ButterKnife.bind(this);

    }
}
