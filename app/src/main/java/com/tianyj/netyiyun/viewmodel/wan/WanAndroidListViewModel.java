package com.tianyj.netyiyun.viewmodel.wan;

import com.tianyj.netyiyun.base.BaseListViewModel;

import java.util.ArrayList;

import rx.Subscription;

/**
 * Created by tianyj on 10/17/18.
 */

public class WanAndroidListViewModel extends BaseListViewModel {

    private WanNavigator.BannerNavigator loadBannerNavigator;
    private WanNavigator.ArticleListNavigation navigation;
    private ArrayList<String> mBannerImages;
    private ArrayList<String> mBannerTitles;

    public void setNavigation(WanNavigator.BannerNavigator navigation) {
        this.loadBannerNavigator = navigation;
    }

    public void setArticleListNavigation(WanNavigator.ArticleListNavigation navigation) {
        this.navigation = navigation;
    }

    public void getWanAndroidBanner() {
        //Subscription subscribe = HttpClient.Builder.
    }

    public void getHomeList(Integer cid) {

    }

}
