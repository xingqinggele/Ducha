package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/17 17:02.
 */
public class JYzaitaobean
{

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"TPSJ":"Sep 11, 2019 12:00:00 AM","XM":"姚红升","GMSFHM":"220183198706102214"},{"TPSJ":"Jul 9, 2019 12:00:00 AM","XM":"李春梅","GMSFHM":"220881196707200947"},{"TPSJ":"Dec 14, 2018 12:00:00 AM","XM":"钟树生","GMSFHM":"22012219621017751X"},{"TPSJ":"Jan 23, 2017 12:00:00 AM","XM":"黄淑芹","GMSFHM":"220381197103064240"}]}
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
             * TPSJ : Sep 11, 2019 12:00:00 AM
             * XM : 姚红升
             * GMSFHM : 220183198706102214
             */

            private String TPSJ;
            private String XM;
            private String GMSFHM;

            public String getTPSJ() {
                return TPSJ;
            }

            public void setTPSJ(String TPSJ) {
                this.TPSJ = TPSJ;
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
        }
    }
}
