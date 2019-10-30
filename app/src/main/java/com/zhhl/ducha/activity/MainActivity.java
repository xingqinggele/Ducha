package com.zhhl.ducha.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.tabs.TabLayout;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BedrugActivity.BedReportActivity;
import com.zhhl.ducha.activity.ZDActivity.HomeReportActivity;
import com.zhhl.ducha.fragment.Bedrugrelated_fragment;
import com.zhhl.ducha.fragment.Dataquery_fragment;
import com.zhhl.ducha.fragment.ZDFragment;
import com.zhhl.ducha.xuanfubtn.DragFloatActionButton;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity implements View.OnClickListener {
    RelativeLayout back;
    private DragFloatActionButton floatbutton;
//    private List<String> titles = new ArrayList<>();
//    private ArrayList<Fragment> fragmentList = new ArrayList<>();
//    ViewPager view_pager;
//    SlidingTabLayout mSlidingTabLayout;

    private TabLayout tl;
    private ViewPager vp;
    //当标签数目小于等于3个时，标签栏不可滑动
    public static final int MOVABLE_COUNT = 2;
    private int tabCount = 3;
    private List<String> tabs;
    private List<Fragment> fragments;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatbutton = findViewById(R.id.floatbutton);
        floatbutton.setOnClickListener(this);
//        view_pager = findViewById(R.id.view_pager);
//        mSlidingTabLayout = findViewById(R.id.tab_layout_qgl);
        back = findViewById(R.id.back);
        back.setOnClickListener(this);

        tl = findViewById(R.id.tl);
        vp = findViewById(R.id.view_pager);
        initDatas();
        initViewPager();
        initTabLayout();
//        initview();
    }

    private void initDatas() {
        tabs = new ArrayList<>();
        tabs.add("涉毒人员");
        tabs.add("重点人员");
        tabs.add("数据查询");
        fragments = new ArrayList<>();
        fragments.add(new Bedrugrelated_fragment());
        fragments.add(new ZDFragment());
        fragments.add(new Dataquery_fragment());
    }

    private void initViewPager() {
        vp.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }
    private void initTabLayout() {
        //MODE_FIXED标签栏不可滑动，各个标签会平分屏幕的宽度
        tl.setTabMode(tabCount <= MOVABLE_COUNT ? TabLayout.MODE_FIXED : TabLayout.MODE_SCROLLABLE);
        //指示条的颜色
//        tl.setSelectedTabIndicatorColor(getResources().getColor(android.R.color.holo_blue_dark));
        tl.setSelectedTabIndicatorHeight(0);
        //关联tabLayout和ViewPager,两者的选择和滑动状态会相互影响
        tl.setupWithViewPager(vp);
        //自定义标签布局
        for (int i = 0; i < tabs.size(); i++)
        {
            TabLayout.Tab tab = tl.getTabAt(i);
            TextView tv = (TextView) LayoutInflater.from(this).inflate(R.layout.tabview_main, tl, false);
            tv.setText(tabs.get(i));
            if (i == 0)
            {
                tv.setBackground(getResources().getDrawable(R.drawable.waiting_btn1));
                Drawable drawableWeiHui1 = getResources().getDrawable(R.drawable.home_icon9);
                drawableWeiHui1.setBounds(0, 0, 50, 50);//第一0是距左右边距离，第二0是距上下边距离，第三69长度,第四宽度

                tv.setCompoundDrawables(drawableWeiHui1,null , null, null);



            }
            else
            if (i == 1)
            {
                tv.setBackground(getResources().getDrawable(R.drawable.waiting_btn2));
                Drawable drawableWeiHui2 = getResources().getDrawable(R.drawable.home_icon10);
                drawableWeiHui2.setBounds(0, 0, 50, 50);//第一0是距左右边距离，第二0是距上下边距离，第三69长度,第四宽度

                tv.setCompoundDrawables(drawableWeiHui2,null , null, null);

            }
            else
            if (i == 2)
            {
                tv.setBackground(getResources().getDrawable(R.drawable.waiting_btn3));
                Drawable drawableWeiHui3 = getResources().getDrawable(R.drawable.home_icon11);
                drawableWeiHui3.setBounds(0, 0, 50, 50);//第一0是距左右边距离，第二0是距上下边距离，第三69长度,第四宽度

                tv.setCompoundDrawables(drawableWeiHui3,null , null, null);
            }
            tab.setCustomView(tv);
        }
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Log.e("aaaaaa",position+"");
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

    }
//    public void initview() {
//        titles.add("涉毒");
//        titles.add("重点人员");
//        titles.add("数据查询");
//        fragmentList.add(new Bedrugrelated_fragment());
//        fragmentList.add(new ZDFragment());
//        fragmentList.add(new Dataquery_fragment());
//        final MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), fragmentList);
//        view_pager.setAdapter(adapter);
//        view_pager.setOverScrollMode(ViewPager.OVER_SCROLL_NEVER);
//        view_pager.setOffscreenPageLimit(titles.size());
//        mSlidingTabLayout.setViewPager(view_pager);
//        view_pager.setCurrentItem(1);
//        //  mScrollLayout.getHelper().setCurrentScrollableContainer(fragmentList.get(0));
//        view_pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//
//            @Override
//            public void onPageSelected(int arg0) {
//                fragmentList.get(arg0);
//                // mScrollLayout.getHelper().setCurrentScrollableContainer(fragmentList.get(arg0));
//            }
//
//            @Override
//            public void onPageScrolled(int arg0, float arg1, int arg2) {
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int arg0) {
//
//            }
//        });
//    }

//    private class MyFragmentPagerAdapter extends FragmentPagerAdapter {
//        private List<Fragment> fragmentList;
//
//        public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
//            super(fm);
//            this.fragmentList = fragmentList;
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return fragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return fragmentList.size();
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return titles.get(position);
//        }
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.floatbutton:
                if (vp.getCurrentItem() == 0) {
                    Intent intent = new Intent(MainActivity.this, BedReportActivity.class);
                    startActivity(intent);

                } else if (vp.getCurrentItem() == 1) {
                    Intent intent = new Intent(MainActivity.this, HomeReportActivity.class);
                    startActivity(intent);
                } else if (vp.getCurrentItem() == 2) {

                }
                break;
            case R.id.back:
                finish();
                break;
        }
    }


}
