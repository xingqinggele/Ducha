package com.zhhl.ducha.bean;

import java.util.List;

/**
 * Created by qgl on 2019/9/17 10:18.
 */
public class ZDyinianbean
{

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"varList":[{"HJDMC":"吉林省集安市","ZZDMC":"吉林省长春市南关区","XM":"李仁琴","GMSFHM":"220522195609180021","QHNXXDZ":"吉林省集安市团结街西盛委七组"},{"HJDMC":"吉林省乾安县","ZZDMC":"吉林省长春市南关区","XM":"赵洪亮","GMSFHM":"222328197208090234","QHNXXDZ":"吉林省乾安县大布苏镇2委"},{"HJDMC":"吉林省抚松县","ZZDMC":"吉林省长春市南关区","XM":"陈俊良","GMSFHM":"220621197904160056","QHNXXDZ":"吉林省抚松县抚松镇城南街松山委三组"},{"HJDMC":"吉林省抚松县","ZZDMC":"吉林省长春市南关区","XM":"刘书宏","GMSFHM":"220621198611230043","QHNXXDZ":"吉林省抚松县抚松镇城内街四委三十五组"},{"HJDMC":"吉林省伊通满族自治县","ZZDMC":"吉林省长春市南关区","XM":"葛阳","GMSFHM":"220381198108020890","QHNXXDZ":"吉林省伊通满族自治县三道乡西李村八组"},{"HJDMC":"吉林省伊通满族自治县","ZZDMC":"吉林省长春市南关区","XM":"吕彦青","GMSFHM":"220323197306032413","QHNXXDZ":"吉林省伊通满族自治县福宁街道福宁三委七组"},{"HJDMC":"吉林省四平市铁东区","ZZDMC":"吉林省长春市南关区","XM":"徐柏华","GMSFHM":"220303196308142421","QHNXXDZ":"吉林省四平市铁东区四平市铁东区四马路街晓东委六组"},{"HJDMC":"吉林省蛟河市","ZZDMC":"吉林省长春市南关区","XM":"赵丽平","GMSFHM":"220281197006023863","QHNXXDZ":"吉林省蛟河市庆岭镇杨木沟村梨山沟屯"},{"HJDMC":"吉林省农安县","ZZDMC":"吉林省长春市南关区","XM":"韩加涛","GMSFHM":"220202197703023337","QHNXXDZ":"吉林省农安县农安镇德彪街五委51组"},{"HJDMC":"吉林省双辽市","ZZDMC":"吉林省长春市南关区","XM":"全桂华","GMSFHM":"220324195003070620","QHNXXDZ":"吉林省双辽市郑家屯街新华委二组"},{"HJDMC":"吉林省四平市铁西区","ZZDMC":"吉林省长春市南关区","XM":"孙长林","GMSFHM":"220302195606220634","QHNXXDZ":"吉林省四平市铁西区四平市铁西区地直街九间委三组"},{"HJDMC":"吉林省图们市","ZZDMC":"吉林省长春市南关区","XM":"刘崇宇","GMSFHM":"222402199304270818","QHNXXDZ":"吉林省图们市月晴镇曲水村七组"},{"HJDMC":"吉林省伊通满族自治县","ZZDMC":"吉林省长春市南关区","XM":"赵雪","GMSFHM":"220323197807010028","QHNXXDZ":"吉林省伊通满族自治县福安街道福安九委一组"},{"HJDMC":"吉林省舒兰市","ZZDMC":"吉林省长春市南关区","XM":"唐伟","GMSFHM":"220283199109273111","QHNXXDZ":"吉林省舒兰市白旗镇白旗村六社"},{"HJDMC":"吉林省图们市","ZZDMC":"吉林省长春市南关区","XM":"马莉晶","GMSFHM":"222424199309165927","QHNXXDZ":"吉林省汪清县百草沟镇牡丹川村二组"},{"HJDMC":"吉林省长岭县","ZZDMC":"吉林省长春市南关区","XM":"陈文术","GMSFHM":"220722195304161218","QHNXXDZ":"吉林省长岭县太平山镇南太平山村沙井子屯"},{"HJDMC":"吉林省公主岭市","ZZDMC":"吉林省长春市南关区","XM":"郐洋洋","GMSFHM":"220381199004305626","QHNXXDZ":"吉林省公主岭市怀德镇民兴村一组"},{"HJDMC":"吉林省永吉县","ZZDMC":"吉林省长春市南关区","XM":"赵喜","GMSFHM":"220221198002296512","QHNXXDZ":"吉林省永吉县一拉溪镇莲花村三社"},{"HJDMC":"吉林省吉林市昌邑区","ZZDMC":"吉林省长春市南关区","XM":"刘卫星","GMSFHM":"220211197004291515","QHNXXDZ":"吉林省吉林市昌邑区九站街道建设村一组"},{"HJDMC":"吉林省德惠市","ZZDMC":"吉林省长春市南关区","XM":"付玉闯","GMSFHM":"220183198407075236","QHNXXDZ":"吉林省德惠市五台乡卢家村孙家屯2组"},{"HJDMC":"吉林省农安县","ZZDMC":"吉林省长春市南关区","XM":"李春霞","GMSFHM":"220104198008180623","QHNXXDZ":"吉林省农安县农安镇德彪街一委1组"}]}
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
             * HJDMC : 吉林省集安市
             * ZZDMC : 吉林省长春市南关区
             * XM : 李仁琴
             * GMSFHM : 220522195609180021
             * QHNXXDZ : 吉林省集安市团结街西盛委七组
             */

            private String HJDMC;
            private String ZZDMC;
            private String XM;
            private String GMSFHM;
            private String QHNXXDZ;

            public String getHJDMC() {
                return HJDMC;
            }

            public void setHJDMC(String HJDMC) {
                this.HJDMC = HJDMC;
            }

            public String getZZDMC() {
                return ZZDMC;
            }

            public void setZZDMC(String ZZDMC) {
                this.ZZDMC = ZZDMC;
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

            public String getQHNXXDZ() {
                return QHNXXDZ;
            }

            public void setQHNXXDZ(String QHNXXDZ) {
                this.QHNXXDZ = QHNXXDZ;
            }
        }
    }
}
