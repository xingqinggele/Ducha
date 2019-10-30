package com.zhhl.ducha.uri;


import com.example.toollibrary.okhttp.CommonOkHttpClient;
import com.example.toollibrary.okhttp.listener.DisposeDataHandle;
import com.example.toollibrary.okhttp.listener.DisposeDataListener;
import com.example.toollibrary.okhttp.request.CommonRequest;
import com.example.toollibrary.okhttp.request.RequestParams;

import static com.zhhl.ducha.uri.UrlService.LOGIN;
import static com.zhhl.ducha.uri.UrlService.QISHI1;
import static com.zhhl.ducha.uri.UrlService.QISHI10;
import static com.zhhl.ducha.uri.UrlService.QISHI11;
import static com.zhhl.ducha.uri.UrlService.QISHI12;
import static com.zhhl.ducha.uri.UrlService.QISHI1_DETALIS;
import static com.zhhl.ducha.uri.UrlService.QISHI2;
import static com.zhhl.ducha.uri.UrlService.QISHI2_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI3;
import static com.zhhl.ducha.uri.UrlService.QISHI3_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI4;
import static com.zhhl.ducha.uri.UrlService.QISHI4_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI5;
import static com.zhhl.ducha.uri.UrlService.QISHI5_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI6;
import static com.zhhl.ducha.uri.UrlService.QISHI6_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI7;
import static com.zhhl.ducha.uri.UrlService.QISHI7_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI8;
import static com.zhhl.ducha.uri.UrlService.QISHI8_DETAILS;
import static com.zhhl.ducha.uri.UrlService.QISHI9;
import static com.zhhl.ducha.uri.UrlService.QISHI9_DETAILS;
import static com.zhhl.ducha.uri.UrlService.ZD_baobiao_nian;
import static com.zhhl.ducha.uri.UrlService.ZD_baobiao_yue;


/**
 * 描述:     统一管理所有的请求
 */

public class   RequestCenter {


    /**
     * 登录账号
     *
     * @param params
     * @param listener
     */
    public static void requestLogin(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post(CommonRequest.createPostRequest(LOGIN, params),
                new DisposeDataHandle(listener));
    }

    // 领导列表
    public static void request_Qishi1(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI1, params)), new DisposeDataHandle(listener));
    }

    // 领导详情
    public static void request_Qishi1_Detalis(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI1_DETALIS, params)), new DisposeDataHandle(listener));
    }

    // 重点人异地居住一年以上
    public static void request_Qishi2(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI2, params)), new DisposeDataHandle(listener));
    }

    // 重点人异地居住一年以上详情
    public static void request_Qishi2_Deyalis(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI2_DETAILS, params)), new DisposeDataHandle(listener));
    }

    //    死亡为撤管
    public static void request_Qishi3(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI3, params)), new DisposeDataHandle(listener));
    }

    //    死亡为撤管详情
    public static void request_Qishi3_details(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI3_DETAILS, params)), new DisposeDataHandle(listener));
    }

    //    已死亡重点人仍有见面稳控考察记录
    public static void request_Qishi4(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI4, params)), new DisposeDataHandle(listener));
    }

    //    已死亡重点人仍有见面稳控考察记录详情
    public static void request_Qishi4_details(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI4_DETAILS, params)), new DisposeDataHandle(listener));
    }

    //    被列为网逃后仍有见面稳控考察记录
    public static void request_Qishi5(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI5, params)), new DisposeDataHandle(listener));
    }

    //    被列为网逃后仍有见面稳控考察记录详情
    public static void request_Qishi5_details(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI5_DETAILS, params)), new DisposeDataHandle(listener));
    }

    //    羁押拘留期间仍有见面稳控考察记录
    public static void request_Qishi6(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI6, params)), new DisposeDataHandle(listener));
    }

    //    羁押拘留期间仍有见面稳控考察记录详情
    public static void request_Qishi6_details(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI6_DETAILS, params)), new DisposeDataHandle(listener));
    }

    //    稳控工作记录少于10字
    public static void request_Qishi7(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI7, params)), new DisposeDataHandle(listener));
    }

    //    稳控工作记录少于10字详情页
    public static void request_Qishi7_details(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI7_DETAILS, params)), new DisposeDataHandle(listener));
    }

    //    稳控考察记录雷同超过3次
    public static void request_Qishi8(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI8, params)), new DisposeDataHandle(listener));
    }

    //    稳控考察记录雷同超过3次详情页
    public static void request_Qishi8_details(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI8_DETAILS, params)), new DisposeDataHandle(listener));
    }

    //    重点人信息录入不全
    public static void request_Qishi9(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI9, params)), new DisposeDataHandle(listener));
    }

    //    重点人信息录入不全详情页
    public static void request_Qishi9_details(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI9_DETAILS, params)), new DisposeDataHandle(listener));
    }

    //    领导交办重点人统计
    public static void request_Qishi10(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI10, params)), new DisposeDataHandle(listener));
    }

  //    重点人异地居住一年以上统计
    public static void request_Qishi11(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI11, params)), new DisposeDataHandle(listener));
    }

 //    死亡未撤管重点人统计
    public static void request_Qishi12(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(QISHI12, params)), new DisposeDataHandle(listener));
    }



    // 重点人员三个月统计接口
    public static void request_zd_baobiao_yue(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(ZD_baobiao_yue, params)), new DisposeDataHandle(listener));
    }

    // 重点人员全部统计接口
    public static void request_zd_baobiao_nian(RequestParams params, DisposeDataListener listener) {
        CommonOkHttpClient.post((CommonRequest.createPostRequest(ZD_baobiao_nian, params)), new DisposeDataHandle(listener));
    }

}
