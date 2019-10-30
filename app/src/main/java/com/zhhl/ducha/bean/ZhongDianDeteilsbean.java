package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/10/30 16:10.
 */
public class ZhongDianDeteilsbean {


    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"SJLY":"0","RYID":"220381197912250211000003835963","SJJZDGAJGDM":"220381610000","SJJZDPCSMC":"公主岭市河南派出所","CZDWMC":"暂无","DJR":"303057","CXSJ":"20150826095147","SQCXRDH":"18043406941","HJDZXZ":"河南街长安委四组","SJJZDZXZ":"公主岭市临30803号移动公司家属楼东楼1单元501室","XMPY":"hantianze","SQCXLY":"河北辖区","WKJBMC":"肇事肇祸等重性精神病人","SJJZDPCSDM":"201","PCSWKRXM":"罗广威","SQGLJBBS":"0","SJJZDZBM":"2203816100000005928133","CXRJH":"303057","SQCXRXM":"罗广威","WKJB":"62","MZMC":"满族","PCSJGMC":"公主岭市河南派出所","GXSJ":"20150718173826","XBMC":"男","MZ":"11","JZWKRXM":"冯建国","CSRQ":"19791225","CXJGDM":"220381080000","SQCXPCSDM":"201","DJDW":"220381080000","ZT":"1","JZWKRDH":"13504351919","CZIP":"10.107.252.27","JZMC":"治安","CXJGMC":"公主岭市公安局治安大队","RKLB":"1","SJJZDZSSX":"220381","YWFL":"zdr_abcx_sq","PCSDM":"220381201","SQCXJGMC":"公主岭市河南派出所","PCSWKRJH":"303513","SQCXBS":"1","DJDWMC":"暂无","XLH":69771,"LGZT":"0","CZYH":"303513","SQCXSJ":"20150718173826","DQM":"吉林省公主岭市","JZWKRJH":"303057","HJDPCSMC":"河南派出所","JZGAJGJGDM":"220381080000","XB":"1","SQCXRJH":"303513","CXRXM":"冯建国","HJDZBM":"2203816100000000006440","PCSWKRDH":"18043406941","PCSWKRBDSJ":"20150623101425","SQCXJGDM":"220381610000","GMSFHM":"220381197912250211","XM":"韩天泽","HJDPCSDM":"220381201","ZYWT":"为评估级别在三级以上或曾经肇事肇祸的重性精神病人\n","HJDZSSXQ":"220381","ZDRDH":"1","JZDM":"1","GLJB":"C","DJSJ":"20141104161334","JZGAJGJGMC":"公主岭市公安局治安大队"},{"SJLY":"0","RYID":"220381197912250211000003835963","SJJZDGAJGDM":"220381640000","CZDWMC":"暂无","DJR":"303057","SQCXRDH":"18543471656","HJDZXZ":"河南街长安委四组","SJJZDZXZ":"公主岭市临30803号移动公司家属楼东楼1单元501室","XMPY":"hantianze","SQCXLY":"韩天泽在其家中由其母亲照顾，没有肇事肇祸倾向，没有上访记录。","WKJBMC":"肇事肇祸等重性精神病人","SJJZDPCSDM":"202","PCSWKRXM":"刘健","SQGLJBBS":"0","SJJZDZBM":"2203816100000005928133","SQCXRXM":"刘健","WKJB":"62","MZMC":"满族","GXSJ":"20190402113735","XBMC":"男","MZ":"11","JZWKRXM":"冯建国","CSRQ":"19791225","SQCXPCSDM":"202","DJDW":"220381080000","ZT":"0","JZWKRDH":"13504351919","CZIP":"10.107.243.77","JZMC":"治安","RKLB":"1","SJJZDZSSX":"220381","YWFL":"zdr_abcx_sq","PCSDM":"220381202","SQCXJGMC":"公主岭市河北派出所","PCSWKRJH":"303492","SQCXBS":"1","DJDWMC":"暂无","XLH":107121,"LGZT":"0","CZYH":"303492","SQCXSJ":"20180327085407","DQM":"吉林省公主岭市","JZWKRJH":"303057","HJDPCSMC":"河南派出所","JZGAJGJGDM":"220381080000","XB":"1","SQCXRJH":"303492","HJDZBM":"2203816100000000006440","PCSWKRDH":"13943553322","PCSWKRBDSJ":"20190402113735","SQCXJGDM":"220381640000","GMSFHM":"220381197912250211","XM":"韩天泽","HJDPCSDM":"220381201","ZYWT":"为评估级别在三级以上或曾经肇事肇祸的重性精神病人","HJDZSSXQ":"220381","LXFS":"13804470268","JZDM":"1","GLJB":"C","DJSJ":"20150826095222","JZGAJGJGMC":"公主岭市公安局治安大队"}]}
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
             * RYID : 220381197912250211000003835963
             * SJJZDGAJGDM : 220381610000
             * SJJZDPCSMC : 公主岭市河南派出所
             * CZDWMC : 暂无
             * DJR : 303057
             * CXSJ : 20150826095147
             * SQCXRDH : 18043406941
             * HJDZXZ : 河南街长安委四组
             * SJJZDZXZ : 公主岭市临30803号移动公司家属楼东楼1单元501室
             * XMPY : hantianze
             * SQCXLY : 河北辖区
             * WKJBMC : 肇事肇祸等重性精神病人
             * SJJZDPCSDM : 201
             * PCSWKRXM : 罗广威
             * SQGLJBBS : 0
             * SJJZDZBM : 2203816100000005928133
             * CXRJH : 303057
             * SQCXRXM : 罗广威
             * WKJB : 62
             * MZMC : 满族
             * PCSJGMC : 公主岭市河南派出所
             * GXSJ : 20150718173826
             * XBMC : 男
             * MZ : 11
             * JZWKRXM : 冯建国
             * CSRQ : 19791225
             * CXJGDM : 220381080000
             * SQCXPCSDM : 201
             * DJDW : 220381080000
             * ZT : 1
             * JZWKRDH : 13504351919
             * CZIP : 10.107.252.27
             * JZMC : 治安
             * CXJGMC : 公主岭市公安局治安大队
             * RKLB : 1
             * SJJZDZSSX : 220381
             * YWFL : zdr_abcx_sq
             * PCSDM : 220381201
             * SQCXJGMC : 公主岭市河南派出所
             * PCSWKRJH : 303513
             * SQCXBS : 1
             * DJDWMC : 暂无
             * XLH : 69771
             * LGZT : 0
             * CZYH : 303513
             * SQCXSJ : 20150718173826
             * DQM : 吉林省公主岭市
             * JZWKRJH : 303057
             * HJDPCSMC : 河南派出所
             * JZGAJGJGDM : 220381080000
             * XB : 1
             * SQCXRJH : 303513
             * CXRXM : 冯建国
             * HJDZBM : 2203816100000000006440
             * PCSWKRDH : 18043406941
             * PCSWKRBDSJ : 20150623101425
             * SQCXJGDM : 220381610000
             * GMSFHM : 220381197912250211
             * XM : 韩天泽
             * HJDPCSDM : 220381201
             * ZYWT : 为评估级别在三级以上或曾经肇事肇祸的重性精神病人
             * HJDZSSXQ : 220381
             * ZDRDH : 1
             * JZDM : 1
             * GLJB : C
             * DJSJ : 20141104161334
             * JZGAJGJGMC : 公主岭市公安局治安大队
             * LXFS : 13804470268
             */

            private String SJLY;
            private String RYID;
            private String SJJZDGAJGDM;
            private String SJJZDPCSMC;
            private String CZDWMC;
            private String DJR;
            private String CXSJ;
            private String SQCXRDH;
            private String HJDZXZ;
            private String SJJZDZXZ;
            private String XMPY;
            private String SQCXLY;
            private String WKJBMC;
            private String SJJZDPCSDM;
            private String PCSWKRXM;
            private String SQGLJBBS;
            private String SJJZDZBM;
            private String CXRJH;
            private String SQCXRXM;
            private String WKJB;
            private String MZMC;
            private String PCSJGMC;
            private String GXSJ;
            private String XBMC;
            private String MZ;
            private String JZWKRXM;
            private String CSRQ;
            private String CXJGDM;
            private String SQCXPCSDM;
            private String DJDW;
            private String ZT;
            private String JZWKRDH;
            private String CZIP;
            private String JZMC;
            private String CXJGMC;
            private String RKLB;
            private String SJJZDZSSX;
            private String YWFL;
            private String PCSDM;
            private String SQCXJGMC;
            private String PCSWKRJH;
            private String SQCXBS;
            private String DJDWMC;
            private int XLH;
            private String LGZT;
            private String CZYH;
            private String SQCXSJ;
            private String DQM;
            private String JZWKRJH;
            private String HJDPCSMC;
            private String JZGAJGJGDM;
            private String XB;
            private String SQCXRJH;
            private String CXRXM;
            private String HJDZBM;
            private String PCSWKRDH;
            private String PCSWKRBDSJ;
            private String SQCXJGDM;
            private String GMSFHM;
            private String XM;
            private String HJDPCSDM;
            private String ZYWT;
            private String HJDZSSXQ;
            private String ZDRDH;
            private String JZDM;
            private String GLJB;
            private String DJSJ;
            private String JZGAJGJGMC;
            private String LXFS;

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

            public String getCXSJ() {
                return CXSJ;
            }

            public void setCXSJ(String CXSJ) {
                this.CXSJ = CXSJ;
            }

            public String getSQCXRDH() {
                return SQCXRDH;
            }

            public void setSQCXRDH(String SQCXRDH) {
                this.SQCXRDH = SQCXRDH;
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

            public String getSQCXLY() {
                return SQCXLY;
            }

            public void setSQCXLY(String SQCXLY) {
                this.SQCXLY = SQCXLY;
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

            public String getCXRJH() {
                return CXRJH;
            }

            public void setCXRJH(String CXRJH) {
                this.CXRJH = CXRJH;
            }

            public String getSQCXRXM() {
                return SQCXRXM;
            }

            public void setSQCXRXM(String SQCXRXM) {
                this.SQCXRXM = SQCXRXM;
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

            public String getCXJGDM() {
                return CXJGDM;
            }

            public void setCXJGDM(String CXJGDM) {
                this.CXJGDM = CXJGDM;
            }

            public String getSQCXPCSDM() {
                return SQCXPCSDM;
            }

            public void setSQCXPCSDM(String SQCXPCSDM) {
                this.SQCXPCSDM = SQCXPCSDM;
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

            public String getCXJGMC() {
                return CXJGMC;
            }

            public void setCXJGMC(String CXJGMC) {
                this.CXJGMC = CXJGMC;
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

            public String getSQCXJGMC() {
                return SQCXJGMC;
            }

            public void setSQCXJGMC(String SQCXJGMC) {
                this.SQCXJGMC = SQCXJGMC;
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

            public String getSQCXSJ() {
                return SQCXSJ;
            }

            public void setSQCXSJ(String SQCXSJ) {
                this.SQCXSJ = SQCXSJ;
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

            public String getSQCXRJH() {
                return SQCXRJH;
            }

            public void setSQCXRJH(String SQCXRJH) {
                this.SQCXRJH = SQCXRJH;
            }

            public String getCXRXM() {
                return CXRXM;
            }

            public void setCXRXM(String CXRXM) {
                this.CXRXM = CXRXM;
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

            public String getSQCXJGDM() {
                return SQCXJGDM;
            }

            public void setSQCXJGDM(String SQCXJGDM) {
                this.SQCXJGDM = SQCXJGDM;
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

            public String getZDRDH() {
                return ZDRDH;
            }

            public void setZDRDH(String ZDRDH) {
                this.ZDRDH = ZDRDH;
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

            public String getLXFS() {
                return LXFS;
            }

            public void setLXFS(String LXFS) {
                this.LXFS = LXFS;
            }
        }
    }
}
