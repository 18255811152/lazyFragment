package com.example.jack.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jack.myapplication.R;

public class Fragment1 extends BaseFragment {


    public Fragment1() {
    }

    public static Fragment1 newInstance() {
        Fragment1 fragment1 = new Fragment1();
        return fragment1;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_content, container, false);
        return view;
    }

    @Override
    protected void loadData() {

    }
}
