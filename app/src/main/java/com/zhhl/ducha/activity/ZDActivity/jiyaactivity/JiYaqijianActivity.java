package com.zhhl.ducha.activity.ZDActivity.jiyaactivity;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;
import com.zhhl.ducha.fragment.JiYaqijianFragment.DeadFragment;
import com.zhhl.ducha.fragment.JiYaqijianFragment.JiYaqijianFragment;
import com.zhhl.ducha.fragment.JiYaqijianFragment.NetescapeFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/17 15:29.
 */
public class JiYaqijianActivity extends BaseActivity {
    @BindView(R.id.keyper_rab1)
    RadioButton keyperRab1;
    @BindView(R.id.keyper_rab2)
    RadioButton keyperRab2;
    @BindView(R.id.back)
    RelativeLayout back;
    @BindView(R.id.key_viewpager)
    ViewPager viewPager;
    @BindView(R.id.key_group)
    RadioGroup keyGroup;
    @BindView(R.id.keyper_rab3)
    RadioButton keyperRab3;
    private String code;
    private FragmentManager fm;
    private ArrayList<Object> items = new ArrayList<Object>();
    private ViewPagerAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiyaqijianactivity);
        ButterKnife.bind(this);
        fm = this.getSupportFragmentManager();
        items.add(new DeadFragment());
        items.add(new NetescapeFragment());
        items.add(new JiYaqijianFragment());
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
                        viewPager.setCurrentItem(2);
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
            }
            return (Fragment) items.get(position);

        }

        @Override
        public int getCount() {
            return items.size();
        }

    }
}
