package com.tianyj.netyiyun;

import android.databinding.DataBindingUtil;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.tianyj.netyiyun.databinding.ActivityMainBinding;
import com.tianyj.netyiyun.databinding.NavHeaderMainBinding;
import com.tianyj.netyiyun.ui.wan.WanFragment;
import com.tianyj.netyiyun.view.MyFragmentPagerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private static final String TAG = "MainActivity";

    private FrameLayout llTitleMenu;
    private Toolbar toolbar;
    private NavigationView navView;
    private DrawerLayout drawerLayout;
    private ViewPager vpContent;
    private ActivityMainBinding mBinding;
    private ImageView ivTitleOne;
    private ImageView ivTitleTwo;
    private ImageView ivTitleThree;
    //
    private NavHeaderMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //
        initId();
        //initRxBus();

        initContentFragment();
        initDrawerLayout();
        initListener();

    }

    private void initId() {
        drawerLayout = mBinding.drawerLayout;
        navView = mBinding.navView;
        toolbar = mBinding.include.toolbar;
        llTitleMenu = mBinding.include.llTitleMenu;
        vpContent = mBinding.include.vpContent;
        ivTitleOne = mBinding.include.ivTitleOne;
        ivTitleTwo = mBinding.include.ivTitleTwo;
        ivTitleThree = mBinding.include.ivTitleThree;
    }

    private void initListener() {
        llTitleMenu.setOnClickListener(this);
        mBinding.include.ivTitleOne.setOnClickListener(this);
        mBinding.include.ivTitleTwo.setOnClickListener(this);
        mBinding.include.ivTitleThree.setOnClickListener(this);
    }

    private void initDrawerLayout() {
        navView.inflateHeaderView(R.layout.nav_header_main);
    }

    private void initContentFragment() {
        ArrayList<Fragment> mFragmentList = new ArrayList<>();
        mFragmentList.add(new WanFragment());
        //
        //
        //注意使用的是：getSupportFragmentManager
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), mFragmentList);
        vpContent.setAdapter(adapter);
        vpContent.setOffscreenPageLimit(2);
        vpContent.addOnPageChangeListener(this);

        //
        setCurrentItem(0);
    }

    /**
     * 每日推荐点击“新电影热放映榜”跳转
     */
    //private void initRxBus() {

    //}


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_title_menu:
                //开启菜单
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.iv_title_one:
                Log.d(TAG, "onClick: tyj #### iv_title_one vpContent.getCurrentItem(): " +
                        vpContent.getCurrentItem());
                //if (vpContent.getCurrentItem() != 0) {
                    setCurrentItem(0);
                //}
                break;
            case R.id.iv_title_two:
                Log.d(TAG, "onClick: tyj #### iv_title_two vpContent.getCurrentItem(): " +
                        vpContent.getCurrentItem());
                if (vpContent.getCurrentItem() != 1) {
                    setCurrentItem(1);
                }
                break;
            case R.id.iv_title_three:
                if (vpContent.getCurrentItem() != 2) {
                    setCurrentItem(2);
                }
                break;
            case R.id.iv_avatar:
                //WebViewActivity
                break;
            case R.id.ll_nav_exit:
                //退出应用
                finish();
                break;
            default:
                break;
        }
    }

    private void setCurrentItem(int position) {
        Log.d(TAG, "setCurrentItem: tyj #### position: " + position);
        boolean isOne = false;
        boolean isTwo = false;
        boolean isThree = false;
        switch (position) {
            case 0:
                isOne = true;
                break;
            case 1:
                isTwo = true;
                break;
            case 2:
                isThree = true;
                break;
            default:
                isTwo = true;
                break;
        }
        vpContent.setCurrentItem(position);
        ivTitleOne.setSelected(isOne);
        ivTitleTwo.setSelected(isTwo);
        ivTitleThree.setSelected(isThree);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Log.d(TAG, "onPageSelected: tyj ###### position: " + position);
        switch (position) {
            case 0:
                setCurrentItem(0);
                break;
            case 1:
                setCurrentItem(1);
                break;
            case 2:
                setCurrentItem(2);
                break;
            default:
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
