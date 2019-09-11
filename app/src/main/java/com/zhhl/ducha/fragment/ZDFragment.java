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
import com.zhhl.ducha.activity.ZDActivity.KeypersonnelActivity;

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
                Intent intent1 = new Intent(getActivity(), KeypersonnelActivity.class);
                intent1.putExtra("code","1");
                startActivity(intent1);
                break;
            case R.id.zdf_r2:
                Intent intent2 = new Intent(getActivity(), KeypersonnelActivity.class);
                intent2.putExtra("code","2");
                startActivity(intent2);
                break;
            case R.id.zdf_r3:
                Intent intent3 = new Intent(getActivity(), KeypersonnelActivity.class);
                intent3.putExtra("code","3");
                startActivity(intent3);
                break;
            case R.id.zdf_r4:
                Intent intent4 = new Intent(getActivity(), KeypersonnelActivity.class);
                intent4.putExtra("code","4");
                startActivity(intent4);
                break;
            case R.id.zdf_r5:
                Intent intent5 = new Intent(getActivity(), KeypersonnelActivity.class);
                intent5.putExtra("code","5");
                startActivity(intent5);
                break;
        }
    }
}
