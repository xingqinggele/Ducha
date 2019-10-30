package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/10/30 15:27.
 */
public class WenKongbean2 {

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[]}
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
        private List<?> varList;

        public List<?> getVarList() {
            return varList;
        }

        public void setVarList(List<?> varList) {
            this.varList = varList;
        }
    }
}
