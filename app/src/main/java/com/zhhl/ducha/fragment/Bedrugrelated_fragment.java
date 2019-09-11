package com.zhhl.ducha.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BedrugActivity.BedActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by qgl on 2019/9/10 9:01.
 */
public class Bedrugrelated_fragment extends Fragment {
    @BindView(R.id.home_img1)
    ImageView homeImg1;
    @BindView(R.id.zdf_r1)
    RelativeLayout zdfR1;
    @BindView(R.id.home_img2)
    ImageView homeImg2;
    @BindView(R.id.zdf_r2)
    RelativeLayout zdfR2;
    @BindView(R.id.home_img3)
    ImageView homeImg3;
    @BindView(R.id.zdf_r3)
    RelativeLayout zdfR3;
    @BindView(R.id.home_img4)
    ImageView homeImg4;
    @BindView(R.id.zdf_r4)
    RelativeLayout zdfR4;
    @BindView(R.id.home_img5)
    ImageView homeImg5;
    @BindView(R.id.zdf_r5)
    RelativeLayout zdfR5;
    private View view;

    private Unbinder unbinder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.bedrugrelated_fragment, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.zdf_r1, R.id.zdf_r2, R.id.zdf_r3, R.id.zdf_r4,R.id.zdf_r5})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.zdf_r1:
                Intent intent1 = new Intent(getActivity(), BedActivity.class);
                intent1.putExtra("code","一次涉毒案件");
                startActivity(intent1);
                break;
            case R.id.zdf_r2:
                Intent intent2 = new Intent(getActivity(), BedActivity.class);
                intent2.putExtra("code","二次涉毒案件");
                startActivity(intent2);
                break;
            case R.id.zdf_r3:
                Intent intent3 = new Intent(getActivity(), BedActivity.class);
                intent3.putExtra("code","三次涉毒案件");
                startActivity(intent3);
                break;
            case R.id.zdf_r4:
                Intent intent4 = new Intent(getActivity(), BedActivity.class);
                intent4.putExtra("code","多次涉毒案件");
                startActivity(intent4);
                break;
            case R.id.zdf_r5:
                Intent intent5 = new Intent(getActivity(), BedActivity.class);
                intent5.putExtra("code","涉毒人员驾驶证为吊销");
                startActivity(intent5);
                break;
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
