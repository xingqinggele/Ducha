package com.zhhl.ducha.uri;


import com.example.toollibrary.okhttp.CommonOkHttpClient;
import com.example.toollibrary.okhttp.listener.DisposeDataHandle;
import com.example.toollibrary.okhttp.listener.DisposeDataListener;
import com.example.toollibrary.okhttp.request.CommonRequest;
import com.example.toollibrary.okhttp.request.RequestParams;

import static com.zhhl.ducha.uri.UrlService.LOGIN;
import static com.zhhl.ducha.uri.UrlService.QISHI1;
import static com.zhhl.ducha.uri.UrlService.QISHI1_DETALIS;


/**
 * 描述:     统一管理所有的请求
 */

public class RequestCenter {


    /**
     * 登录账号
     * @param params
     * @param listener
     */
    public static void requestLogin(RequestParams params, DisposeDataListener listener){
        CommonOkHttpClient.post(CommonRequest.createPostRequest(LOGIN, params),
                new DisposeDataHandle(listener));
    }
    // 领导列表
    public static void request_Qishi1(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI1,params)),new DisposeDataHandle(listener));
    }

    // 领导详情
    public static void request_Qishi1_Detalis(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI1_DETALIS,params)),new DisposeDataHandle(listener));
    }


}
