package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/16 11:06.
 */
public class Homedetalisbean
{


    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"listData":[{"SJLY":"0","RYID":"220104195504083132000004448371","SJJZDGAJGDM":"220199270000","SJJZDPCSMC":"长春市西新经济技术开发区分局东风大街派出所","CZDWMC":"暂无","DJR":"109143","CXSJ":"20150301122932","HJDZXZ":"锦程大街274栋1门5中门","SJJZDZXZ":"吉林省长春市绿园区锦程大街5号18街区274栋1单元201室","XMPY":"fudaji","WKJBMC":"其他涉访上访重点人","SJJZDPCSDM":"651","PCSWKRXM":"刘洪缘","SQGLJBBS":"0","SJJZDZBM":"2201992700000008305834","CXRJH":"109143","WKJB":"31","MZMC":"汉族","PCSJGMC":"长春市西新经济技术开发区分局东风大街派出所","GXSJ":"20141105085115","XBMC":"男","MZ":"01","JZWKRXM":"宋晓惠","CSRQ":"19550408","CXJGDM":"220199030000","DJDW":"220199030000","ZT":"1","JZWKRDH":"15904407162","CZIP":"10.106.138.115","JZMC":"控申","CXJGMC":"长春市公安局西新经济技术开发区分局指挥室","RKLB":"1","SJJZDZSSX":"220106","YWFL":"zdr_xxcj_dj","PCSDM":"220106651","PCSWKRJH":"108462","SQCXBS":"0","DJDWMC":"长春市公安局汽车经济技术开发区分局治安大队","XLH":68506,"LGZT":"0","CZYH":"109182","DQM":"吉林省长春市","JZWKRJH":"109143","HJDPCSMC":"长春市东风大街派出所","JZGAJGJGDM":"220199030000","XB":"1","CXRXM":"宋晓惠","HJDZBM":"2201002911040000115557","PCSWKRDH":"18343090233","PCSWKRBDSJ":"20141105085115","GMSFHM":"220104195504083132","XM":"付大奇","HJDPCSDM":"220162651","ZYWT":"1999年12月7日，付大奇受长春市华盛兴物质经销处的委托，往唐山送一台捷达王轿车。12月8日，付将车开到唐山消防四中队门前，被一自称田光辉（女）的人，以试驾为由将车开走，付报110，唐山市路南分局刑警二中队受理了案件。同年12月18日，唐山路南分局二中队刘贵臣队长告知付大奇，田光辉（别名：周淑元）已被抓获，因其在湖南安乡涉嫌诈骗犯罪，系逃犯，现湖南警方已将田光辉解回，付大奇的案件也一并已移交，具体的情况与湖南警方联系。自此之后，付大奇的案件无处查询，其本人多次进京上访。","HJDZSSXQ":"220106","ZDRDH":"1","JZDM":"6","GLJB":"C","DJSJ":"20141104143553","JZGAJGJGMC":"长春市公安局西新经济技术开发区分局指挥室"},{"SJLY":"0","RYID":"220104195504083132000004448371","SJJZDGAJGDM":"220199270000","SJJZDPCSMC":"长春市西新经济技术开发区分局东风大街派出所","JZWKRBDSJ":"20170628125348","CZDWMC":"暂无","DJR":"108034","HJDZXZ":"锦程大街274栋1门5中门","SJJZDZXZ":"吉林省长春市绿园区锦程大街5号18街区274栋1单元201室","XMPY":"fudaji","WKJBMC":"涉访重点人","SJJZDPCSDM":"651","PCSWKRXM":"郭帅","SQGLJBBS":"0","SJJZDZBM":"2201992700000008305834","WKJB":"61","MZMC":"汉族","PCSJGMC":"长春市西新经济技术开发区分局东风大街派出所","GXSJ":"20190906113152","XBMC":"男","MZ":"01","JZWKRXM":"舒畅","CSRQ":"19550408","DJDW":"220199270000","ZT":"0","JZWKRDH":"15904403825","CZIP":"10.106.139.60","JZMC":"治安","RKLB":"1","SJJZDZSSX":"220106","YWFL":"zdr_xxcj_pcs_dj","PCSDM":"220106651","SPBZ":"9","PCSWKRJH":"107042","SQCXBS":"0","DJDWMC":"暂无","XLH":200717,"LGZT":"0","CZYH":"108892","DQM":"吉林省长春市","JZWKRJH":"109464","HJDPCSMC":"长春市东风大街派出所","JZGAJGJGDM":"220199150000","XB":"1","HJDZBM":"2201002911040000115557","PCSWKRDH":"85902562","PCSWKRBDSJ":"20190906113152","GMSFHM":"220104195504083132","XM":"付大奇","HJDPCSDM":"220162651","ZYWT":"信访人于2016年告湖南省公安厅扣押其车辆至今不还。涉事单位：湖南省公安厅 。处理情况：问题未解决。","HJDZSSXQ":"220106","LXFS":"13804338332","JZDM":"1","GLJB":"C","DJSJ":"20170628125226","JZGAJGJGMC":"长春市公安局西新经济技术开发区分局治安警察中队"}]}
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
        private List<ListDataBean> listData;

        public List<ListDataBean> getListData() {
            return listData;
        }

        public void setListData(List<ListDataBean> listData) {
            this.listData = listData;
        }

        public static class ListDataBean {
            /**
             * SJLY : 0
             * RYID : 220104195504083132000004448371
             * SJJZDGAJGDM : 220199270000
             * SJJZDPCSMC : 长春市西新经济技术开发区分局东风大街派出所
             * CZDWMC : 暂无
             * DJR : 109143
             * CXSJ : 20150301122932
             * HJDZXZ : 锦程大街274栋1门5中门
             * SJJZDZXZ : 吉林省长春市绿园区锦程大街5号18街区274栋1单元201室
             * XMPY : fudaji
             * WKJBMC : 其他涉访上访重点人
             * SJJZDPCSDM : 651
             * PCSWKRXM : 刘洪缘
             * SQGLJBBS : 0
             * SJJZDZBM : 2201992700000008305834
             * CXRJH : 109143
             * WKJB : 31
             * MZMC : 汉族
             * PCSJGMC : 长春市西新经济技术开发区分局东风大街派出所
             * GXSJ : 20141105085115
             * XBMC : 男
             * MZ : 01
             * JZWKRXM : 宋晓惠
             * CSRQ : 19550408
             * CXJGDM : 220199030000
             * DJDW : 220199030000
             * ZT : 1
             * JZWKRDH : 15904407162
             * CZIP : 10.106.138.115
             * JZMC : 控申
             * CXJGMC : 长春市公安局西新经济技术开发区分局指挥室
             * RKLB : 1
             * SJJZDZSSX : 220106
             * YWFL : zdr_xxcj_dj
             * PCSDM : 220106651
             * PCSWKRJH : 108462
             * SQCXBS : 0
             * DJDWMC : 长春市公安局汽车经济技术开发区分局治安大队
             * XLH : 68506
             * LGZT : 0
             * CZYH : 109182
             * DQM : 吉林省长春市
             * JZWKRJH : 109143
             * HJDPCSMC : 长春市东风大街派出所
             * JZGAJGJGDM : 220199030000
             * XB : 1
             * CXRXM : 宋晓惠
             * HJDZBM : 2201002911040000115557
             * PCSWKRDH : 18343090233
             * PCSWKRBDSJ : 20141105085115
             * GMSFHM : 220104195504083132
             * XM : 付大奇
             * HJDPCSDM : 220162651
             * ZYWT : 1999年12月7日，付大奇受长春市华盛兴物质经销处的委托，往唐山送一台捷达王轿车。12月8日，付将车开到唐山消防四中队门前，被一自称田光辉（女）的人，以试驾为由将车开走，付报110，唐山市路南分局刑警二中队受理了案件。同年12月18日，唐山路南分局二中队刘贵臣队长告知付大奇，田光辉（别名：周淑元）已被抓获，因其在湖南安乡涉嫌诈骗犯罪，系逃犯，现湖南警方已将田光辉解回，付大奇的案件也一并已移交，具体的情况与湖南警方联系。自此之后，付大奇的案件无处查询，其本人多次进京上访。
             * HJDZSSXQ : 220106
             * ZDRDH : 1
             * JZDM : 6
             * GLJB : C
             * DJSJ : 20141104143553
             * JZGAJGJGMC : 长春市公安局西新经济技术开发区分局指挥室
             * JZWKRBDSJ : 20170628125348
             * SPBZ : 9
             * LXFS : 13804338332
             */

            private String SJLY;
            private String RYID;
            private String SJJZDGAJGDM;
            private String SJJZDPCSMC;
            private String CZDWMC;
            private String DJR;
            private String CXSJ;
            private String HJDZXZ;
            private String SJJZDZXZ;
            private String XMPY;
            private String WKJBMC;
            private String SJJZDPCSDM;
            private String PCSWKRXM;
            private String SQGLJBBS;
            private String SJJZDZBM;
            private String CXRJH;
            private String WKJB;
            private String MZMC;
            private String PCSJGMC;
            private String GXSJ;
            private String XBMC;
            private String MZ;
            private String JZWKRXM;
            private String CSRQ;
            private String CXJGDM;
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
            private String CXRXM;
            private String HJDZBM;
            private String PCSWKRDH;
            private String PCSWKRBDSJ;
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
            private String JZWKRBDSJ;
            private String SPBZ;
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

            public String getCXRJH() {
                return CXRJH;
            }

            public void setCXRJH(String CXRJH) {
                this.CXRJH = CXRJH;
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

            public String getJZWKRBDSJ() {
                return JZWKRBDSJ;
            }

            public void setJZWKRBDSJ(String JZWKRBDSJ) {
                this.JZWKRBDSJ = JZWKRBDSJ;
            }

            public String getSPBZ() {
                return SPBZ;
            }

            public void setSPBZ(String SPBZ) {
                this.SPBZ = SPBZ;
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
