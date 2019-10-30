package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/10/30 15:55.
 */
public class ZhongDianActivitybean
{

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"XM":"韩天泽","GMSFHM":"220381197912250211"},{"XM":"张雅玲","GMSFHM":"220502196307141026"}]}
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
             * XM : 韩天泽
             * GMSFHM : 220381197912250211
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
