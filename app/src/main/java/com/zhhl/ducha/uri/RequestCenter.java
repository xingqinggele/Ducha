package com.zhhl.ducha.uri;


import com.example.toollibrary.okhttp.CommonOkHttpClient;
import com.example.toollibrary.okhttp.listener.DisposeDataHandle;
import com.example.toollibrary.okhttp.listener.DisposeDataListener;
import com.example.toollibrary.okhttp.request.CommonRequest;
import com.example.toollibrary.okhttp.request.RequestParams;

import static com.zhhl.ducha.uri.UrlService.LOGIN;
import static com.zhhl.ducha.uri.UrlService.QISHI1;
import static com.zhhl.ducha.uri.UrlService.QISHI1_DETALIS;
import static com.zhhl.ducha.uri.UrlService.QISHI2;
import static com.zhhl.ducha.uri.UrlService.QISHI2_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI3;
import static com.zhhl.ducha.uri.UrlService.QISHI3_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI4;
import static com.zhhl.ducha.uri.UrlService.QISHI4_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI5;
import static com.zhhl.ducha.uri.UrlService.QISHI5_DETAILS;
import static com.zhhl.ducha.uri.UrlService.ZD_baobiao_nian;
import static com.zhhl.ducha.uri.UrlService.ZD_baobiao_yue;


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

    // 重点人异地居住一年以上
    public static void request_Qishi2(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI2,params)),new DisposeDataHandle(listener));
    }

    // 重点人异地居住一年以上详情
    public static void request_Qishi2_Deyalis(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI2_DETAILS,params)),new DisposeDataHandle(listener));
    }

//    死亡为撤管
    public static void request_Qishi3(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI3,params)),new DisposeDataHandle(listener));
    }
    //    死亡为撤管详情
    public static void request_Qishi3_details(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI3_DETAILS,params)),new DisposeDataHandle(listener));
    }

    //    已死亡重点人仍有见面稳控考察记录
    public static void request_Qishi4(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI4,params)),new DisposeDataHandle(listener));
    }
    //    已死亡重点人仍有见面稳控考察记录详情
    public static void request_Qishi4_details(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI4_DETAILS,params)),new DisposeDataHandle(listener));
    }

    //    被列为网逃后仍有见面稳控考察记录
    public static void request_Qishi5(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI5,params)),new DisposeDataHandle(listener));
    }
    //    被列为网逃后仍有见面稳控考察记录详情
    public static void request_Qishi5_details(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI5_DETAILS,params)),new DisposeDataHandle(listener));
    }



    // 重点人员三个月统计接口
    public static void request_zd_baobiao_yue(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(ZD_baobiao_yue,params)),new DisposeDataHandle(listener));
    }

    // 重点人员全部统计接口
    public static void request_zd_baobiao_nian(RequestParams params,DisposeDataListener listener)
    {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(ZD_baobiao_nian,params)),new DisposeDataHandle(listener));
    }

}
