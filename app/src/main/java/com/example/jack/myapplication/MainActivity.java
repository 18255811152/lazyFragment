package com.example.jack.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.jack.myapplication.adapter.AdapterFragment;
import com.example.jack.myapplication.fragment.Fragment1;
import com.example.jack.myapplication.fragment.Fragment2;
import com.example.jack.myapplication.fragment.Fragment3;
import com.example.jack.myapplication.fragment.Fragment4;
import com.example.jack.myapplication.fragment.Fragment5;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    @BindView(R.id.content_viewpager)
    ViewPager mViewPager;
    @BindView(R.id.home)
    LinearLayout home;
    @BindView(R.id.live)
    LinearLayout live;
    @BindView(R.id.circle)
    LinearLayout circle;
    @BindView(R.id.predict)
    LinearLayout predict;
    @BindView(R.id.user)
    LinearLayout user;

    private static final int TAB_INDEX_HOME = 0;
    private static final int TAB_INDEX_LIVE = 1;
    private static final int TAB_INDEX_CIRCLE = 2;
    private static final int TAB_INDEX_PREDICT = 3;
    private static final int TAB_INDEX_UERR = 4;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(Fragment1.newInstance());
        fragments.add(Fragment2.newInstance());
        fragments.add(Fragment3.newInstance());
        fragments.add(Fragment4.newInstance());
        fragments.add(Fragment5.newInstance());
        AdapterFragment adapterFragment = new AdapterFragment(fragmentManager, fragments);
//        mViewPager.setPageTransformer(true,new DepthPageTransformer());
        mViewPager.setAdapter(adapterFragment);

        // 初始化选中home页
        swithTab(TAB_INDEX_HOME);
        // mNavigationView.setItemIconTintList(null);
        // 预加载数量
        mViewPager.setOffscreenPageLimit(4);

        // viewpager 设置滚动监听
        mViewPager.addOnPageChangeListener(this);
    }


    @Override
    public void onPageScrolled(int i, float v, int i1) {
        changeTabState(i);
    }

    @Override
    public void onPageSelected(int i) {

    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    @OnClick({R.id.home, R.id.live, R.id.circle, R.id.predict, R.id.user})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home:
                swithTab(TAB_INDEX_HOME);
                break;
            case R.id.live:
                swithTab(TAB_INDEX_LIVE);
                break;
            case R.id.circle:
                swithTab(TAB_INDEX_CIRCLE);
                break;
            case R.id.predict:
                swithTab(TAB_INDEX_PREDICT);
                break;
            case R.id.user:
                swithTab(TAB_INDEX_UERR);
                break;
        }
    }

    /*设置viewpager滑动 以及点击的位置*/
    private void swithTab(int index) {
        switch (index) {
            case TAB_INDEX_HOME:
                mViewPager.setCurrentItem(TAB_INDEX_HOME);
                changeTabState(TAB_INDEX_HOME);
                break;
            case TAB_INDEX_LIVE:
                mViewPager.setCurrentItem(TAB_INDEX_LIVE);
                changeTabState(TAB_INDEX_LIVE);
                break;
            case TAB_INDEX_CIRCLE:
                mViewPager.setCurrentItem(TAB_INDEX_CIRCLE);
                changeTabState(TAB_INDEX_CIRCLE);
                break;
            case TAB_INDEX_PREDICT:
                mViewPager.setCurrentItem(TAB_INDEX_PREDICT);
                changeTabState(TAB_INDEX_PREDICT);
                break;
            case TAB_INDEX_UERR:
                mViewPager.setCurrentItem(TAB_INDEX_UERR);
                changeTabState(TAB_INDEX_UERR);
                break;
        }
    }

    /*设置点击之后的状态*/
    private void changeTabState(int index) {
        switch (index) {
            case TAB_INDEX_HOME:
                home.setSelected(true);
                live.setSelected(false);
                circle.setSelected(false);
                predict.setSelected(false);
                user.setSelected(false);
                break;
            case TAB_INDEX_LIVE:
                home.setSelected(false);
                live.setSelected(true);
                circle.setSelected(false);
                predict.setSelected(false);
                user.setSelected(false);
                break;
            case TAB_INDEX_CIRCLE:
                home.setSelected(false);
                live.setSelected(false);
                circle.setSelected(true);
                predict.setSelected(false);
                user.setSelected(false);
                break;
            case TAB_INDEX_PREDICT:
                home.setSelected(false);
                live.setSelected(false);
                circle.setSelected(false);
                predict.setSelected(true);
                user.setSelected(false);
                break;
            case TAB_INDEX_UERR:
                home.setSelected(false);
                live.setSelected(false);
                circle.setSelected(false);
                predict.setSelected(false);
                user.setSelected(true);
                break;
        }
    }

}
