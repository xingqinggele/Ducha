package com.zhhl.ducha.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zhhl.ducha.R;

/**
 * Created by qgl on 2019/9/10 9:03.
 */
public class Dataquery_fragment extends Fragment
{
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.dataquery_fragment,container,false);
        return view;
    }

}
