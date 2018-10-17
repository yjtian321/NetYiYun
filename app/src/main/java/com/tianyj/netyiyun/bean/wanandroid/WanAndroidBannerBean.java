package com.tianyj.netyiyun.bean.wanandroid;

import java.util.List;

/**
 * Created by tianyj on 10/16/18.
 */

public class WanAndroidBannerBean {

    /**
     * data : [{"desc":"区块链养狗领取 百度莱茨狗","id":8,"imagePath":"http://www.wanandroid.com/blogimgs/a90cbfe5-b1e8-4354-8d45-e3fbf8445383.png","isVisible":1,"order":0,"title":"区块链养狗领取 百度莱茨狗","type":0,"url":"http://www.wanandroid.com/blog/show/2037"},{"desc":"","id":6,"imagePath":"http://www.wanandroid.com/blogimgs/62c1bd68-b5f3-4a3c-a649-7ca8c7dfabe6.png","isVisible":1,"order":1,"title":"我们新增了一个常用导航Tab~","type":0,"url":"http://www.wanandroid.com/navi"},{"desc":"","id":7,"imagePath":"http://www.wanandroid.com/blogimgs/ffb61454-e0d2-46e7-bc9b-4f359061ae20.png","isVisible":1,"order":2,"title":"送你一个暖心的Mock API工具","type":0,"url":"http://www.wanandroid.com/blog/show/10"},
     * errorCode : 0
     * errorMsg :
     */

    private int errorCode;
    private String errorMsg;
    private List<DataBean> data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {

        /**
         * desc: 区块链养狗领取 百度莱茨狗
         *
         * imagePath: http://www.wanandroid.com/blogimgs/a90cbfe5-b1e8-4354-8d45-e3fbf8445383.png
         * title: 区块链养狗领取 百度莱茨狗
         * url: http://www.wanandroid.com/blog/show/2037
         *
         */

        private String desc;
        private String imagePath;
        private String title;
        private String url;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
