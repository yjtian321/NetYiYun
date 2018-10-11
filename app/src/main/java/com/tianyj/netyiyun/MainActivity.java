package com.tianyj.netyiyun;

import android.databinding.DataBindingUtil;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.tianyj.netyiyun.databinding.ActivityMainBinding;
import com.tianyj.netyiyun.databinding.NavHeaderMainBinding;

public class MainActivity extends AppCompatActivity {

    private FrameLayout llTitleMenu;
    private Toolbar toolbar;
    private FloatingActionButton fab;
    private NavigationView navView;
    private DrawerLayout drawerLayout;
    private ViewPager vpContent;
    private ActivityMainBinding mBinding;
    private ImageView ivTitleOne;
    private ImageView ivTitleTwo;
    private ImageView ivTitleThree;

    private NavHeaderMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initId();
        //initRxBus();


        initDrawerLayout();

    }

    private void initId() {
        navView = mBinding.navView;
        fab = mBinding.include.fab;
    }

    private void initDrawerLayout() {
        navView.inflateHeaderView(R.layout.nav_header_main);
    }
}
