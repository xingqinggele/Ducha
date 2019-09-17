package com.zhhl.ducha.activity.ZDActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.fastjson.JSON;
import com.example.toollibrary.okhttp.exception.OkHttpException;
import com.example.toollibrary.okhttp.listener.DisposeDataListener;
import com.example.toollibrary.okhttp.request.RequestParams;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;
import com.zhhl.ducha.adapter.ZDKeyAdapter.Keypersonadpter;
import com.zhhl.ducha.bean.Homebean;
import com.zhhl.ducha.fragment.KeyFragment.LingdaoFragment;
import com.zhhl.ducha.fragment.KeyFragment.ShikongFragment;
import com.zhhl.ducha.fragment.KeyFragment.ZhongdianFragment;
import com.zhhl.ducha.uri.RequestCenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/9 16:19.
 */
public class KeypersonnelActivity extends BaseActivity {
    @BindView(R.id.keyper_rab1)
    RadioButton keyperRab1;
    @BindView(R.id.keyper_rab2)
    RadioButton keyperRab2;
    @BindView(R.id.keyper_rab3)
    RadioButton keyperRab3;
    @BindView(R.id.back)
    RelativeLayout back;
    @BindView(R.id.key_viewpager)
    ViewPager viewPager;
    @BindView(R.id.key_group)
    RadioGroup keyGroup;
    private String code;
    private FragmentManager fm;
    private ArrayList<Object> items = new ArrayList<Object>();
    private ViewPagerAdapter adapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keypersonnelactivity);
        ButterKnife.bind(this);
        Intent intent = this.getIntent();
        code = intent.getExtras().getString("code");
        Toast.makeText(this, code, Toast.LENGTH_SHORT).show();
        fm = this.getSupportFragmentManager();
        items.add(new LingdaoFragment());
        items.add(new ZhongdianFragment());
        items.add(new ShikongFragment());
        adapter = new ViewPagerAdapter(fm, items);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0, false);
        viewPager.setOffscreenPageLimit(items.size());
        initEvent();
    }

    @OnClick(R.id.back)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
        }
    }


    @SuppressWarnings("deprecation")
    private void initEvent() {
        keyGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.keyper_rab1:
                        viewPager.setCurrentItem(0);// 选择某一页

                        break;
                    case R.id.keyper_rab2:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.keyper_rab3:
                        viewPager.setCurrentItem(2);// 选择某一页
                        break;


                }
            }
        });
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        keyperRab1.setChecked(true);
                        break;
                    case 1:
                        keyperRab2.setChecked(true);
                        break;
                    case 2:
                        keyperRab3.setChecked(true);
                        break;

                }
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    /*
     * 获取屏幕的宽度
     */
    private int getW(Context context) {
        DisplayMetrics dm = new DisplayMetrics();
        WindowManager windowMgr = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        windowMgr.getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Object> items;

        public ViewPagerAdapter(FragmentManager fm, ArrayList<Object> items) {
            super(fm);
            this.items = items;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return (Fragment) items.get(position);
                case 1:
                    return (Fragment) items.get(position);
                case 2:
                    return (Fragment) items.get(position);
                case 3:
                    return (Fragment) items.get(position);
            }
            return (Fragment) items.get(position);

        }

        @Override
        public int getCount() {
            return items.size();
        }

    }

}
