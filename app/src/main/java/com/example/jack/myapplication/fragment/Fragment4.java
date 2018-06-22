package com.example.jack.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jack.myapplication.R;

public class Fragment4 extends BaseFragment {


    public Fragment4() {
    }

    public static Fragment4 newInstance() {
        Fragment4 fragment1 = new Fragment4();
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
