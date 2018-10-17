package com.tianyj.netyiyun.bean.wanandroid;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.tianyj.netyiyun.BR;

import java.util.List;

import retrofit2.http.PUT;

/**
 * Created by tianyj on 10/16/18.
 */

public class HomeListBean extends BaseObservable {

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"http://www.wanandroid.com/blogimgs/e8faab6b-ecb1-4bc2-af96-f7e5039032b3.apk","author":"GcsSloop","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    @Bindable
    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
        notifyPropertyChanged(BR.data);
    }

    @Bindable
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
        notifyPropertyChanged(BR.errorCode);
    }

    @Bindable
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        notifyPropertyChanged(BR.errorMsg);
    }

    public static class DataBean extends BaseObservable {

        /**
         * curPage : 2
         * datas : [{"apkLink":"http://www.wanandroid.com/blogimgs/e8faab6b-ecb1-4bc2-af96-f7e5039032b3.apk","author":"GcsSloop","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"Diycode 社区客户端，可以更方便的在手机上查看社区信息。应用采用了数据多级缓存，并且实现了离线浏览(访问过一次的页面会被缓存下来，没有网络也可查看)，相比于网页版，在一定程度上可以减少在手机上访问的流量消耗。由于目前功能尚未完善，还存在一些已知或未知的bug，所以当前版本仅为 beta 测试版。","envelopePic":"http://www.wanandroid.com/blogimgs/8876bcc1-7d12-4443-bf95-3f9a698685a6.png","id":2241,"link":"http://ww
         * offset : 20
         * pageCount : 53
         * size : 20
         * total : 1049
         */

        private int curPage;
        private int offset;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        @Bindable
        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
            notifyPropertyChanged(BR.curPage);
        }

        @Bindable
        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
            notifyPropertyChanged(BR.offset);
        }

        @Bindable
        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
            notifyPropertyChanged(BR.pageCount);
        }

        @Bindable
        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
            notifyPropertyChanged(BR.size);
        }

        @Bindable
        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
            notifyPropertyChanged(BR.total);
        }

        @Bindable
        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
            notifyPropertyChanged(BR.datas);
        }

        public static class DatasBean {

            private String apkLink;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private int id;
            private int originId = -1; //收藏文章列表里面的原始文章id
            private String link;
            private String niceDate;
            private String origin;
            private String projectLink;
            private long publishTime;
            private String title;
            private int visible;
            private int zan;

            public int getOriginId() {
                return originId;
            }

            public void setOriginId(int originId) {
                this.originId = originId;
            }

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }



        }

    }

}
