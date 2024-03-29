package com.js.retrofitdownload.bean;

import com.js.retrofitdownload.Api.DownLoadApis;

/**
 * 下载信息
 * Created by ${R.js} on 2018/3/22.
 */

public class DownloadInfo {

    /* 存储位置 */
    private String savePath;
    /* 文件总长度 */
    private long contentLength;
    /* 下载长度 */
    private long readLength;
    /* 下载该文件的url */
    private String url;
    private DownLoadApis apis;


    public DownLoadApis getApis() {
        return apis;
    }

    public void setApis(DownLoadApis apis) {
        this.apis = apis;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public long getReadLength() {
        return readLength;
    }

    public void setReadLength(long readLength) {
        this.readLength = readLength;
    }

    @Override
    public String toString() {
        return "DownloadInfo{" +
                "savePath='" + savePath + '\'' +
                ", contentLength=" + contentLength +
                ", readLength=" + readLength +
                ", url='" + url + '\'' +
                '}';
    }
}
