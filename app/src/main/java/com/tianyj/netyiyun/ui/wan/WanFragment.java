package com.tianyj.netyiyun.ui.wan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.tianyj.netyiyun.R;
import com.tianyj.netyiyun.base.BaseFragment;
import com.tianyj.netyiyun.databinding.FragmentBookBinding;
import com.tianyj.netyiyun.view.MyFragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by tianyj on 10/11/18.
 */

public class WanFragment extends BaseFragment<FragmentBookBinding> {

    private static final String TAG = "WanFragment";
    
    private ArrayList<String> mTitleList = new ArrayList<>(3);
    private ArrayList<Fragment> mFragments = new ArrayList<>(3);

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: tyj ######");
        
        showLoading();
        initFragmentList();

        MyFragmentPagerAdapter myAdapter = new MyFragmentPagerAdapter(getChildFragmentManager(), mFragments, mTitleList);
        bindingView.vpBook.setAdapter(myAdapter);
        //左右预加载页面的个数
        bindingView.vpBook.setOffscreenPageLimit(2);
        myAdapter.notifyDataSetChanged();
        bindingView.tabBook.setTabMode(TabLayout.MODE_FIXED);
        bindingView.tabBook.setupWithViewPager(bindingView.vpBook);
        showContentView();
    }

    @Override
    public int setContent() {
        return R.layout.fragment_book;
    }

    private void initFragmentList() {
        mTitleList.clear();
        mTitleList.add("玩安桌");
        mTitleList.add("书籍");
        mTitleList.add("段子");

    }
}
