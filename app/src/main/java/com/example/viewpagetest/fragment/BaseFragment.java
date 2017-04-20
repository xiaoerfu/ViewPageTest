package com.example.viewpagetest.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lijianfu on 2017/4/20.
 */
public abstract class BaseFragment extends Fragment{
    public Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        //获取上下文操作
        context = getActivity();
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View curentView = initView();
        return curentView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        //初始化数据
        initData();
        super.onActivityCreated(savedInstanceState);
    }

    /*抽象方法，子类调用*/
    public abstract View initView();

    public abstract View initData();

}
