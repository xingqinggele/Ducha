package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/18 8:52.
 */
public class JYDeaddeteilsbean
{

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"zdrList":[{"SJLY":"0","RYID":"220104194511161325000010056393","SWRQ":"20190909","CZDWMC":"长春市公安局经济犯罪侦察支队十二中队","DJR":"102741","HJDZXZ":"清华路24号","SJJZDZXZ":"清华路24号","XMPY":"yangfenglan","WKJBMC":"经济案中利益受损群体的重点上访人","PCSWKRXM":"唐筠强","SQGLJBBS":"0","WKJB":"63","MZMC":"汉族","PCSJGMC":"长春市桂林路派出所","GXSJ":"20190703110207","XBMC":"女","MZ":"01","JZWKRXM":"李本武","CSRQ":"19451116","DJDW":"220100021900","ZT":"0","JZWKRDH":"15904403693","CZIP":"10.106.176.64","JZMC":"经侦","RKLB":"1","YWFL":"zdr_xxcj_dj","PCSDM":"220104401","PCSWKRJH":"106082","SQCXBS":"0","DJDWMC":"长春市公安局经济犯罪侦察支队十二中队","XLH":170836,"LGZT":"0","CZYH":"102741","DQM":"吉林省长春市","JZWKRJH":"102741","HJDPCSMC":"长春市桂林路派出所","JZGAJGJGDM":"220100021900","XB":"2","HJDZBM":"2201002411120000044775","PCSWKRDH":"15568896335","PCSWKRBDSJ":"20170614154546","GMSFHM":"220104194511161325","XM":"杨凤兰","HJDPCSDM":"220104401","ZYWT":"百货公司上访群体.该人户籍在桂林路派出所清华路委85租，现住本市明珠派出所管内银河家园小区53、54栋2单元1029室桂林路派出所辖区内无住房。其子林玉生身份证号220104196902091319电话13804352955 林玉生住明珠派出所管内临河街中海国际J-8栋2单元3004室，民警联系该人儿子对其母亲上访情况不掌握。\n\n","HJDZSSXQ":"220104","LXFS":"15584460199","JZDM":"2","GLJB":"C","DJSJ":"20170518140936","JZGAJGJGMC":"长春市公安局经济犯罪侦察支队十二中队"}],"varList":[{"SJLY":"0","RYID":"220104194511161325000010056393","SWRQ":"20190909","DJR":"102741","HJDZXZ":"清华路24号","SJJZDZXZ":"清华路24号","XMPY":"yangfenglan","WKJBMC":"经济案中利益受损群体的重点上访人","PCSWKRXM":"唐筠强","SQGLJBBS":"0","WKJB":"63","MZMC":"汉族","PCSJGMC":"长春市桂林路派出所","GXSJ":"20190703110207","XBMC":"女","MZ":"01","JZWKRXM":"李本武","CSRQ":"19451116","GXSJ1":"Sep 10, 2019 10:50:23 AM","DJDW":"220100021900","ZT":"0","JZWKRDH":"15904403693","CZIP":"10.106.176.64","JZMC":"经侦","RKLB":"1","YWFL":"zdr_xxcj_dj","PCSDM":"220104401","PCSWKRJH":"106082","SQCXBS":"0","XLH":170836,"CZDW":"220100021900","LGZT":"0","CZYH":"102741","DQM":"220100","JZWKRJH":"102741","HJDPCSMC":"长春市桂林路派出所","JZGAJGJGDM":"220100021900","ZDMC":"吉林省长春市","XB":"2","HJDZBM":"2201002411120000044775","PCSWKRDH":"15568896335","PCSWKRBDSJ":"20170614154546","GMSFHM":"220104194511161325","XM":"杨凤兰","HJDPCSDM":"220104401","ZYWT":"百货公司上访群体.该人户籍在桂林路派出所清华路委85租，现住本市明珠派出所管内银河家园小区53、54栋2单元1029室桂林路派出所辖区内无住房。其子林玉生身份证号220104196902091319电话13804352955 林玉生住明珠派出所管内临河街中海国际J-8栋2单元3004室，民警联系该人儿子对其母亲上访情况不掌握。\n\n","HJDZSSXQ":"220104","LXFS":"15584460199","JZDM":"2","GLJB":"C","DJSJ":"20170518140936","JZGAJGJGMC":"长春市公安局经济犯罪侦察支队十二中队"}]}
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
        private List<VarListBean> varList;

        public List<ZdrListBean> getZdrList() {
            return zdrList;
        }

        public void setZdrList(List<ZdrListBean> zdrList) {
            this.zdrList = zdrList;
        }

        public List<VarListBean> getVarList() {
            return varList;
        }

        public void setVarList(List<VarListBean> varList) {
            this.varList = varList;
        }

        public static class ZdrListBean {
            /**
             * SJLY : 0
             * RYID : 220104194511161325000010056393
             * SWRQ : 20190909
             * CZDWMC : 长春市公安局经济犯罪侦察支队十二中队
             * DJR : 102741
             * HJDZXZ : 清华路24号
             * SJJZDZXZ : 清华路24号
             * XMPY : yangfenglan
             * WKJBMC : 经济案中利益受损群体的重点上访人
             * PCSWKRXM : 唐筠强
             * SQGLJBBS : 0
             * WKJB : 63
             * MZMC : 汉族
             * PCSJGMC : 长春市桂林路派出所
             * GXSJ : 20190703110207
             * XBMC : 女
             * MZ : 01
             * JZWKRXM : 李本武
             * CSRQ : 19451116
             * DJDW : 220100021900
             * ZT : 0
             * JZWKRDH : 15904403693
             * CZIP : 10.106.176.64
             * JZMC : 经侦
             * RKLB : 1
             * YWFL : zdr_xxcj_dj
             * PCSDM : 220104401
             * PCSWKRJH : 106082
             * SQCXBS : 0
             * DJDWMC : 长春市公安局经济犯罪侦察支队十二中队
             * XLH : 170836
             * LGZT : 0
             * CZYH : 102741
             * DQM : 吉林省长春市
             * JZWKRJH : 102741
             * HJDPCSMC : 长春市桂林路派出所
             * JZGAJGJGDM : 220100021900
             * XB : 2
             * HJDZBM : 2201002411120000044775
             * PCSWKRDH : 15568896335
             * PCSWKRBDSJ : 20170614154546
             * GMSFHM : 220104194511161325
             * XM : 杨凤兰
             * HJDPCSDM : 220104401
             * ZYWT : 百货公司上访群体.该人户籍在桂林路派出所清华路委85租，现住本市明珠派出所管内银河家园小区53、54栋2单元1029室桂林路派出所辖区内无住房。其子林玉生身份证号220104196902091319电话13804352955 林玉生住明珠派出所管内临河街中海国际J-8栋2单元3004室，民警联系该人儿子对其母亲上访情况不掌握。
             * HJDZSSXQ : 220104
             * LXFS : 15584460199
             * JZDM : 2
             * GLJB : C
             * DJSJ : 20170518140936
             * JZGAJGJGMC : 长春市公安局经济犯罪侦察支队十二中队
             */

            private String SJLY;
            private String RYID;
            private String SWRQ;
            private String CZDWMC;
            private String DJR;
            private String HJDZXZ;
            private String SJJZDZXZ;
            private String XMPY;
            private String WKJBMC;
            private String PCSWKRXM;
            private String SQGLJBBS;
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

            public String getSWRQ() {
                return SWRQ;
            }

            public void setSWRQ(String SWRQ) {
                this.SWRQ = SWRQ;
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

        public static class VarListBean {
            /**
             * SJLY : 0
             * RYID : 220104194511161325000010056393
             * SWRQ : 20190909
             * DJR : 102741
             * HJDZXZ : 清华路24号
             * SJJZDZXZ : 清华路24号
             * XMPY : yangfenglan
             * WKJBMC : 经济案中利益受损群体的重点上访人
             * PCSWKRXM : 唐筠强
             * SQGLJBBS : 0
             * WKJB : 63
             * MZMC : 汉族
             * PCSJGMC : 长春市桂林路派出所
             * GXSJ : 20190703110207
             * XBMC : 女
             * MZ : 01
             * JZWKRXM : 李本武
             * CSRQ : 19451116
             * GXSJ1 : Sep 10, 2019 10:50:23 AM
             * DJDW : 220100021900
             * ZT : 0
             * JZWKRDH : 15904403693
             * CZIP : 10.106.176.64
             * JZMC : 经侦
             * RKLB : 1
             * YWFL : zdr_xxcj_dj
             * PCSDM : 220104401
             * PCSWKRJH : 106082
             * SQCXBS : 0
             * XLH : 170836
             * CZDW : 220100021900
             * LGZT : 0
             * CZYH : 102741
             * DQM : 220100
             * JZWKRJH : 102741
             * HJDPCSMC : 长春市桂林路派出所
             * JZGAJGJGDM : 220100021900
             * ZDMC : 吉林省长春市
             * XB : 2
             * HJDZBM : 2201002411120000044775
             * PCSWKRDH : 15568896335
             * PCSWKRBDSJ : 20170614154546
             * GMSFHM : 220104194511161325
             * XM : 杨凤兰
             * HJDPCSDM : 220104401
             * ZYWT : 百货公司上访群体.该人户籍在桂林路派出所清华路委85租，现住本市明珠派出所管内银河家园小区53、54栋2单元1029室桂林路派出所辖区内无住房。其子林玉生身份证号220104196902091319电话13804352955 林玉生住明珠派出所管内临河街中海国际J-8栋2单元3004室，民警联系该人儿子对其母亲上访情况不掌握。
             * HJDZSSXQ : 220104
             * LXFS : 15584460199
             * JZDM : 2
             * GLJB : C
             * DJSJ : 20170518140936
             * JZGAJGJGMC : 长春市公安局经济犯罪侦察支队十二中队
             */

            private String SJLY;
            private String RYID;
            private String SWRQ;
            private String DJR;
            private String HJDZXZ;
            private String SJJZDZXZ;
            private String XMPY;
            private String WKJBMC;
            private String PCSWKRXM;
            private String SQGLJBBS;
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
            private String YWFL;
            private String PCSDM;
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

            public String getSWRQ() {
                return SWRQ;
            }

            public void setSWRQ(String SWRQ) {
                this.SWRQ = SWRQ;
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
