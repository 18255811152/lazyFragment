package com.example.jack.myapplication.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {
    private Context mContext;
    private boolean isViewCreated;/*fragment 对view是否加载完*/
    private boolean isVisible;/*fragment 对user是否可见*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        isViewCreated = true;
        lazyLoad();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            isVisible = true;
            lazyLoad();
        } else {
            isViewCreated = false;
        }
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private void lazyLoad() {
        /*进行双重标记判断，确保在oncreate加载前用户可见*/
        if (isViewCreated && isVisible) {
            loadData();
            /*加载数据完，恢复标记，防止重复加载*/
            isVisible = false;
            isViewCreated = false;
        }

    }

    protected abstract void loadData();
}
