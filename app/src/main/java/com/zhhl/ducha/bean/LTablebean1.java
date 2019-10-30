package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/10/30 16:57.
 */
public class LTablebean1 {

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"CC":"3","BC":"0","JL":"0","FENLEI":"领导交办重点人统计","SY":"1","GXSJ":"2019-10-30 04:00:00","LY":"0","MHK":"0","BS":"0","YJ":"2","TH":"0","CBS":"0","GZL":"0","ID":"b4295b0394554e4e89d41f7f89b16dd1","SP":"1","HEJI":"7"}]}
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
             * CC : 3
             * BC : 0
             * JL : 0
             * FENLEI : 领导交办重点人统计
             * SY : 1
             * GXSJ : 2019-10-30 04:00:00
             * LY : 0
             * MHK : 0
             * BS : 0
             * YJ : 2
             * TH : 0
             * CBS : 0
             * GZL : 0
             * ID : b4295b0394554e4e89d41f7f89b16dd1
             * SP : 1
             * HEJI : 7
             */

            private String CC;
            private String BC;
            private String JL;
            private String FENLEI;
            private String SY;
            private String GXSJ;
            private String LY;
            private String MHK;
            private String BS;
            private String YJ;
            private String TH;
            private String CBS;
            private String GZL;
            private String ID;
            private String SP;
            private String HEJI;

            public String getCC() {
                return CC;
            }

            public void setCC(String CC) {
                this.CC = CC;
            }

            public String getBC() {
                return BC;
            }

            public void setBC(String BC) {
                this.BC = BC;
            }

            public String getJL() {
                return JL;
            }

            public void setJL(String JL) {
                this.JL = JL;
            }

            public String getFENLEI() {
                return FENLEI;
            }

            public void setFENLEI(String FENLEI) {
                this.FENLEI = FENLEI;
            }

            public String getSY() {
                return SY;
            }

            public void setSY(String SY) {
                this.SY = SY;
            }

            public String getGXSJ() {
                return GXSJ;
            }

            public void setGXSJ(String GXSJ) {
                this.GXSJ = GXSJ;
            }

            public String getLY() {
                return LY;
            }

            public void setLY(String LY) {
                this.LY = LY;
            }

            public String getMHK() {
                return MHK;
            }

            public void setMHK(String MHK) {
                this.MHK = MHK;
            }

            public String getBS() {
                return BS;
            }

            public void setBS(String BS) {
                this.BS = BS;
            }

            public String getYJ() {
                return YJ;
            }

            public void setYJ(String YJ) {
                this.YJ = YJ;
            }

            public String getTH() {
                return TH;
            }

            public void setTH(String TH) {
                this.TH = TH;
            }

            public String getCBS() {
                return CBS;
            }

            public void setCBS(String CBS) {
                this.CBS = CBS;
            }

            public String getGZL() {
                return GZL;
            }

            public void setGZL(String GZL) {
                this.GZL = GZL;
            }

            public String getID() {
                return ID;
            }

            public void setID(String ID) {
                this.ID = ID;
            }

            public String getSP() {
                return SP;
            }

            public void setSP(String SP) {
                this.SP = SP;
            }

            public String getHEJI() {
                return HEJI;
            }

            public void setHEJI(String HEJI) {
                this.HEJI = HEJI;
            }
        }
    }
}
