package com.tianyj.netyiyun.base;

import android.arch.lifecycle.ViewModel;

/**
 * Created by tianyj on 10/17/18.
 */

public class BaseListViewModel extends ViewModel {

    public int mPage = 0;

    public int getPage() {
        return mPage;
    }

    public void setPage(int mPage) {
        this.mPage = mPage;
    }
}
