package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/18 9:12.
 */
public class JYZaitaoDeteilsbean
{

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"zdrList":[{"SJLY":"0","RYID":"220381197103064240000004324987","SJJZDGAJGDM":"220381610000","SJJZDPCSMC":"公主岭市河南派出所","CZDWMC":"暂无","DJR":"303179","HJDZXZ":"秦家屯镇韩家泡子村九组","SJJZDZXZ":"公主岭市五道街临31355号站前小区九号楼3单元603","XMPY":"huangshuqin","WKJBMC":"邪教","SJJZDPCSDM":"201","PCSWKRXM":"李闯","SQGLJBBS":"0","SJJZDZBM":"2203816400000007144911","WKJB":"03","MZMC":"汉族","PCSJGMC":"公主岭市河南派出所","GXSJ":"20180803174645","XBMC":"女","MZ":"01","JZWKRXM":"杨明瑞","CSRQ":"19710306","DJDW":"220381110000","ZT":"0","JZWKRDH":"18543471110","CZIP":"10.107.254.30","JZMC":"国保","RKLB":"5","SJJZDZSSX":"220381","YWFL":"zdr_xxcj_dj","PCSDM":"220381201","PCSWKRJH":"303121","SQCXBS":"0","DJDWMC":"暂无","XLH":296490,"LGZT":"0","CZYH":"303179","DQM":"吉林省公主岭市","JZWKRJH":"303179","HJDPCSMC":"秦家屯派出所","JZGAJGJGDM":"220381110000","XB":"2","HJDZBM":"2203818000000000010191","GMSFHM":"220381197103064240","XM":"黄淑芹","HJDPCSDM":"220381217","ZYWT":"法轮功邪教人员","HJDZSSXQ":"220381","LXFS":"无","JZDM":"4","GLJB":"C","DJSJ":"20180803174645","PHOTOID":"48133637","JZGAJGJGMC":"公主岭市公安局国保大队"}],"count":102,"ztList":[{"ZTSPR":"姚文军","RYZT":"0","DJSPR_XM":"姚文军","LADW_GAJGMC":"公安局","ZBDW_GAJGMC":"公安局刑警大队追逃中队","GXSJ":{"data":[120,118,2,11,7,27,26]},"YWZT":"2","TPSJ":"Jan 23, 2017 12:00:00 AM","XZZ_DZMC":"秦家屯派出所秦家屯镇韩家泡子村九组","ZBR_LXDH":"18043406127   18043406746","XM":"黄淑芹","XXLYMS":"老在逃系统：QG_ZTRY_JBXX","ZBR_XM":"王明亮  张超","LARQ":"Aug 12, 2016 12:00:00 AM","XBDM":"2","XXSC_PDBZ":"0","XXRBKSJ_RQSJ":"Jan 26, 2017 11:29:23 AM","JYAQ":"2016年8月8日，黄淑芹在公主岭市河北街章翰小学家属楼楼下将正在执行公务的国保大队民警钟民打伤。犯罪嫌疑人黄淑芹现在逃。","HJDZ_DZMC":"秦家屯派出所秦家屯镇韩家泡子村九组","ZJHM":"220381197103064240"}]}
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
         * zdrList : [{"SJLY":"0","RYID":"220381197103064240000004324987","SJJZDGAJGDM":"220381610000","SJJZDPCSMC":"公主岭市河南派出所","CZDWMC":"暂无","DJR":"303179","HJDZXZ":"秦家屯镇韩家泡子村九组","SJJZDZXZ":"公主岭市五道街临31355号站前小区九号楼3单元603","XMPY":"huangshuqin","WKJBMC":"邪教","SJJZDPCSDM":"201","PCSWKRXM":"李闯","SQGLJBBS":"0","SJJZDZBM":"2203816400000007144911","WKJB":"03","MZMC":"汉族","PCSJGMC":"公主岭市河南派出所","GXSJ":"20180803174645","XBMC":"女","MZ":"01","JZWKRXM":"杨明瑞","CSRQ":"19710306","DJDW":"220381110000","ZT":"0","JZWKRDH":"18543471110","CZIP":"10.107.254.30","JZMC":"国保","RKLB":"5","SJJZDZSSX":"220381","YWFL":"zdr_xxcj_dj","PCSDM":"220381201","PCSWKRJH":"303121","SQCXBS":"0","DJDWMC":"暂无","XLH":296490,"LGZT":"0","CZYH":"303179","DQM":"吉林省公主岭市","JZWKRJH":"303179","HJDPCSMC":"秦家屯派出所","JZGAJGJGDM":"220381110000","XB":"2","HJDZBM":"2203818000000000010191","GMSFHM":"220381197103064240","XM":"黄淑芹","HJDPCSDM":"220381217","ZYWT":"法轮功邪教人员","HJDZSSXQ":"220381","LXFS":"无","JZDM":"4","GLJB":"C","DJSJ":"20180803174645","PHOTOID":"48133637","JZGAJGJGMC":"公主岭市公安局国保大队"}]
         * count : 102
         * ztList : [{"ZTSPR":"姚文军","RYZT":"0","DJSPR_XM":"姚文军","LADW_GAJGMC":"公安局","ZBDW_GAJGMC":"公安局刑警大队追逃中队","GXSJ":{"data":[120,118,2,11,7,27,26]},"YWZT":"2","TPSJ":"Jan 23, 2017 12:00:00 AM","XZZ_DZMC":"秦家屯派出所秦家屯镇韩家泡子村九组","ZBR_LXDH":"18043406127   18043406746","XM":"黄淑芹","XXLYMS":"老在逃系统：QG_ZTRY_JBXX","ZBR_XM":"王明亮  张超","LARQ":"Aug 12, 2016 12:00:00 AM","XBDM":"2","XXSC_PDBZ":"0","XXRBKSJ_RQSJ":"Jan 26, 2017 11:29:23 AM","JYAQ":"2016年8月8日，黄淑芹在公主岭市河北街章翰小学家属楼楼下将正在执行公务的国保大队民警钟民打伤。犯罪嫌疑人黄淑芹现在逃。","HJDZ_DZMC":"秦家屯派出所秦家屯镇韩家泡子村九组","ZJHM":"220381197103064240"}]
         */

        private int count;
        private List<ZdrListBean> zdrList;
        private List<ZtListBean> ztList;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<ZdrListBean> getZdrList() {
            return zdrList;
        }

        public void setZdrList(List<ZdrListBean> zdrList) {
            this.zdrList = zdrList;
        }

        public List<ZtListBean> getZtList() {
            return ztList;
        }

        public void setZtList(List<ZtListBean> ztList) {
            this.ztList = ztList;
        }

        public static class ZdrListBean {
            /**
             * SJLY : 0
             * RYID : 220381197103064240000004324987
             * SJJZDGAJGDM : 220381610000
             * SJJZDPCSMC : 公主岭市河南派出所
             * CZDWMC : 暂无
             * DJR : 303179
             * HJDZXZ : 秦家屯镇韩家泡子村九组
             * SJJZDZXZ : 公主岭市五道街临31355号站前小区九号楼3单元603
             * XMPY : huangshuqin
             * WKJBMC : 邪教
             * SJJZDPCSDM : 201
             * PCSWKRXM : 李闯
             * SQGLJBBS : 0
             * SJJZDZBM : 2203816400000007144911
             * WKJB : 03
             * MZMC : 汉族
             * PCSJGMC : 公主岭市河南派出所
             * GXSJ : 20180803174645
             * XBMC : 女
             * MZ : 01
             * JZWKRXM : 杨明瑞
             * CSRQ : 19710306
             * DJDW : 220381110000
             * ZT : 0
             * JZWKRDH : 18543471110
             * CZIP : 10.107.254.30
             * JZMC : 国保
             * RKLB : 5
             * SJJZDZSSX : 220381
             * YWFL : zdr_xxcj_dj
             * PCSDM : 220381201
             * PCSWKRJH : 303121
             * SQCXBS : 0
             * DJDWMC : 暂无
             * XLH : 296490
             * LGZT : 0
             * CZYH : 303179
             * DQM : 吉林省公主岭市
             * JZWKRJH : 303179
             * HJDPCSMC : 秦家屯派出所
             * JZGAJGJGDM : 220381110000
             * XB : 2
             * HJDZBM : 2203818000000000010191
             * GMSFHM : 220381197103064240
             * XM : 黄淑芹
             * HJDPCSDM : 220381217
             * ZYWT : 法轮功邪教人员
             * HJDZSSXQ : 220381
             * LXFS : 无
             * JZDM : 4
             * GLJB : C
             * DJSJ : 20180803174645
             * PHOTOID : 48133637
             * JZGAJGJGMC : 公主岭市公安局国保大队
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
            private String GMSFHM;
            private String XM;
            private String HJDPCSDM;
            private String ZYWT;
            private String HJDZSSXQ;
            private String LXFS;
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

        public static class ZtListBean {
            /**
             * ZTSPR : 姚文军
             * RYZT : 0
             * DJSPR_XM : 姚文军
             * LADW_GAJGMC : 公安局
             * ZBDW_GAJGMC : 公安局刑警大队追逃中队
             * GXSJ : {"data":[120,118,2,11,7,27,26]}
             * YWZT : 2
             * TPSJ : Jan 23, 2017 12:00:00 AM
             * XZZ_DZMC : 秦家屯派出所秦家屯镇韩家泡子村九组
             * ZBR_LXDH : 18043406127   18043406746
             * XM : 黄淑芹
             * XXLYMS : 老在逃系统：QG_ZTRY_JBXX
             * ZBR_XM : 王明亮  张超
             * LARQ : Aug 12, 2016 12:00:00 AM
             * XBDM : 2
             * XXSC_PDBZ : 0
             * XXRBKSJ_RQSJ : Jan 26, 2017 11:29:23 AM
             * JYAQ : 2016年8月8日，黄淑芹在公主岭市河北街章翰小学家属楼楼下将正在执行公务的国保大队民警钟民打伤。犯罪嫌疑人黄淑芹现在逃。
             * HJDZ_DZMC : 秦家屯派出所秦家屯镇韩家泡子村九组
             * ZJHM : 220381197103064240
             */

            private String ZTSPR;
            private String RYZT;
            private String DJSPR_XM;
            private String LADW_GAJGMC;
            private String ZBDW_GAJGMC;
            private GXSJBean GXSJ;
            private String YWZT;
            private String TPSJ;
            private String XZZ_DZMC;
            private String ZBR_LXDH;
            private String XM;
            private String XXLYMS;
            private String ZBR_XM;
            private String LARQ;
            private String XBDM;
            private String XXSC_PDBZ;
            private String XXRBKSJ_RQSJ;
            private String JYAQ;
            private String HJDZ_DZMC;
            private String ZJHM;

            public String getZTSPR() {
                return ZTSPR;
            }

            public void setZTSPR(String ZTSPR) {
                this.ZTSPR = ZTSPR;
            }

            public String getRYZT() {
                return RYZT;
            }

            public void setRYZT(String RYZT) {
                this.RYZT = RYZT;
            }

            public String getDJSPR_XM() {
                return DJSPR_XM;
            }

            public void setDJSPR_XM(String DJSPR_XM) {
                this.DJSPR_XM = DJSPR_XM;
            }

            public String getLADW_GAJGMC() {
                return LADW_GAJGMC;
            }

            public void setLADW_GAJGMC(String LADW_GAJGMC) {
                this.LADW_GAJGMC = LADW_GAJGMC;
            }

            public String getZBDW_GAJGMC() {
                return ZBDW_GAJGMC;
            }

            public void setZBDW_GAJGMC(String ZBDW_GAJGMC) {
                this.ZBDW_GAJGMC = ZBDW_GAJGMC;
            }

            public GXSJBean getGXSJ() {
                return GXSJ;
            }

            public void setGXSJ(GXSJBean GXSJ) {
                this.GXSJ = GXSJ;
            }

            public String getYWZT() {
                return YWZT;
            }

            public void setYWZT(String YWZT) {
                this.YWZT = YWZT;
            }

            public String getTPSJ() {
                return TPSJ;
            }

            public void setTPSJ(String TPSJ) {
                this.TPSJ = TPSJ;
            }

            public String getXZZ_DZMC() {
                return XZZ_DZMC;
            }

            public void setXZZ_DZMC(String XZZ_DZMC) {
                this.XZZ_DZMC = XZZ_DZMC;
            }

            public String getZBR_LXDH() {
                return ZBR_LXDH;
            }

            public void setZBR_LXDH(String ZBR_LXDH) {
                this.ZBR_LXDH = ZBR_LXDH;
            }

            public String getXM() {
                return XM;
            }

            public void setXM(String XM) {
                this.XM = XM;
            }

            public String getXXLYMS() {
                return XXLYMS;
            }

            public void setXXLYMS(String XXLYMS) {
                this.XXLYMS = XXLYMS;
            }

            public String getZBR_XM() {
                return ZBR_XM;
            }

            public void setZBR_XM(String ZBR_XM) {
                this.ZBR_XM = ZBR_XM;
            }

            public String getLARQ() {
                return LARQ;
            }

            public void setLARQ(String LARQ) {
                this.LARQ = LARQ;
            }

            public String getXBDM() {
                return XBDM;
            }

            public void setXBDM(String XBDM) {
                this.XBDM = XBDM;
            }

            public String getXXSC_PDBZ() {
                return XXSC_PDBZ;
            }

            public void setXXSC_PDBZ(String XXSC_PDBZ) {
                this.XXSC_PDBZ = XXSC_PDBZ;
            }

            public String getXXRBKSJ_RQSJ() {
                return XXRBKSJ_RQSJ;
            }

            public void setXXRBKSJ_RQSJ(String XXRBKSJ_RQSJ) {
                this.XXRBKSJ_RQSJ = XXRBKSJ_RQSJ;
            }

            public String getJYAQ() {
                return JYAQ;
            }

            public void setJYAQ(String JYAQ) {
                this.JYAQ = JYAQ;
            }

            public String getHJDZ_DZMC() {
                return HJDZ_DZMC;
            }

            public void setHJDZ_DZMC(String HJDZ_DZMC) {
                this.HJDZ_DZMC = HJDZ_DZMC;
            }

            public String getZJHM() {
                return ZJHM;
            }

            public void setZJHM(String ZJHM) {
                this.ZJHM = ZJHM;
            }

            public static class GXSJBean {
                private List<Integer> data;

                public List<Integer> getData() {
                    return data;
                }

                public void setData(List<Integer> data) {
                    this.data = data;
                }
            }
        }
    }
}
