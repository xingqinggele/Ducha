package com.zhhl.ducha.activity.ZDActivity.lieguanactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BaseActivity;
import com.zhhl.ducha.activity.TableActivity.LTableActivity1;
import com.zhhl.ducha.activity.TableActivity.LTableActivity2;
import com.zhhl.ducha.fragment.KeyFragment.LingdaoFragment;
import com.zhhl.ducha.fragment.KeyFragment.ZhongdianFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by qgl on 2019/9/9 16:19.
 */
public class YingdanglieguanlActivity extends BaseActivity {
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
    private String code;
    private FragmentManager fm;
    private ArrayList<Object> items = new ArrayList<Object>();
    private ViewPagerAdapter adapter;
    @BindView(R.id.tv_table)
    TextView tv_table;
    private String type = "1";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keypersonnelactivity);
        ButterKnife.bind(this);
        fm = this.getSupportFragmentManager();
        items.add(new LingdaoFragment());
        items.add(new ZhongdianFragment());
        adapter = new ViewPagerAdapter(fm, items);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0, false);
        viewPager.setOffscreenPageLimit(items.size());
        initEvent();
    }

    @OnClick({R.id.back,R.id.tv_table})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.tv_table:
                Log.e("type",type);
                if (type.equals("1"))
                {
                    Intent intent = new Intent(YingdanglieguanlActivity.this, LTableActivity1.class);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(YingdanglieguanlActivity.this, LTableActivity2.class);
                    startActivity(intent);
                }

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
                        type = "1";
                        break;
                    case R.id.keyper_rab2:
                        viewPager.setCurrentItem(1);
                        type = "2";
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
                        type = "1";
                        break;
                    case 1:
                        keyperRab2.setChecked(true);
                        type = "2";
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
            }
            return (Fragment) items.get(position);

        }

        @Override
        public int getCount() {
            return items.size();
        }

    }

}
