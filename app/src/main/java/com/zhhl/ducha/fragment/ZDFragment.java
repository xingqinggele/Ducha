package com.zhhl.ducha.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.ZDActivity.jiyaactivity.JiYaqijianActivity;
import com.zhhl.ducha.activity.ZDActivity.WALuruActivity;
import com.zhhl.ducha.activity.ZDActivity.cheguanactivity.YingdangcheguanActivity;
import com.zhhl.ducha.activity.ZDActivity.lieguanactivity.YingdanglieguanlActivity;
import com.zhhl.ducha.activity.ZDActivity.ZDShiKongActivity;

/**
 * Created by qgl on 2019/9/9 16:42.
 */
public class ZDFragment extends Fragment implements View.OnClickListener
{
    private View view;
    private RelativeLayout r1,r2,r3,r4,r5;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.zdfragment,container,false);
        r1 = view.findViewById(R.id.zdf_r1);
        r2 = view.findViewById(R.id.zdf_r2);
        r3 = view.findViewById(R.id.zdf_r3);
        r4 = view.findViewById(R.id.zdf_r4);
        r5 = view.findViewById(R.id.zdf_r5);
        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        r5.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.zdf_r1:
                Intent intent1 = new Intent(getActivity(), YingdanglieguanlActivity.class);
                startActivity(intent1);
                break;
            case R.id.zdf_r2:
                Intent intent2 = new Intent(getActivity(), YingdangcheguanActivity.class);
                startActivity(intent2);
                break;
            case R.id.zdf_r3:
                Intent intent3 = new Intent(getActivity(), JiYaqijianActivity.class);
                startActivity(intent3);
                break;
            case R.id.zdf_r4:

                Intent intent4 = new Intent(getActivity(), ZDShiKongActivity.class);
                startActivity(intent4);
                break;
            case R.id.zdf_r5:
                Intent intent5 = new Intent(getActivity(), WALuruActivity.class);
                startActivity(intent5);
                break;
        }
    }
}
