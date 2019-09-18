package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/17 16:33.
 */
public class Detedetailsbean
{


    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"SJLY":"0","RYID":"220105195207061419000002164723","SJJZDGAJGDM":"220103350000","SWRQ":"20190809","SJJZDPCSMC":"长春市宽城区分局兴业街派出所","JZWKRBDSJ":"20170810170718","DJR":"105713","HJDZXZ":"天光路3-31号","SJJZDZXZ":"吉林省长春市宽城区东天光路243号水泵厂宿舍2栋1单元203室","XMPY":"wanglianbo","WKJBMC":"涉访重点人","SJJZDPCSDM":"309","PCSWKRXM":"冯雪凇","SQGLJBBS":"0","SJJZDZBM":"2201033500000009177031","SFABTX":"1","WKJB":"61","MZMC":"汉族","PCSJGMC":"长春市宽城区分局兴业街派出所","GXSJ":"20180606103104","XBMC":"男","MZ":"01","JZWKRXM":"续景锋","CSRQ":"19520706","GXSJ1":"Sep 10, 2019 10:50:41 AM","DJDW":"220103350000","ZT":"0","JZWKRDH":"15904419651","CZIP":"10.106.229.36","JZMC":"治安","RKLB":"1","DWMC":"长春市公安局宽城区分局政工处","SJJZDZSSX":"220103","YWFL":"zdr_xxcj_pcs_dj","PCSDM":"220103309","SPBZ":"9","PCSWKRJH":"105832","SQCXBS":"0","XLH":212263,"CZDW":"220103350000","LGZT":"0","CZYH":"105832","DQM":"220100","JZWKRJH":"101142","HJDPCSMC":"长春市兴业街派出所","JZGAJGJGDM":"220103130000","ZDMC":"吉林省长春市","XB":"1","HJDZBM":"2201002611080000082189","PCSWKRDH":"15754362695","PCSWKRBDSJ":"20180606103104","GMSFHM":"220105195207061419","XM":"王连波","HJDPCSDM":"220103309","ZYWT":"该人原系水泵厂职工，因水泵厂改制，没有为其办理退休养老问题，涉事单位水泵厂。问题至今未得到解决。","HJDZSSXQ":"220103","JZDM":"1","GLJB":"B","DJSJ":"20170801105736","PHOTOID":"25480288","JZGAJGJGMC":"长春市公安局宽城区分局治安警察中队"}]}
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
        private List<VarListBean> varList;

        public List<VarListBean> getVarList() {
            return varList;
        }

        public void setVarList(List<VarListBean> varList) {
            this.varList = varList;
        }

        public static class VarListBean {
            /**
             * SJLY : 0
             * RYID : 220105195207061419000002164723
             * SJJZDGAJGDM : 220103350000
             * SWRQ : 20190809
             * SJJZDPCSMC : 长春市宽城区分局兴业街派出所
             * JZWKRBDSJ : 20170810170718
             * DJR : 105713
             * HJDZXZ : 天光路3-31号
             * SJJZDZXZ : 吉林省长春市宽城区东天光路243号水泵厂宿舍2栋1单元203室
             * XMPY : wanglianbo
             * WKJBMC : 涉访重点人
             * SJJZDPCSDM : 309
             * PCSWKRXM : 冯雪凇
             * SQGLJBBS : 0
             * SJJZDZBM : 2201033500000009177031
             * SFABTX : 1
             * WKJB : 61
             * MZMC : 汉族
             * PCSJGMC : 长春市宽城区分局兴业街派出所
             * GXSJ : 20180606103104
             * XBMC : 男
             * MZ : 01
             * JZWKRXM : 续景锋
             * CSRQ : 19520706
             * GXSJ1 : Sep 10, 2019 10:50:41 AM
             * DJDW : 220103350000
             * ZT : 0
             * JZWKRDH : 15904419651
             * CZIP : 10.106.229.36
             * JZMC : 治安
             * RKLB : 1
             * DWMC : 长春市公安局宽城区分局政工处
             * SJJZDZSSX : 220103
             * YWFL : zdr_xxcj_pcs_dj
             * PCSDM : 220103309
             * SPBZ : 9
             * PCSWKRJH : 105832
             * SQCXBS : 0
             * XLH : 212263
             * CZDW : 220103350000
             * LGZT : 0
             * CZYH : 105832
             * DQM : 220100
             * JZWKRJH : 101142
             * HJDPCSMC : 长春市兴业街派出所
             * JZGAJGJGDM : 220103130000
             * ZDMC : 吉林省长春市
             * XB : 1
             * HJDZBM : 2201002611080000082189
             * PCSWKRDH : 15754362695
             * PCSWKRBDSJ : 20180606103104
             * GMSFHM : 220105195207061419
             * XM : 王连波
             * HJDPCSDM : 220103309
             * ZYWT : 该人原系水泵厂职工，因水泵厂改制，没有为其办理退休养老问题，涉事单位水泵厂。问题至今未得到解决。
             * HJDZSSXQ : 220103
             * JZDM : 1
             * GLJB : B
             * DJSJ : 20170801105736
             * PHOTOID : 25480288
             * JZGAJGJGMC : 长春市公安局宽城区分局治安警察中队
             */

            private String SJLY;
            private String RYID;
            private String SJJZDGAJGDM;
            private String SWRQ;
            private String SJJZDPCSMC;
            private String JZWKRBDSJ;
            private String DJR;
            private String HJDZXZ;
            private String SJJZDZXZ;
            private String XMPY;
            private String WKJBMC;
            private String SJJZDPCSDM;
            private String PCSWKRXM;
            private String SQGLJBBS;
            private String SJJZDZBM;
            private String SFABTX;
            private String WKJB;
            private String MZMC;
            private String PCSJGMC;
            private String GXSJ;
            private String XBMC;
            private String MZ;
            private String JZWKRXM;
            private String CSRQ;
            private String GXSJ1;
            private String DJDW;
            private String ZT;
            private String JZWKRDH;
            private String CZIP;
            private String JZMC;
            private String RKLB;
            private String DWMC;
            private String SJJZDZSSX;
            private String YWFL;
            private String PCSDM;
            private String SPBZ;
            private String PCSWKRJH;
            private String SQCXBS;
            private int XLH;
            private String CZDW;
            private String LGZT;
            private String CZYH;
            private String DQM;
            private String JZWKRJH;
            private String HJDPCSMC;
            private String JZGAJGJGDM;
            private String ZDMC;
            private String XB;
            private String HJDZBM;
            private String PCSWKRDH;
            private String PCSWKRBDSJ;
            private String GMSFHM;
            private String XM;
            private String HJDPCSDM;
            private String ZYWT;
            private String HJDZSSXQ;
            private String JZDM;
            private String GLJB;
            private String DJSJ;
            private String PHOTOID;
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

            public String getSWRQ() {
                return SWRQ;
            }

            public void setSWRQ(String SWRQ) {
                this.SWRQ = SWRQ;
            }

            public String getSJJZDPCSMC() {
                return SJJZDPCSMC;
            }

            public void setSJJZDPCSMC(String SJJZDPCSMC) {
                this.SJJZDPCSMC = SJJZDPCSMC;
            }

            public String getJZWKRBDSJ() {
                return JZWKRBDSJ;
            }

            public void setJZWKRBDSJ(String JZWKRBDSJ) {
                this.JZWKRBDSJ = JZWKRBDSJ;
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

            public String getSFABTX() {
                return SFABTX;
            }

            public void setSFABTX(String SFABTX) {
                this.SFABTX = SFABTX;
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

            public String getGXSJ1() {
                return GXSJ1;
            }

            public void setGXSJ1(String GXSJ1) {
                this.GXSJ1 = GXSJ1;
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

            public String getDWMC() {
                return DWMC;
            }

            public void setDWMC(String DWMC) {
                this.DWMC = DWMC;
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

            public String getSPBZ() {
                return SPBZ;
            }

            public void setSPBZ(String SPBZ) {
                this.SPBZ = SPBZ;
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

            public int getXLH() {
                return XLH;
            }

            public void setXLH(int XLH) {
                this.XLH = XLH;
            }

            public String getCZDW() {
                return CZDW;
            }

            public void setCZDW(String CZDW) {
                this.CZDW = CZDW;
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

            public String getZDMC() {
                return ZDMC;
            }

            public void setZDMC(String ZDMC) {
                this.ZDMC = ZDMC;
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

            public String getPHOTOID() {
                return PHOTOID;
            }

            public void setPHOTOID(String PHOTOID) {
                this.PHOTOID = PHOTOID;
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
