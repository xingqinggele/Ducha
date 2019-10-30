package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/10/30 13:45.
 */
public class JYJuliuDeteilsbean {

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"jylxList":[{"MZMZWZ":"汉","ZRR_XM":"任黎辉","JS_BH":"0311","GY_QX":"Jul 20, 2021 12:00:00 AM","GJ_MS":"中国","STATE":"R7","XBMZWZ":"女性","XZZ_XIZQHMC":"吉林农安县","JY_RQ":"Jul 22, 2016 12:00:00 AM","XZZ_XX_DZMC":"吉林长春市宽城区杜家屯凯越小区6-2-1204室","RY_BH":"220122111201806200030","CSSJ":"Oct 23, 2018 12:00:00 AM","HYZK_HZ":"丧偶","GZDW_DWMC":"无","ZJHM":"220122195203143528","GRSF":"其他","RCYZJDM":"身份证","XLMC":"小学","RSXZ":"刑事拘留","KSS_DWMC":"农安看守所","HJDZ_XZQHMC":"吉林农安县","XM":"丁福华","TSSF":"其它","AY":"组织和利用邪教组织破坏法律实施案","HJDZ_XX_DZMC":"吉林农安县西油库","CSRQ01":"Mar 14, 1952 12:00:00 AM","RSSJ":"Jun 19, 2018 12:00:00 AM","ZY":"不便分类的其他从业人员"}],"zdrList":[{"SJLY":"0","RYID":"220122195203143528000002129593","SJJZDGAJGDM":"220122490000","SJJZDPCSMC":"农安县公安局开安派出所","CZDWMC":"农安县公安局巡逻大队","DJR":"102330","HJDZXZ":"农安镇铁西村16组","SJJZDZXZ":"吉林省农安县开安镇开安大路临2000号临2000号25室","XMPY":"dingfuhua","WKJBMC":"邪教","SJJZDPCSDM":"175","PCSWKRXM":"朱柏庆","SQGLJBBS":"0","SJJZDZBM":"2201224900000008541511","WKJB":"03","MZMC":"汉族","PCSJGMC":"农安县公安局开安派出所","GXSJ":"20190123091952","XBMC":"女","MZ":"01","JZWKRXM":"张忠","CSRQ":"19520314","DJDW":"220100370301","ZT":"0","JZWKRDH":"15904417023","CZIP":"32.42.40.16","JZMC":"国保","RKLB":"5","SJJZDZSSX":"220122","YWFL":"zdr_xxcj_dj","PCSDM":"220122175","PCSWKRJH":"140573","SQCXBS":"0","DJDWMC":"暂无","XLH":170571,"LGZT":"0","CZYH":"140573","DQM":"吉林省农安县","JZWKRJH":"102330","HJDPCSMC":"农安县古城派出所","JZGAJGJGDM":"220100370301","XB":"2","HJDZBM":"2201841804000000006672","PCSWKRDH":"18043599689","PCSWKRBDSJ":"20190123091952","GMSFHM":"220122195203143528","XM":"丁福华","HJDPCSDM":"220122179","ZYWT":"法轮功重点人员","HJDZSSXQ":"220122","LXFS":"无","JZDM":"4","GLJB":"C","DJSJ":"20170518111202","JZGAJGJGMC":"长春市公安局国内安全保卫支队六一零办公室综合指导科"}],"gkCount":0,"jylx":"yjzy"}
     */

    private boolean success;
    private String msg;
    private AttributesBean attributes;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public AttributesBean getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributesBean attributes) {
        this.attributes = attributes;
    }

    public static class AttributesBean {
        /**
         * jylxList : [{"MZMZWZ":"汉","ZRR_XM":"任黎辉","JS_BH":"0311","GY_QX":"Jul 20, 2021 12:00:00 AM","GJ_MS":"中国","STATE":"R7","XBMZWZ":"女性","XZZ_XIZQHMC":"吉林农安县","JY_RQ":"Jul 22, 2016 12:00:00 AM","XZZ_XX_DZMC":"吉林长春市宽城区杜家屯凯越小区6-2-1204室","RY_BH":"220122111201806200030","CSSJ":"Oct 23, 2018 12:00:00 AM","HYZK_HZ":"丧偶","GZDW_DWMC":"无","ZJHM":"220122195203143528","GRSF":"其他","RCYZJDM":"身份证","XLMC":"小学","RSXZ":"刑事拘留","KSS_DWMC":"农安看守所","HJDZ_XZQHMC":"吉林农安县","XM":"丁福华","TSSF":"其它","AY":"组织和利用邪教组织破坏法律实施案","HJDZ_XX_DZMC":"吉林农安县西油库","CSRQ01":"Mar 14, 1952 12:00:00 AM","RSSJ":"Jun 19, 2018 12:00:00 AM","ZY":"不便分类的其他从业人员"}]
         * zdrList : [{"SJLY":"0","RYID":"220122195203143528000002129593","SJJZDGAJGDM":"220122490000","SJJZDPCSMC":"农安县公安局开安派出所","CZDWMC":"农安县公安局巡逻大队","DJR":"102330","HJDZXZ":"农安镇铁西村16组","SJJZDZXZ":"吉林省农安县开安镇开安大路临2000号临2000号25室","XMPY":"dingfuhua","WKJBMC":"邪教","SJJZDPCSDM":"175","PCSWKRXM":"朱柏庆","SQGLJBBS":"0","SJJZDZBM":"2201224900000008541511","WKJB":"03","MZMC":"汉族","PCSJGMC":"农安县公安局开安派出所","GXSJ":"20190123091952","XBMC":"女","MZ":"01","JZWKRXM":"张忠","CSRQ":"19520314","DJDW":"220100370301","ZT":"0","JZWKRDH":"15904417023","CZIP":"32.42.40.16","JZMC":"国保","RKLB":"5","SJJZDZSSX":"220122","YWFL":"zdr_xxcj_dj","PCSDM":"220122175","PCSWKRJH":"140573","SQCXBS":"0","DJDWMC":"暂无","XLH":170571,"LGZT":"0","CZYH":"140573","DQM":"吉林省农安县","JZWKRJH":"102330","HJDPCSMC":"农安县古城派出所","JZGAJGJGDM":"220100370301","XB":"2","HJDZBM":"2201841804000000006672","PCSWKRDH":"18043599689","PCSWKRBDSJ":"20190123091952","GMSFHM":"220122195203143528","XM":"丁福华","HJDPCSDM":"220122179","ZYWT":"法轮功重点人员","HJDZSSXQ":"220122","LXFS":"无","JZDM":"4","GLJB":"C","DJSJ":"20170518111202","JZGAJGJGMC":"长春市公安局国内安全保卫支队六一零办公室综合指导科"}]
         * gkCount : 0
         * jylx : yjzy
         */

        private int gkCount;
        private String jylx;
        private List<JylxListBean> jylxList;
        private List<ZdrListBean> zdrList;

        public int getGkCount() {
            return gkCount;
        }

        public void setGkCount(int gkCount) {
            this.gkCount = gkCount;
        }

        public String getJylx() {
            return jylx;
        }

        public void setJylx(String jylx) {
            this.jylx = jylx;
        }

        public List<JylxListBean> getJylxList() {
            return jylxList;
        }

        public void setJylxList(List<JylxListBean> jylxList) {
            this.jylxList = jylxList;
        }

        public List<ZdrListBean> getZdrList() {
            return zdrList;
        }

        public void setZdrList(List<ZdrListBean> zdrList) {
            this.zdrList = zdrList;
        }

        public static class JylxListBean {
            /**
             * MZMZWZ : 汉
             * ZRR_XM : 任黎辉
             * JS_BH : 0311
             * GY_QX : Jul 20, 2021 12:00:00 AM
             * GJ_MS : 中国
             * STATE : R7
             * XBMZWZ : 女性
             * XZZ_XIZQHMC : 吉林农安县
             * JY_RQ : Jul 22, 2016 12:00:00 AM
             * XZZ_XX_DZMC : 吉林长春市宽城区杜家屯凯越小区6-2-1204室
             * RY_BH : 220122111201806200030
             * CSSJ : Oct 23, 2018 12:00:00 AM
             * HYZK_HZ : 丧偶
             * GZDW_DWMC : 无
             * ZJHM : 220122195203143528
             * GRSF : 其他
             * RCYZJDM : 身份证
             * XLMC : 小学
             * RSXZ : 刑事拘留
             * KSS_DWMC : 农安看守所
             * HJDZ_XZQHMC : 吉林农安县
             * XM : 丁福华
             * TSSF : 其它
             * AY : 组织和利用邪教组织破坏法律实施案
             * HJDZ_XX_DZMC : 吉林农安县西油库
             * CSRQ01 : Mar 14, 1952 12:00:00 AM
             * RSSJ : Jun 19, 2018 12:00:00 AM
             * ZY : 不便分类的其他从业人员
             */

            private String MZMZWZ;
            private String ZRR_XM;
            private String JS_BH;
            private String GY_QX;
            private String GJ_MS;
            private String STATE;
            private String XBMZWZ;
            private String XZZ_XIZQHMC;
            private String JY_RQ;
            private String XZZ_XX_DZMC;
            private String RY_BH;
            private String CSSJ;
            private String HYZK_HZ;
            private String GZDW_DWMC;
            private String ZJHM;
            private String GRSF;
            private String RCYZJDM;
            private String XLMC;
            private String RSXZ;
            private String KSS_DWMC;
            private String HJDZ_XZQHMC;
            private String XM;
            private String TSSF;
            private String AY;
            private String HJDZ_XX_DZMC;
            private String CSRQ01;
            private String RSSJ;
            private String ZY;

            public String getMZMZWZ() {
                return MZMZWZ;
            }

            public void setMZMZWZ(String MZMZWZ) {
                this.MZMZWZ = MZMZWZ;
            }

            public String getZRR_XM() {
                return ZRR_XM;
            }

            public void setZRR_XM(String ZRR_XM) {
                this.ZRR_XM = ZRR_XM;
            }

            public String getJS_BH() {
                return JS_BH;
            }

            public void setJS_BH(String JS_BH) {
                this.JS_BH = JS_BH;
            }

            public String getGY_QX() {
                return GY_QX;
            }

            public void setGY_QX(String GY_QX) {
                this.GY_QX = GY_QX;
            }

            public String getGJ_MS() {
                return GJ_MS;
            }

            public void setGJ_MS(String GJ_MS) {
                this.GJ_MS = GJ_MS;
            }

            public String getSTATE() {
                return STATE;
            }

            public void setSTATE(String STATE) {
                this.STATE = STATE;
            }

            public String getXBMZWZ() {
                return XBMZWZ;
            }

            public void setXBMZWZ(String XBMZWZ) {
                this.XBMZWZ = XBMZWZ;
            }

            public String getXZZ_XIZQHMC() {
                return XZZ_XIZQHMC;
            }

            public void setXZZ_XIZQHMC(String XZZ_XIZQHMC) {
                this.XZZ_XIZQHMC = XZZ_XIZQHMC;
            }

            public String getJY_RQ() {
                return JY_RQ;
            }

            public void setJY_RQ(String JY_RQ) {
                this.JY_RQ = JY_RQ;
            }

            public String getXZZ_XX_DZMC() {
                return XZZ_XX_DZMC;
            }

            public void setXZZ_XX_DZMC(String XZZ_XX_DZMC) {
                this.XZZ_XX_DZMC = XZZ_XX_DZMC;
            }

            public String getRY_BH() {
                return RY_BH;
            }

            public void setRY_BH(String RY_BH) {
                this.RY_BH = RY_BH;
            }

            public String getCSSJ() {
                return CSSJ;
            }

            public void setCSSJ(String CSSJ) {
                this.CSSJ = CSSJ;
            }

            public String getHYZK_HZ() {
                return HYZK_HZ;
            }

            public void setHYZK_HZ(String HYZK_HZ) {
                this.HYZK_HZ = HYZK_HZ;
            }

            public String getGZDW_DWMC() {
                return GZDW_DWMC;
            }

            public void setGZDW_DWMC(String GZDW_DWMC) {
                this.GZDW_DWMC = GZDW_DWMC;
            }

            public String getZJHM() {
                return ZJHM;
            }

            public void setZJHM(String ZJHM) {
                this.ZJHM = ZJHM;
            }

            public String getGRSF() {
                return GRSF;
            }

            public void setGRSF(String GRSF) {
                this.GRSF = GRSF;
            }

            public String getRCYZJDM() {
                return RCYZJDM;
            }

            public void setRCYZJDM(String RCYZJDM) {
                this.RCYZJDM = RCYZJDM;
            }

            public String getXLMC() {
                return XLMC;
            }

            public void setXLMC(String XLMC) {
                this.XLMC = XLMC;
            }

            public String getRSXZ() {
                return RSXZ;
            }

            public void setRSXZ(String RSXZ) {
                this.RSXZ = RSXZ;
            }

            public String getKSS_DWMC() {
                return KSS_DWMC;
            }

            public void setKSS_DWMC(String KSS_DWMC) {
                this.KSS_DWMC = KSS_DWMC;
            }

            public String getHJDZ_XZQHMC() {
                return HJDZ_XZQHMC;
            }

            public void setHJDZ_XZQHMC(String HJDZ_XZQHMC) {
                this.HJDZ_XZQHMC = HJDZ_XZQHMC;
            }

            public String getXM() {
                return XM;
            }

            public void setXM(String XM) {
                this.XM = XM;
            }

            public String getTSSF() {
                return TSSF;
            }

            public void setTSSF(String TSSF) {
                this.TSSF = TSSF;
            }

            public String getAY() {
                return AY;
            }

            public void setAY(String AY) {
                this.AY = AY;
            }

            public String getHJDZ_XX_DZMC() {
                return HJDZ_XX_DZMC;
            }

            public void setHJDZ_XX_DZMC(String HJDZ_XX_DZMC) {
                this.HJDZ_XX_DZMC = HJDZ_XX_DZMC;
            }

            public String getCSRQ01() {
                return CSRQ01;
            }

            public void setCSRQ01(String CSRQ01) {
                this.CSRQ01 = CSRQ01;
            }

            public String getRSSJ() {
                return RSSJ;
            }

            public void setRSSJ(String RSSJ) {
                this.RSSJ = RSSJ;
            }

            public String getZY() {
                return ZY;
            }

            public void setZY(String ZY) {
                this.ZY = ZY;
            }
        }

        public static class ZdrListBean {
            /**
             * SJLY : 0
             * RYID : 220122195203143528000002129593
             * SJJZDGAJGDM : 220122490000
             * SJJZDPCSMC : 农安县公安局开安派出所
             * CZDWMC : 农安县公安局巡逻大队
             * DJR : 102330
             * HJDZXZ : 农安镇铁西村16组
             * SJJZDZXZ : 吉林省农安县开安镇开安大路临2000号临2000号25室
             * XMPY : dingfuhua
             * WKJBMC : 邪教
             * SJJZDPCSDM : 175
             * PCSWKRXM : 朱柏庆
             * SQGLJBBS : 0
             * SJJZDZBM : 2201224900000008541511
             * WKJB : 03
             * MZMC : 汉族
             * PCSJGMC : 农安县公安局开安派出所
             * GXSJ : 20190123091952
             * XBMC : 女
             * MZ : 01
             * JZWKRXM : 张忠
             * CSRQ : 19520314
             * DJDW : 220100370301
             * ZT : 0
             * JZWKRDH : 15904417023
             * CZIP : 32.42.40.16
             * JZMC : 国保
             * RKLB : 5
             * SJJZDZSSX : 220122
             * YWFL : zdr_xxcj_dj
             * PCSDM : 220122175
             * PCSWKRJH : 140573
             * SQCXBS : 0
             * DJDWMC : 暂无
             * XLH : 170571
             * LGZT : 0
             * CZYH : 140573
             * DQM : 吉林省农安县
             * JZWKRJH : 102330
             * HJDPCSMC : 农安县古城派出所
             * JZGAJGJGDM : 220100370301
             * XB : 2
             * HJDZBM : 2201841804000000006672
             * PCSWKRDH : 18043599689
             * PCSWKRBDSJ : 20190123091952
             * GMSFHM : 220122195203143528
             * XM : 丁福华
             * HJDPCSDM : 220122179
             * ZYWT : 法轮功重点人员
             * HJDZSSXQ : 220122
             * LXFS : 无
             * JZDM : 4
             * GLJB : C
             * DJSJ : 20170518111202
             * JZGAJGJGMC : 长春市公安局国内安全保卫支队六一零办公室综合指导科
             */

            private String SJLY;
            private String RYID;
            private String SJJZDGAJGDM;
            private String SJJZDPCSMC;
            private String CZDWMC;
            private String DJR;
            private String HJDZXZ;
            private String SJJZDZXZ;
            private String XMPY;
            private String WKJBMC;
            private String SJJZDPCSDM;
            private String PCSWKRXM;
            private String SQGLJBBS;
            private String SJJZDZBM;
            private String WKJB;
            private String MZMC;
            private String PCSJGMC;
            private String GXSJ;
            private String XBMC;
            private String MZ;
            private String JZWKRXM;
            private String CSRQ;
            private String DJDW;
            private String ZT;
            private String JZWKRDH;
            private String CZIP;
            private String JZMC;
            private String RKLB;
            private String SJJZDZSSX;
            private String YWFL;
            private String PCSDM;
            private String PCSWKRJH;
            private String SQCXBS;
            private String DJDWMC;
            private int XLH;
            private String LGZT;
            private String CZYH;
            private String DQM;
            private String JZWKRJH;
            private String HJDPCSMC;
            private String JZGAJGJGDM;
            private String XB;
            private String HJDZBM;
            private String PCSWKRDH;
            private String PCSWKRBDSJ;
            private String GMSFHM;
            private String XM;
            private String HJDPCSDM;
            private String ZYWT;
            private String HJDZSSXQ;
            private String LXFS;
            private String JZDM;
            private String GLJB;
            private String DJSJ;
            private String JZGAJGJGMC;

            public String getSJLY() {
                return SJLY;
            }

            public void setSJLY(String SJLY) {
                this.SJLY = SJLY;
            }

            public String getRYID() {
                return RYID;
            }

            public void setRYID(String RYID) {
                this.RYID = RYID;
            }

            public String getSJJZDGAJGDM() {
                return SJJZDGAJGDM;
            }

            public void setSJJZDGAJGDM(String SJJZDGAJGDM) {
                this.SJJZDGAJGDM = SJJZDGAJGDM;
            }

            public String getSJJZDPCSMC() {
                return SJJZDPCSMC;
            }

            public void setSJJZDPCSMC(String SJJZDPCSMC) {
                this.SJJZDPCSMC = SJJZDPCSMC;
            }

            public String getCZDWMC() {
                return CZDWMC;
            }

            public void setCZDWMC(String CZDWMC) {
                this.CZDWMC = CZDWMC;
            }

            public String getDJR() {
                return DJR;
            }

            public void setDJR(String DJR) {
                this.DJR = DJR;
            }

            public String getHJDZXZ() {
                return HJDZXZ;
            }

            public void setHJDZXZ(String HJDZXZ) {
                this.HJDZXZ = HJDZXZ;
            }

            public String getSJJZDZXZ() {
                return SJJZDZXZ;
            }

            public void setSJJZDZXZ(String SJJZDZXZ) {
                this.SJJZDZXZ = SJJZDZXZ;
            }

            public String getXMPY() {
                return XMPY;
            }

            public void setXMPY(String XMPY) {
                this.XMPY = XMPY;
            }

            public String getWKJBMC() {
                return WKJBMC;
            }

            public void setWKJBMC(String WKJBMC) {
                this.WKJBMC = WKJBMC;
            }

            public String getSJJZDPCSDM() {
                return SJJZDPCSDM;
            }

            public void setSJJZDPCSDM(String SJJZDPCSDM) {
                this.SJJZDPCSDM = SJJZDPCSDM;
            }

            public String getPCSWKRXM() {
                return PCSWKRXM;
            }

            public void setPCSWKRXM(String PCSWKRXM) {
                this.PCSWKRXM = PCSWKRXM;
            }

            public String getSQGLJBBS() {
                return SQGLJBBS;
            }

            public void setSQGLJBBS(String SQGLJBBS) {
                this.SQGLJBBS = SQGLJBBS;
            }

            public String getSJJZDZBM() {
                return SJJZDZBM;
            }

            public void setSJJZDZBM(String SJJZDZBM) {
                this.SJJZDZBM = SJJZDZBM;
            }

            public String getWKJB() {
                return WKJB;
            }

            public void setWKJB(String WKJB) {
                this.WKJB = WKJB;
            }

            public String getMZMC() {
                return MZMC;
            }

            public void setMZMC(String MZMC) {
                this.MZMC = MZMC;
            }

            public String getPCSJGMC() {
                return PCSJGMC;
            }

            public void setPCSJGMC(String PCSJGMC) {
                this.PCSJGMC = PCSJGMC;
            }

            public String getGXSJ() {
                return GXSJ;
            }

            public void setGXSJ(String GXSJ) {
                this.GXSJ = GXSJ;
            }

            public String getXBMC() {
                return XBMC;
            }

            public void setXBMC(String XBMC) {
                this.XBMC = XBMC;
            }

            public String getMZ() {
                return MZ;
            }

            public void setMZ(String MZ) {
                this.MZ = MZ;
            }

            public String getJZWKRXM() {
                return JZWKRXM;
            }

            public void setJZWKRXM(String JZWKRXM) {
                this.JZWKRXM = JZWKRXM;
            }

            public String getCSRQ() {
                return CSRQ;
            }

            public void setCSRQ(String CSRQ) {
                this.CSRQ = CSRQ;
            }

            public String getDJDW() {
                return DJDW;
            }

            public void setDJDW(String DJDW) {
                this.DJDW = DJDW;
            }

            public String getZT() {
                return ZT;
            }

            public void setZT(String ZT) {
                this.ZT = ZT;
            }

            public String getJZWKRDH() {
                return JZWKRDH;
            }

            public void setJZWKRDH(String JZWKRDH) {
                this.JZWKRDH = JZWKRDH;
            }

            public String getCZIP() {
                return CZIP;
            }

            public void setCZIP(String CZIP) {
                this.CZIP = CZIP;
            }

            public String getJZMC() {
                return JZMC;
            }

            public void setJZMC(String JZMC) {
                this.JZMC = JZMC;
            }

            public String getRKLB() {
                return RKLB;
            }

            public void setRKLB(String RKLB) {
                this.RKLB = RKLB;
            }

            public String getSJJZDZSSX() {
                return SJJZDZSSX;
            }

            public void setSJJZDZSSX(String SJJZDZSSX) {
                this.SJJZDZSSX = SJJZDZSSX;
            }

            public String getYWFL() {
                return YWFL;
            }

            public void setYWFL(String YWFL) {
                this.YWFL = YWFL;
            }

            public String getPCSDM() {
                return PCSDM;
            }

            public void setPCSDM(String PCSDM) {
                this.PCSDM = PCSDM;
            }

            public String getPCSWKRJH() {
                return PCSWKRJH;
            }

            public void setPCSWKRJH(String PCSWKRJH) {
                this.PCSWKRJH = PCSWKRJH;
            }

            public String getSQCXBS() {
                return SQCXBS;
            }

            public void setSQCXBS(String SQCXBS) {
                this.SQCXBS = SQCXBS;
            }

            public String getDJDWMC() {
                return DJDWMC;
            }

            public void setDJDWMC(String DJDWMC) {
                this.DJDWMC = DJDWMC;
            }

            public int getXLH() {
                return XLH;
            }

            public void setXLH(int XLH) {
                this.XLH = XLH;
            }

            public String getLGZT() {
                return LGZT;
            }

            public void setLGZT(String LGZT) {
                this.LGZT = LGZT;
            }

            public String getCZYH() {
                return CZYH;
            }

            public void setCZYH(String CZYH) {
                this.CZYH = CZYH;
            }

            public String getDQM() {
                return DQM;
            }

            public void setDQM(String DQM) {
                this.DQM = DQM;
            }

            public String getJZWKRJH() {
                return JZWKRJH;
            }

            public void setJZWKRJH(String JZWKRJH) {
                this.JZWKRJH = JZWKRJH;
            }

            public String getHJDPCSMC() {
                return HJDPCSMC;
            }

            public void setHJDPCSMC(String HJDPCSMC) {
                this.HJDPCSMC = HJDPCSMC;
            }

            public String getJZGAJGJGDM() {
                return JZGAJGJGDM;
            }

            public void setJZGAJGJGDM(String JZGAJGJGDM) {
                this.JZGAJGJGDM = JZGAJGJGDM;
            }

            public String getXB() {
                return XB;
            }

            public void setXB(String XB) {
                this.XB = XB;
            }

            public String getHJDZBM() {
                return HJDZBM;
            }

            public void setHJDZBM(String HJDZBM) {
                this.HJDZBM = HJDZBM;
            }

            public String getPCSWKRDH() {
                return PCSWKRDH;
            }

            public void setPCSWKRDH(String PCSWKRDH) {
                this.PCSWKRDH = PCSWKRDH;
            }

            public String getPCSWKRBDSJ() {
                return PCSWKRBDSJ;
            }

            public void setPCSWKRBDSJ(String PCSWKRBDSJ) {
                this.PCSWKRBDSJ = PCSWKRBDSJ;
            }

            public String getGMSFHM() {
                return GMSFHM;
            }

            public void setGMSFHM(String GMSFHM) {
                this.GMSFHM = GMSFHM;
            }

            public String getXM() {
                return XM;
            }

            public void setXM(String XM) {
                this.XM = XM;
            }

            public String getHJDPCSDM() {
                return HJDPCSDM;
            }

            public void setHJDPCSDM(String HJDPCSDM) {
                this.HJDPCSDM = HJDPCSDM;
            }

            public String getZYWT() {
                return ZYWT;
            }

            public void setZYWT(String ZYWT) {
                this.ZYWT = ZYWT;
            }

            public String getHJDZSSXQ() {
                return HJDZSSXQ;
            }

            public void setHJDZSSXQ(String HJDZSSXQ) {
                this.HJDZSSXQ = HJDZSSXQ;
            }

            public String getLXFS() {
                return LXFS;
            }

            public void setLXFS(String LXFS) {
                this.LXFS = LXFS;
            }

            public String getJZDM() {
                return JZDM;
            }

            public void setJZDM(String JZDM) {
                this.JZDM = JZDM;
            }

            public String getGLJB() {
                return GLJB;
            }

            public void setGLJB(String GLJB) {
                this.GLJB = GLJB;
            }

            public String getDJSJ() {
                return DJSJ;
            }

            public void setDJSJ(String DJSJ) {
                this.DJSJ = DJSJ;
            }

            public String getJZGAJGJGMC() {
                return JZGAJGJGMC;
            }

            public void setJZGAJGJGMC(String JZGAJGJGMC) {
                this.JZGAJGJGMC = JZGAJGJGMC;
            }
        }
    }
}
