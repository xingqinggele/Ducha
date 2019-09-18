package com.zhhl.ducha.bean;

/**
 * Created by qgl on 2019/9/18 9:55.
 */
public class ZDtablenianbean
{

    /**
     * success : true
     * msg : 已查到所要数据
     * attributes : {"allCount":{"cc":124,"mhk":1,"bs":18,"bc":2,"yj":1,"jl":15,"th":7,"cbs":"0","sy":12,"gzl":4,"sp":20,"ly":10}}
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
        /**
         * allCount : {"cc":124,"mhk":1,"bs":18,"bc":2,"yj":1,"jl":15,"th":7,"cbs":"0","sy":12,"gzl":4,"sp":20,"ly":10}
         */

        private AllCountBean allCount;

        public AllCountBean getAllCount() {
            return allCount;
        }

        public void setAllCount(AllCountBean allCount) {
            this.allCount = allCount;
        }

        public static class AllCountBean {
            /**
             * cc : 124
             * mhk : 1
             * bs : 18
             * bc : 2
             * yj : 1
             * jl : 15
             * th : 7
             * cbs : 0
             * sy : 12
             * gzl : 4
             * sp : 20
             * ly : 10
             */

            private int cc;
            private int mhk;
            private int bs;
            private int bc;
            private int yj;
            private int jl;
            private int th;
            private String cbs;
            private int sy;
            private int gzl;
            private int sp;
            private int ly;

            public int getCc() {
                return cc;
            }

            public void setCc(int cc) {
                this.cc = cc;
            }

            public int getMhk() {
                return mhk;
            }

            public void setMhk(int mhk) {
                this.mhk = mhk;
            }

            public int getBs() {
                return bs;
            }

            public void setBs(int bs) {
                this.bs = bs;
            }

            public int getBc() {
                return bc;
            }

            public void setBc(int bc) {
                this.bc = bc;
            }

            public int getYj() {
                return yj;
            }

            public void setYj(int yj) {
                this.yj = yj;
            }

            public int getJl() {
                return jl;
            }

            public void setJl(int jl) {
                this.jl = jl;
            }

            public int getTh() {
                return th;
            }

            public void setTh(int th) {
                this.th = th;
            }

            public String getCbs() {
                return cbs;
            }

            public void setCbs(String cbs) {
                this.cbs = cbs;
            }

            public int getSy() {
                return sy;
            }

            public void setSy(int sy) {
                this.sy = sy;
            }

            public int getGzl() {
                return gzl;
            }

            public void setGzl(int gzl) {
                this.gzl = gzl;
            }

            public int getSp() {
                return sp;
            }

            public void setSp(int sp) {
                this.sp = sp;
            }

            public int getLy() {
                return ly;
            }

            public void setLy(int ly) {
                this.ly = ly;
            }
        }
    }
}
