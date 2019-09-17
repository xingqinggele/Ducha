package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/16 9:11.
 */
public class Homebean
{
    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"XM":"付大奇","GMSFHM":"220104195504083132","ZDR":"220104195504083132","ROW_ID":1},{"XM":"刘淑珍","GMSFHM":"220322196310096822","ZDR":"220322196310096822","ROW_ID":2},{"XM":"朱朝忠","GMSFHM":"22232419600529603X","ZDR":"22232419600529603X","ROW_ID":3},{"XM":"李志伟","GMSFHM":"220104196111058010","ZDR":"220104196111058010","ROW_ID":4},{"XM":"赵利春","GMSFHM":"220102196903311229","ZDR":"220102196903311229","ROW_ID":5},{"XM":"闫春凤","GMSFHM":"22240619691214282X","ZDR":"22240619691214282X","ROW_ID":6},{"XM":"高云莲","GMSFHM":"222405196606263248","ZDR":"222405196606263248","ROW_ID":7}]}
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
             * XM : 付大奇
             * GMSFHM : 220104195504083132
             * ZDR : 220104195504083132
             * ROW_ID : 1
             */

            private String XM;
            private String GMSFHM;
            private String ZDR;
            private int ROW_ID;

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

            public String getZDR() {
                return ZDR;
            }

            public void setZDR(String ZDR) {
                this.ZDR = ZDR;
            }

            public int getROW_ID() {
                return ROW_ID;
            }

            public void setROW_ID(int ROW_ID) {
                this.ROW_ID = ROW_ID;
            }
        }
    }
}
