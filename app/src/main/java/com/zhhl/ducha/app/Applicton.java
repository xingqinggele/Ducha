package com.zhhl.ducha.app;

import android.app.Application;
import android.content.Context;

import com.example.toollibrary.Library;

/**
 * Created by qgl on 2019/9/12 9:44.
 */
public class Applicton extends Application
{
    private Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        //初始化（否则报错）
        Library.init(context);
        //日志上传数据配置(需要日志上传时配置)
        Library.setData("http://192.168.1.113","8080","/log","重点人员关注","107");
    }
}
