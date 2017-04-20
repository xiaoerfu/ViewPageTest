package com.example.viewpagetest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.viewpagetest.fragment.AddressFragment;
import com.example.viewpagetest.fragment.BaseFragment;
import com.example.viewpagetest.fragment.FragmentAdapter;
import com.example.viewpagetest.fragment.FriendFragment;
import com.example.viewpagetest.fragment.SettingFragment;
import com.example.viewpagetest.fragment.WechatFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.viewpages)
    ViewPager viewPages;
    @BindView(R.id.btn_tab_bottom_weixin)
    ImageButton btnTabBottomWeixin;
    @BindView(R.id.id_tab_bottom_weixin)
    LinearLayout idTabBottomWeixin;
    @BindView(R.id.btn_tab_bottom_friend)
    ImageButton btnTabBottomFriend;
    @BindView(R.id.id_tab_bottom_friend)
    LinearLayout idTabBottomFriend;
    @BindView(R.id.btn_tab_bottom_contact)
    ImageButton btnTabBottomContact;
    @BindView(R.id.id_tab_bottom_contact)
    LinearLayout idTabBottomContact;
    @BindView(R.id.btn_tab_bottom_setting)
    ImageButton btnTabBottomSetting;
    @BindView(R.id.id_tab_bottom_setting)
    LinearLayout idTabBottomSetting;
    @BindView(R.id.ly_main_tab_bottom)
    RelativeLayout lyMainTabBottom;
    @BindView(R.id.wechate)
    TextView wechate;
    @BindView(R.id.friends)
    TextView friends;
    @BindView(R.id.contacts)
    TextView contacts;
    @BindView(R.id.set)
    TextView set;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        /*添加fragment*/
        List<BaseFragment> mFragments = new ArrayList<BaseFragment>();
        mFragments.add(new WechatFragment());
        mFragments.add(new FriendFragment());
        mFragments.add(new AddressFragment());
        mFragments.add(new SettingFragment());

        System.out.println("排序前："+mFragments);

        /*不进行预加载*/
        viewPages.setOffscreenPageLimit(0);

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragments);
        viewPages.setAdapter(fragmentAdapter);

        /*设置第一页tab为选中状态*/
        changeTab(0);

        //给ViewPage添加监听事件
        viewPages.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //选中当前的page页面的时候，调用
                changeTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        /**
         * 给独步tab的btn加入点击事件
         */
        btnTabBottomWeixin.setOnClickListener(this);
        btnTabBottomFriend.setOnClickListener(this);
        btnTabBottomContact.setOnClickListener(this);
        btnTabBottomSetting.setOnClickListener(this);
    }

    /*根据当前位置切换对应的Fragment*/
    private void changeTab(int position) {
        //清空原来的位置
        btnTabBottomWeixin.setSelected(false);
        btnTabBottomFriend.setSelected(false);
        btnTabBottomContact.setSelected(false);
        btnTabBottomSetting.setSelected(false);

        //针对对应的position
        switch (position) {
            case 0:
                btnTabBottomWeixin.setSelected(true);
                wechate.setTextColor(Color.RED);
                friends.setTextColor(Color.BLUE);
                contacts.setTextColor(Color.BLUE);
                set.setTextColor(Color.BLUE);
                break;
            case 1:
                btnTabBottomFriend.setSelected(true);
                wechate.setTextColor(Color.BLUE);
                friends.setTextColor(Color.RED);
                contacts.setTextColor(Color.BLUE);
                set.setTextColor(Color.BLUE);
                break;
            case 2:
                btnTabBottomContact.setSelected(true);
                wechate.setTextColor(Color.BLUE);
                friends.setTextColor(Color.BLUE);
                contacts.setTextColor(Color.RED);
                set.setTextColor(Color.BLUE);
                break;
            case 3:
                btnTabBottomSetting.setSelected(true);
                wechate.setTextColor(Color.BLUE);
                friends.setTextColor(Color.BLUE);
                contacts.setTextColor(Color.BLUE);
                set.setTextColor(Color.RED);
                break;
        }

        /*根据当前的btn位置，切换fragment*/
        viewPages.setCurrentItem(position);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tab_bottom_weixin:
                changeTab(0);
                wechate.setTextColor(Color.RED);
                friends.setTextColor(Color.BLUE);
                contacts.setTextColor(Color.BLUE);
                set.setTextColor(Color.BLUE);
                break;
            case R.id.btn_tab_bottom_friend:
                changeTab(1);
                wechate.setTextColor(Color.BLUE);
                friends.setTextColor(Color.RED);
                contacts.setTextColor(Color.BLUE);
                set.setTextColor(Color.BLUE);
                break;
            case R.id.btn_tab_bottom_contact:
                changeTab(2);
                wechate.setTextColor(Color.BLUE);
                friends.setTextColor(Color.BLUE);
                contacts.setTextColor(Color.RED);
                set.setTextColor(Color.BLUE);
                break;
            case R.id.btn_tab_bottom_setting:
                changeTab(3);
                wechate.setTextColor(Color.BLUE);
                friends.setTextColor(Color.BLUE);
                contacts.setTextColor(Color.BLUE);
                set.setTextColor(Color.RED);
                break;
        }

    }
}
