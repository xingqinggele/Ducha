package com.zhhl.ducha.activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.flyco.tablayout.SlidingTabLayout;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BedrugActivity.BedReportActivity;
import com.zhhl.ducha.activity.ZDActivity.HomeReportActivity;
import com.zhhl.ducha.fragment.Bedrugrelated_fragment;
import com.zhhl.ducha.fragment.Dataquery_fragment;
import com.zhhl.ducha.fragment.ZDFragment;
import com.zhhl.ducha.xuanfu.DragFloatActionButton;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity implements View.OnClickListener
{
    private DragFloatActionButton floatbutton;
    private List<String> titles = new ArrayList<>();
    private ArrayList<Fragment> fragmentList = new ArrayList<>();
    ViewPager view_pager;
    SlidingTabLayout mSlidingTabLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatbutton = findViewById(R.id.floatbutton);
        floatbutton.setOnClickListener(this);
        view_pager = findViewById(R.id.view_pager);
        mSlidingTabLayout = findViewById(R.id.tab_layout_qgl);
        initview();
    }

    public void initview()
    {
        titles.add("涉毒");
        titles.add("重点人员");
        titles.add("数据查询");
        fragmentList.add(new Bedrugrelated_fragment());
        fragmentList.add(new ZDFragment());
        fragmentList.add(new Dataquery_fragment());
        final MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList);
        view_pager.setAdapter(adapter);
        view_pager.setOverScrollMode(ViewPager.OVER_SCROLL_NEVER);
        view_pager.setOffscreenPageLimit(titles.size());
        mSlidingTabLayout.setViewPager(view_pager);
        view_pager.setCurrentItem(1);
        //  mScrollLayout.getHelper().setCurrentScrollableContainer(fragmentList.get(0));
        view_pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0)
            {
                fragmentList.get(arg0);
                // mScrollLayout.getHelper().setCurrentScrollableContainer(fragmentList.get(arg0));
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
    }
    private class MyFragmentPagerAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList;
        public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
            super(fm);
            this.fragmentList = fragmentList;
        }
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }
        @Override
        public int getCount() {
            return fragmentList.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }
    }

    @Override
    public void onClick(View v)
    {
         switch (v.getId())
         {
             case R.id.floatbutton:
                 if (view_pager.getCurrentItem() == 0)
                 {
                     Intent intent = new Intent(MainActivity.this, BedReportActivity.class);
                     startActivity(intent);
                 }
                 else if (view_pager.getCurrentItem() == 1)
                 {
                     Intent intent = new Intent(MainActivity.this, HomeReportActivity.class);
                     startActivity(intent);
                 }
                 else if (view_pager.getCurrentItem() == 2)
                 {

                 }
                 break;
         }
    }
}
