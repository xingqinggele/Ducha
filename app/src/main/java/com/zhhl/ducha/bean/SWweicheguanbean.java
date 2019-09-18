package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/17 16:17.
 */
public class SWweicheguanbean
{

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"SWRQ":"20190809","GMSFHM":"220105195207061419","XM":"王连波","XBDM":"1","ZT":"0"},{"SWRQ":"20190805","GMSFHM":"220111193412163615","XM":"朱世全","XBDM":"1","ZT":"0"}]}
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
             * SWRQ : 20190809
             * GMSFHM : 220105195207061419
             * XM : 王连波
             * XBDM : 1
             * ZT : 0
             */

            private String SWRQ;
            private String GMSFHM;
            private String XM;
            private String XBDM;
            private String ZT;

            public String getSWRQ() {
                return SWRQ;
            }

            public void setSWRQ(String SWRQ) {
                this.SWRQ = SWRQ;
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

            public String getXBDM() {
                return XBDM;
            }

            public void setXBDM(String XBDM) {
                this.XBDM = XBDM;
            }

            public String getZT() {
                return ZT;
            }

            public void setZT(String ZT) {
                this.ZT = ZT;
            }
        }
    }
}
