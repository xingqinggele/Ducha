package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/17 16:55.
 */
public class JYDeadbean
{

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"SWRQ":"20190912","XM":"方娟","GMSFHM":"220124197101033506"},{"SWRQ":"20190909","XM":"杨凤兰","GMSFHM":"220104194511161325"},{"SWRQ":"20190904","XM":"肖先俊","GMSFHM":"222303195106028214"},{"SWRQ":"20190903","XM":"王怀","GMSFHM":"220121195708074736"},{"SWRQ":"20190829","XM":"逄焕全","GMSFHM":"220105194109111019"},{"SWRQ":"20190825","XM":"胡国际","GMSFHM":"220105195501221639"},{"SWRQ":"20190824","XM":"吕文华","GMSFHM":"220124195510280015"},{"SWRQ":"20190821","XM":"梁文革","GMSFHM":"220104196901216511"},{"SWRQ":"20190819","XM":"张秀芳","GMSFHM":"220322194910278583"},{"SWRQ":"20190817","XM":"张新富","GMSFHM":"222423196410154413"},{"SWRQ":"20190815","XM":"李新谷","GMSFHM":"220105195008121618"},{"SWRQ":"20190815","XM":"郭淑兰","GMSFHM":"220124195310121626"},{"SWRQ":"20190809","XM":"王连波","GMSFHM":"220105195207061419"},{"SWRQ":"20190805","XM":"朱世全","GMSFHM":"220111193412163615"},{"SWRQ":"20190803","XM":"万泽锋","GMSFHM":"220281196611210515"},{"SWRQ":"20190802","XM":"曲艳兰","GMSFHM":"220111196509233628"},{"SWRQ":"20190730","XM":"范顺凤","GMSFHM":"220124194407105644"},{"SWRQ":"20190728","XM":"刘库","GMSFHM":"222303194106282437"},{"SWRQ":"20190727","XM":"马玉发","GMSFHM":"222303194809036216"},{"SWRQ":"20190720","XM":"丁秀杰","GMSFHM":"220422196402180023"},{"SWRQ":"20190717","XM":"刘玉广","GMSFHM":"220202195606124815"},{"SWRQ":"20190716","XM":"孟广海","GMSFHM":"220621194609181037"},{"SWRQ":"20190711","XM":"李柏利","GMSFHM":"220104197403016538"},{"SWRQ":"20190709","XM":"吕明文","GMSFHM":"222301196601120052"},{"SWRQ":"20190706","XM":"杨丽洁","GMSFHM":"220112196206100648"},{"SWRQ":"20190630","XM":"曹宝昌","GMSFHM":"22010219491029021X"},{"SWRQ":"20190623","XM":"朱春梅","GMSFHM":"22062219640229008X"},{"SWRQ":"20190616","XM":"林君贵","GMSFHM":"220621195708170733"},{"SWRQ":"20190614","XM":"刘帮荣","GMSFHM":"220203196801240927"},{"SWRQ":"20190608","XM":"任秀芬","GMSFHM":"220123194404200922"},{"SWRQ":"20190607","XM":"苗春龙","GMSFHM":"220105196208131217"},{"SWRQ":"20190602","XM":"张孝义","GMSFHM":"220602194405022414"},{"SWRQ":"20190531","XM":"鲍际才","GMSFHM":"220125194111184212"},{"SWRQ":"20190529","XM":"赵玉山","GMSFHM":"220111196807111215"},{"SWRQ":"20190527","XM":"魏连国","GMSFHM":"220124195103274232"},{"SWRQ":"20190525","XM":"范永贵","GMSFHM":"220105195001252615"},{"SWRQ":"20190522","XM":"苗玉财","GMSFHM":"220623197404170015"},{"SWRQ":"20190517","XM":"姜洪发","GMSFHM":"220103194302074114"},{"SWRQ":"20190512","XM":"贾占荣","GMSFHM":"220102193702264223"},{"SWRQ":"20190508","XM":"任长有","GMSFHM":"220122196704035319"},{"SWRQ":"20190507","XM":"高清义","GMSFHM":"220124195109200234"},{"SWRQ":"20190430","XM":"窦权","GMSFHM":"220324196401222911"},{"SWRQ":"20190430","XM":"庞少元","GMSFHM":"229005194809270013"},{"SWRQ":"20190421","XM":"李殿敏","GMSFHM":"220103195503281210"},{"SWRQ":"20190416","XM":"李丛有","GMSFHM":"220402196802185610"},{"SWRQ":"20190413","XM":"朱贵山","GMSFHM":"220104196206096511"},{"SWRQ":"20190408","XM":"孙平均","GMSFHM":"220122195205200012"},{"SWRQ":"20190406","XM":"王显山","GMSFHM":"220602194811210912"},{"SWRQ":"20190325","XM":"刘云君","GMSFHM":"220121195801067012"},{"SWRQ":"20190325","XM":"杨官振","GMSFHM":"220621194707183415"},{"SWRQ":"20190320","XM":"马景龙","GMSFHM":"22010219580918103X"},{"SWRQ":"20190317","XM":"王运维","GMSFHM":"220122196603202210"},{"SWRQ":"20190308","XM":"王秀英","GMSFHM":"220103194611050626"},{"SWRQ":"20190306","XM":"郑俊安","GMSFHM":"220181195902066015"},{"SWRQ":"20190228","XM":"郑美花","GMSFHM":"220623195803190321"},{"SWRQ":"20190224","XM":"王大永","GMSFHM":"22012119700926197X"},{"SWRQ":"20190222","XM":"白凤春","GMSFHM":"220123195101294110"},{"SWRQ":"20190218","XM":"满淑兰","GMSFHM":"220105194804211628"}]}
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
             * SWRQ : 20190912
             * XM : 方娟
             * GMSFHM : 220124197101033506
             */

            private String SWRQ;
            private String XM;
            private String GMSFHM;

            public String getSWRQ() {
                return SWRQ;
            }

            public void setSWRQ(String SWRQ) {
                this.SWRQ = SWRQ;
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
