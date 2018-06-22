package com.example.jack.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterFragment extends FragmentPagerAdapter {
    private List<Fragment> mFragments = new ArrayList<>();
    private FragmentManager fragmentManager;

    public AdapterFragment(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        fragments.clear();
        mFragments.addAll(fragments);
    }

    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
