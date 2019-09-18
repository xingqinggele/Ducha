package com.zhhl.ducha.uri;

/**
 * Created by czy on 2019/6/27 8:55.
 */
public class UrlService {

    public static final String URL = "http://192.168.20.228:7115/";
    public static final String QISHI1 =URL+"sjjbzdrController/keyPersonnel"; //上级交办重点人接口（首页）1
    public static final String QISHI1_DETALIS =URL+"sjjbzdrController/keyPersonDetails"; //上级交办重点人详情
    public static final String QISHI2 =URL+"zdrydjzController/keyPeopleDifferent"; //上级交办重点人
    public static final String QISHI2_DETAILS =URL+"zdrydjzController/differentDetails"; //上级交办重点人详情
    public static final String QISHI3 =URL+"swwcgController/notRemoved"; //死亡未撤管重点人筛选
    public static final String QISHI3_DETAILS =URL+"swwcgController/notRemovedDetails"; //死亡未撤管重点人筛选详情
    public static final String QISHI4 =URL+"jyqjController/keyDeathsList"; //已死亡重点人仍有见面稳控考察记录（首页）5
    public static final String QISHI4_DETAILS =URL+"jyqjController/deathsDetailed"; //已死亡重点人仍有见面稳控考察记录详情
    public static final String QISHI5 =URL+"jyqjController/escapeList"; //被列为网逃后仍有见面稳控考察记录（首页）6
    public static final String QISHI5_DETAILS =URL+"jyqjController/escapeMessage"; //被列为网逃后仍有见面稳控考察记录（首页）详情
    public static final String ZD_baobiao_yue =URL+"swwcgController/threeCount.do"; //三个月统计接口
    public static final String ZD_baobiao_nian =URL+"swwcgController/allCount.do"; //全部统计接口


    public static final String LOGIN  = URL + "/staff/loginUser";//登录

}
