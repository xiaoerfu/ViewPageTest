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
public class AddressFragment extends BaseFragment{

    @Override
    public View initView() {
        View view= View.inflate(context,R.layout.fragment_address,null);
        return view;
    }

    @Override
    public View initData() {
        return null;
    }
}
