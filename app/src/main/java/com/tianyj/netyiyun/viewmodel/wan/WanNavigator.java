package com.tianyj.netyiyun.viewmodel.wan;

import com.tianyj.netyiyun.bean.wanandroid.HomeListBean;
import com.tianyj.netyiyun.bean.wanandroid.WanAndroidBannerBean;

import java.util.ArrayList;
import java.util.List;

import rx.Subscription;

/**
 * Created by tianyj on 10/16/18.
 */

public interface WanNavigator {

    /**
     * 玩安桌首页部分
     */
    interface BannerNavigator {

        void showBannerView(ArrayList<String> bannerImages, ArrayList<String> mBannerTitle, List<WanAndroidBannerBean.DataBean> result);

        void loadBannerFailure();

        void addRxSubscription(Subscription subscription);

    }

    /**
     * 文章列表导航
     */
    interface ArticleListNavigation {

        void loadHomeListFailure();

        void showAdapterView(HomeListBean bean);

        void showListNoMoreLoading();

        void showLoadSuccessView();

        void addRxSubscription(Subscription subscription);
    }
}
