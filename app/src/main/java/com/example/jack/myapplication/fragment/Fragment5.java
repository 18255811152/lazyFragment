package com.example.jack.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jack.myapplication.R;

public class Fragment5 extends BaseFragment {


    public Fragment5() {
    }

    public static Fragment5 newInstance() {
        Fragment5 fragment1 = new Fragment5();
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
