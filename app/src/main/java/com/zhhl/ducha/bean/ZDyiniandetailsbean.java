package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/17 13:36.
 */
public class ZDyiniandetailsbean
{

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"zdrList":[{"SJLY":"0","JZMC":"治安","SJJZDPCSMC":"集安市公安局团结派出所","PCSWKRJH":"bf4378","HJDZXZ":"团结街西盛委七组","SJJZDZXZ":"吉林省集安市朝阳街临70210号1号1单元602室","XMPY":"lirenqin","WKJBMC":"涉访重点人","PCSWKRXM":"张子龙","JZWKRJH":"570327","HJDPCSMC":"团结边防派出所","MZMC":"汉族","PCSJGMC":"集安市公安局团结派出所","GXSJ":"20180226101453","XBMC":"女","ZDMC":"吉林省通化市","JZWKRXM":"宋榜巍","PCSWKRDH":"17767959505","PCSWKRBDSJ":"20180226101453","XM":"李仁琴","GMSFHM":"220522195609180021","ZYWT":"小孩先天性心脏病，要求政府救助。","ZT":"0","LXFS":"13756053393","GLJB":"B","JZWKRDH":"18043506327","DJSJ":"20170626155825","JZGAJGJGMC":"集安市公安局治安大队"}],"hzList":[{"QFJGJGMC":"长春市公安局南关区分局","SHRXM":"付丁","SJRTXDZ":"南关区桃源路春园社区","SHDWJGMC":"吉林省长春市公安局南关区分局户籍科","SJRXM":"高明","QFRXM":"付丁","CARDID":"B46B85CF","QHNXXDZ":"吉林省集安市团结街西盛委七组","XB":"2","SJRYB":"130000","QFRQ":"20160721","SHRQ":"20160721","LXDH":"14743105939","XM":"李仁琴","GMSFHM":"220522195609180021","SFZZZ":"吉林省长春市南关区东天街54号春晖6栋6单元416室","SLSJ":"20160719145937","ZZDXZ":"长春市南关区东天街54号春晖6栋6单元416室","SJRLXDH":"18686429409","JZZSLWSBH":"2201022202016071900094317","SLRXM":"丁昱含","DJDWJGMC":"长春市南关区分局桃源路派出所","SLJGMC":"长春市南关区分局桃源路派出所"}]}
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
        private List<ZdrListBean> zdrList;
        private List<HzListBean> hzList;

        public List<ZdrListBean> getZdrList() {
            return zdrList;
        }

        public void setZdrList(List<ZdrListBean> zdrList) {
            this.zdrList = zdrList;
        }

        public List<HzListBean> getHzList() {
            return hzList;
        }

        public void setHzList(List<HzListBean> hzList) {
            this.hzList = hzList;
        }

        public static class ZdrListBean {
            /**
             * SJLY : 0
             * JZMC : 治安
             * SJJZDPCSMC : 集安市公安局团结派出所
             * PCSWKRJH : bf4378
             * HJDZXZ : 团结街西盛委七组
             * SJJZDZXZ : 吉林省集安市朝阳街临70210号1号1单元602室
             * XMPY : lirenqin
             * WKJBMC : 涉访重点人
             * PCSWKRXM : 张子龙
             * JZWKRJH : 570327
             * HJDPCSMC : 团结边防派出所
             * MZMC : 汉族
             * PCSJGMC : 集安市公安局团结派出所
             * GXSJ : 20180226101453
             * XBMC : 女
             * ZDMC : 吉林省通化市
             * JZWKRXM : 宋榜巍
             * PCSWKRDH : 17767959505
             * PCSWKRBDSJ : 20180226101453
             * XM : 李仁琴
             * GMSFHM : 220522195609180021
             * ZYWT : 小孩先天性心脏病，要求政府救助。
             * ZT : 0
             * LXFS : 13756053393
             * GLJB : B
             * JZWKRDH : 18043506327
             * DJSJ : 20170626155825
             * JZGAJGJGMC : 集安市公安局治安大队
             */

            private String SJLY;
            private String JZMC;
            private String SJJZDPCSMC;
            private String PCSWKRJH;
            private String HJDZXZ;
            private String SJJZDZXZ;
            private String XMPY;
            private String WKJBMC;
            private String PCSWKRXM;
            private String JZWKRJH;
            private String HJDPCSMC;
            private String MZMC;
            private String PCSJGMC;
            private String GXSJ;
            private String XBMC;
            private String ZDMC;
            private String JZWKRXM;
            private String PCSWKRDH;
            private String PCSWKRBDSJ;
            private String XM;
            private String GMSFHM;
            private String ZYWT;
            private String ZT;
            private String LXFS;
            private String GLJB;
            private String JZWKRDH;
            private String DJSJ;
            private String JZGAJGJGMC;

            public String getSJLY() {
                return SJLY;
            }

            public void setSJLY(String SJLY) {
                this.SJLY = SJLY;
            }

            public String getJZMC() {
                return JZMC;
            }

            public void setJZMC(String JZMC) {
                this.JZMC = JZMC;
            }

            public String getSJJZDPCSMC() {
                return SJJZDPCSMC;
            }

            public void setSJJZDPCSMC(String SJJZDPCSMC) {
                this.SJJZDPCSMC = SJJZDPCSMC;
            }

            public String getPCSWKRJH() {
                return PCSWKRJH;
            }

            public void setPCSWKRJH(String PCSWKRJH) {
                this.PCSWKRJH = PCSWKRJH;
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

            public String getPCSWKRXM() {
                return PCSWKRXM;
            }

            public void setPCSWKRXM(String PCSWKRXM) {
                this.PCSWKRXM = PCSWKRXM;
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

            public String getZDMC() {
                return ZDMC;
            }

            public void setZDMC(String ZDMC) {
                this.ZDMC = ZDMC;
            }

            public String getJZWKRXM() {
                return JZWKRXM;
            }

            public void setJZWKRXM(String JZWKRXM) {
                this.JZWKRXM = JZWKRXM;
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

            public String getXM() {
                return XM;
            }

            public void setXM(String XM) {
                this.XM = XM;
            }

            public String getGMSFHM() {
                return GMSFHM;
            }

            public void setGMSFHM(String GMSFHM) {
                this.GMSFHM = GMSFHM;
            }

            public String getZYWT() {
                return ZYWT;
            }

            public void setZYWT(String ZYWT) {
                this.ZYWT = ZYWT;
            }

            public String getZT() {
                return ZT;
            }

            public void setZT(String ZT) {
                this.ZT = ZT;
            }

            public String getLXFS() {
                return LXFS;
            }

            public void setLXFS(String LXFS) {
                this.LXFS = LXFS;
            }

            public String getGLJB() {
                return GLJB;
            }

            public void setGLJB(String GLJB) {
                this.GLJB = GLJB;
            }

            public String getJZWKRDH() {
                return JZWKRDH;
            }

            public void setJZWKRDH(String JZWKRDH) {
                this.JZWKRDH = JZWKRDH;
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

        public static class HzListBean {
            /**
             * QFJGJGMC : 长春市公安局南关区分局
             * SHRXM : 付丁
             * SJRTXDZ : 南关区桃源路春园社区
             * SHDWJGMC : 吉林省长春市公安局南关区分局户籍科
             * SJRXM : 高明
             * QFRXM : 付丁
             * CARDID : B46B85CF
             * QHNXXDZ : 吉林省集安市团结街西盛委七组
             * XB : 2
             * SJRYB : 130000
             * QFRQ : 20160721
             * SHRQ : 20160721
             * LXDH : 14743105939
             * XM : 李仁琴
             * GMSFHM : 220522195609180021
             * SFZZZ : 吉林省长春市南关区东天街54号春晖6栋6单元416室
             * SLSJ : 20160719145937
             * ZZDXZ : 长春市南关区东天街54号春晖6栋6单元416室
             * SJRLXDH : 18686429409
             * JZZSLWSBH : 2201022202016071900094317
             * SLRXM : 丁昱含
             * DJDWJGMC : 长春市南关区分局桃源路派出所
             * SLJGMC : 长春市南关区分局桃源路派出所
             */

            private String QFJGJGMC;
            private String SHRXM;
            private String SJRTXDZ;
            private String SHDWJGMC;
            private String SJRXM;
            private String QFRXM;
            private String CARDID;
            private String QHNXXDZ;
            private String XB;
            private String SJRYB;
            private String QFRQ;
            private String SHRQ;
            private String LXDH;
            private String XM;
            private String GMSFHM;
            private String SFZZZ;
            private String SLSJ;
            private String ZZDXZ;
            private String SJRLXDH;
            private String JZZSLWSBH;
            private String SLRXM;
            private String DJDWJGMC;
            private String SLJGMC;

            public String getQFJGJGMC() {
                return QFJGJGMC;
            }

            public void setQFJGJGMC(String QFJGJGMC) {
                this.QFJGJGMC = QFJGJGMC;
            }

            public String getSHRXM() {
                return SHRXM;
            }

            public void setSHRXM(String SHRXM) {
                this.SHRXM = SHRXM;
            }

            public String getSJRTXDZ() {
                return SJRTXDZ;
            }

            public void setSJRTXDZ(String SJRTXDZ) {
                this.SJRTXDZ = SJRTXDZ;
            }

            public String getSHDWJGMC() {
                return SHDWJGMC;
            }

            public void setSHDWJGMC(String SHDWJGMC) {
                this.SHDWJGMC = SHDWJGMC;
            }

            public String getSJRXM() {
                return SJRXM;
            }

            public void setSJRXM(String SJRXM) {
                this.SJRXM = SJRXM;
            }

            public String getQFRXM() {
                return QFRXM;
            }

            public void setQFRXM(String QFRXM) {
                this.QFRXM = QFRXM;
            }

            public String getCARDID() {
                return CARDID;
            }

            public void setCARDID(String CARDID) {
                this.CARDID = CARDID;
            }

            public String getQHNXXDZ() {
                return QHNXXDZ;
            }

            public void setQHNXXDZ(String QHNXXDZ) {
                this.QHNXXDZ = QHNXXDZ;
            }

            public String getXB() {
                return XB;
            }

            public void setXB(String XB) {
                this.XB = XB;
            }

            public String getSJRYB() {
                return SJRYB;
            }

            public void setSJRYB(String SJRYB) {
                this.SJRYB = SJRYB;
            }

            public String getQFRQ() {
                return QFRQ;
            }

            public void setQFRQ(String QFRQ) {
                this.QFRQ = QFRQ;
            }

            public String getSHRQ() {
                return SHRQ;
            }

            public void setSHRQ(String SHRQ) {
                this.SHRQ = SHRQ;
            }

            public String getLXDH() {
                return LXDH;
            }

            public void setLXDH(String LXDH) {
                this.LXDH = LXDH;
            }

            public String getXM() {
                return XM;
            }

            public void setXM(String XM) {
                this.XM = XM;
            }

            public String getGMSFHM() {
                return GMSFHM;
            }

            public void setGMSFHM(String GMSFHM) {
                this.GMSFHM = GMSFHM;
            }

            public String getSFZZZ() {
                return SFZZZ;
            }

            public void setSFZZZ(String SFZZZ) {
                this.SFZZZ = SFZZZ;
            }

            public String getSLSJ() {
                return SLSJ;
            }

            public void setSLSJ(String SLSJ) {
                this.SLSJ = SLSJ;
            }

            public String getZZDXZ() {
                return ZZDXZ;
            }

            public void setZZDXZ(String ZZDXZ) {
                this.ZZDXZ = ZZDXZ;
            }

            public String getSJRLXDH() {
                return SJRLXDH;
            }

            public void setSJRLXDH(String SJRLXDH) {
                this.SJRLXDH = SJRLXDH;
            }

            public String getJZZSLWSBH() {
                return JZZSLWSBH;
            }

            public void setJZZSLWSBH(String JZZSLWSBH) {
                this.JZZSLWSBH = JZZSLWSBH;
            }

            public String getSLRXM() {
                return SLRXM;
            }

            public void setSLRXM(String SLRXM) {
                this.SLRXM = SLRXM;
            }

            public String getDJDWJGMC() {
                return DJDWJGMC;
            }

            public void setDJDWJGMC(String DJDWJGMC) {
                this.DJDWJGMC = DJDWJGMC;
            }

            public String getSLJGMC() {
                return SLJGMC;
            }

            public void setSLJGMC(String SLJGMC) {
                this.SLJGMC = SLJGMC;
            }
        }
    }
}
