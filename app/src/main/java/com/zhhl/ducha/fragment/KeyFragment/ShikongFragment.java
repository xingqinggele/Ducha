package com.zhhl.ducha.fragment.KeyFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zhhl.ducha.R;

/**
 * Created by qgl on 2019/9/16 10:00.
 */
public class ShikongFragment extends Fragment
{
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.shikongfragment, container, false);
        return view;

    }
}