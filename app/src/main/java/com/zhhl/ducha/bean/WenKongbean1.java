package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/10/30 14:29.
 */
public class WenKongbean1 {

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"XM":"金德生","GMSFHM":"220122196503104015"},{"XM":"李东海","GMSFHM":"220502196108281210"},{"XM":"杨毓丹","GMSFHM":"220211198101290324"}]}
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
             * XM : 金德生
             * GMSFHM : 220122196503104015
             */

            private String XM;
            private String GMSFHM;

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
        }
    }
}
