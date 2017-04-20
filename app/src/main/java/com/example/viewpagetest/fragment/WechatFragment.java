package com.example.viewpagetest.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpagetest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WechatFragment extends BaseFragment {

    @Override
    public View initData() {
        return null;
    }

    @Override
    public View initView() {
        return View.inflate(context,R.layout.fragment_wechat,null);
    }
}
