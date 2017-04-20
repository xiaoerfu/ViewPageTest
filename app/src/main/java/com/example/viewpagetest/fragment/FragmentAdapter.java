package com.example.viewpagetest.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijianfu on 2017/4/20.
 * 创建适配器，对fragment的管理
 */
public class FragmentAdapter extends FragmentPagerAdapter{

    List<BaseFragment>mFragments = new ArrayList<BaseFragment>();

    public FragmentAdapter(FragmentManager fm, List<BaseFragment>fragments){
        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
