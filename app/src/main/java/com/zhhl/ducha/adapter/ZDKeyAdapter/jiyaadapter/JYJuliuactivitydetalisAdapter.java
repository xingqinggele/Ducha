package com.zhhl.ducha.adapter.ZDKeyAdapter.jiyaadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.zhhl.ducha.R;
import com.zhhl.ducha.bean.JYJuliuDeteilsbean;
import com.zhhl.ducha.bean.JYZaitaoDeteilsbean;

import java.util.List;

/**
 * Created by qgl on 2019/9/11 9:03.
 */
public class JYJuliuactivitydetalisAdapter extends BaseAdapter
{
    List<JYJuliuDeteilsbean.AttributesBean.ZdrListBean> apk_list;
    LayoutInflater inflater;
    private Context context;
    private int selectorPosition;

    public JYJuliuactivitydetalisAdapter(Context context, List<JYJuliuDeteilsbean.AttributesBean.ZdrListBean> apk_list)
    {
        this.apk_list = apk_list;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }




    public void onDateChange(List<JYJuliuDeteilsbean.AttributesBean.ZdrListBean> apk_list)
    {
        this.apk_list = apk_list;
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return apk_list.size();
    }

    @Override
    public Object getItem(int position)
    {
        // TODO Auto-generated method stub
        return apk_list.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        // TODO Auto-generated method stub
        final JYJuliuDeteilsbean.AttributesBean.ZdrListBean entity = apk_list.get(position);
        ViewHolder holder;
        if (convertView == null)
        {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.keyper_details_list_item, null);
            holder.detalis_diqu = convertView.findViewById(R.id.detalis_diqu);
            holder.detalis_guankongyuan = convertView.findViewById(R.id.detalis_guankongyuan);
            holder.detalis_guanlijibie = convertView.findViewById(R.id.detalis_guanlijibie);
            holder.detalis_zhuangtai = convertView.findViewById(R.id.detalis_zhuangtai);
            holder.detalis_dengji_time = convertView.findViewById(R.id.detalis_dengji_time);
            holder.detalis_dengji_danwei = convertView.findViewById(R.id.detalis_dengji_danwei);
            holder.detalis_data_laiyuan = convertView.findViewById(R.id.detalis_data_laiyuan);
            holder.detalis_caozuodanwei = convertView.findViewById(R.id.detalis_caozuodanwei);
            holder.detalis_gengxin_time = convertView.findViewById(R.id.detalis_gengxin_time);
            holder.detalis_chexiao_time = convertView.findViewById(R.id.detalis_chexiao_time);
            holder.detalis_shexiao_person = convertView.findViewById(R.id.detalis_shexiao_person);
            holder.detalis_jingzhong_person = convertView.findViewById(R.id.detalis_jingzhong_person);
            holder.detalis_jingzhong_person_number = convertView.findViewById(R.id.detalis_jingzhong_person_number);
            holder.detalis_wenkong_jingyuan = convertView.findViewById(R.id.detalis_wenkong_jingyuan);
            holder.detalis_pcs_jingzhong_person_number = convertView.findViewById(R.id.detalis_pcs_jingzhong_person_number);
            holder.detalis_wenkong_jingyuan_phone = convertView.findViewById(R.id.detalis_wenkong_jingyuan_phone);
            holder.detalis_wenkong_jingyuan_time = convertView.findViewById(R.id.detalis_wenkong_jingyuan_time);
            holder.detalis_chexiao_jingyuan = convertView.findViewById(R.id.detalis_chexiao_jingyuan);
            holder.detalis_wenkong_jibie = convertView.findViewById(R.id.detalis_wenkong_jibie);
            holder.detalis_huji_adress = convertView.findViewById(R.id.detalis_huji_adress);
            holder.detalis_pcs_name = convertView.findViewById(R.id.detalis_pcs_name);
            holder.detalis_juzhu_adress = convertView.findViewById(R.id.detalis_juzhu_adress);
            holder.detalis_juzhu_adress_pcs = convertView.findViewById(R.id.detalis_juzhu_adress_pcs);
            holder.detalis_jingzhong_danwei_name = convertView.findViewById(R.id.detalis_jingzhong_danwei_name);
            holder.detalis_guanli_pcs_name = convertView.findViewById(R.id.detalis_guanli_pcs_name);
            holder.detalis_chexiao_danwei_name = convertView.findViewById(R.id.detalis_chexiao_danwei_name);
            holder.detalis_wenkong_context = convertView.findViewById(R.id.detalis_wenkong_context);

            holder.keyper_details_toggbtn = convertView.findViewById(R.id.keyper_details_toggbtn);
            holder.de_t4 = convertView.findViewById(R.id.de_t4);
            holder.view4 = convertView.findViewById(R.id.view4);
            holder.tt5 = convertView.findViewById(R.id.tt5);
            holder.de_t5 = convertView.findViewById(R.id.de_t5);
            holder.tt6 = convertView.findViewById(R.id.tt6);
            holder.view5 = convertView.findViewById(R.id.view5);
            holder.de_t6 = convertView.findViewById(R.id.de_t6);
            holder.tt7 = convertView.findViewById(R.id.tt7);
            holder.view6 = convertView.findViewById(R.id.view6);
            holder.de_t7 = convertView.findViewById(R.id.de_t7);
            holder.tt8 = convertView.findViewById(R.id.tt8);
            holder.view7 = convertView.findViewById(R.id.view7);
            holder.de_t8 = convertView.findViewById(R.id.de_t8);
            holder.tt9 = convertView.findViewById(R.id.tt9);
            holder.view8 = convertView.findViewById(R.id.view8);
            holder.de_t9 = convertView.findViewById(R.id.de_t9);
            holder.view9 = convertView.findViewById(R.id.view9);
            holder.de_t10 = convertView.findViewById(R.id.de_t10);
            holder.view10 = convertView.findViewById(R.id.view10);
            holder.de_t11 = convertView.findViewById(R.id.de_t11);
            holder.view11 = convertView.findViewById(R.id.view11);
            holder.de_t12 = convertView.findViewById(R.id.de_t12);
            holder.view12 = convertView.findViewById(R.id.view12);
            holder.de_t13 = convertView.findViewById(R.id.de_t13);
            holder.view13 = convertView.findViewById(R.id.view13);
            holder.de_t14 = convertView.findViewById(R.id.de_t14);
            holder.view14 = convertView.findViewById(R.id.view14);
            holder.de_t15 = convertView.findViewById(R.id.de_t15);
            holder.view15 = convertView.findViewById(R.id.view15);
            holder.de_t16 = convertView.findViewById(R.id.de_t16);
            holder.view16 = convertView.findViewById(R.id.view16);
            holder.de_t17 = convertView.findViewById(R.id.de_t17);
            holder.view17 = convertView.findViewById(R.id.view17);
            holder.de_t18 = convertView.findViewById(R.id.de_t18);
            holder.view18 = convertView.findViewById(R.id.view18);
            holder.de_t19 = convertView.findViewById(R.id.de_t19);
            holder.view19 = convertView.findViewById(R.id.view19);

            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
//        holder.detalis_diqu.setText(entity.getName());
        holder.detalis_guankongyuan.setText(entity.getPCSWKRXM());
        //        管理级别
        if (entity.getGLJB().equals("C"))
        {
            holder.detalis_guanlijibie.setText("普通级");
        }
        else if (entity.getGLJB().equals("B"))
        {
            holder.detalis_guanlijibie.setText("重点级");
        }
        else if (entity.getGLJB().equals("A"))
        {
            holder.detalis_guanlijibie.setText("特殊级");
        }
//        状态
        if (entity.getZT().equals("0"))
        {
            holder.detalis_zhuangtai.setText("有效");
        }
        else if (entity.getGLJB().equals("1"))
        {
            holder.detalis_zhuangtai.setText("注销");
        }
        else if (entity.getGLJB().equals("9"))
        {
            holder.detalis_zhuangtai.setText("审批");

        }
        holder.detalis_dengji_time.setText(entity.getDJSJ());
        holder.detalis_dengji_danwei.setText(entity.getDJDWMC());
        if (entity.getSJLY().equals("0"))
        {
            holder.detalis_data_laiyuan.setText("警种录入");
        }
        holder.detalis_caozuodanwei.setText(entity.getCZDWMC());
//        holder.detalis_caozuodanwei.setText("");
        holder.detalis_gengxin_time.setText(entity.getGXSJ());
//        holder.detalis_chexiao_time.setText(entity.getCXSJ());
        holder.detalis_chexiao_time.setText("");
//        holder.detalis_shexiao_person.setText(entity.getCXRXM());
        holder.detalis_shexiao_person.setText("");
        holder.detalis_jingzhong_person.setText(entity.getJZMC());
        holder.detalis_jingzhong_person_number.setText(entity.getJZWKRJH());
        holder.detalis_wenkong_jingyuan.setText(entity.getJZWKRXM());
        holder.detalis_pcs_jingzhong_person_number.setText(entity.getPCSWKRJH());
        holder.detalis_wenkong_jingyuan_phone.setText(entity.getJZWKRDH());
//        holder.detalis_wenkong_jingyuan_time.setText(entity.getPCSWKRBDSJ());
        holder.detalis_wenkong_jingyuan_time.setText("");
//        holder.detalis_chexiao_jingyuan.setText(entity.getCXRJH());
        holder.detalis_chexiao_jingyuan.setText("");
        holder.detalis_wenkong_jibie.setText(entity.getWKJBMC());
        holder.detalis_huji_adress.setText(entity.getHJDZXZ());
        holder.detalis_pcs_name.setText(entity.getHJDPCSMC());
        holder.detalis_juzhu_adress.setText(entity.getSJJZDZXZ());
        holder.detalis_juzhu_adress_pcs.setText(entity.getSJJZDPCSMC());
//        holder.detalis_juzhu_adress_pcs.setText("");
        holder.detalis_jingzhong_danwei_name.setText(entity.getJZGAJGJGMC());
        holder.detalis_guanli_pcs_name.setText(entity.getPCSJGMC());
//        holder.detalis_chexiao_danwei_name.setText(entity.getCXJGMC());
        holder.detalis_chexiao_danwei_name.setText("");
        holder.detalis_wenkong_context.setText(entity.getZYWT());
//        点击收缩按钮
        holder.keyper_details_toggbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    holder.de_t4.setVisibility(View.VISIBLE);
                    holder.detalis_data_laiyuan.setVisibility(View.VISIBLE);
                    holder.view4.setVisibility(View.VISIBLE);
                    holder.tt5.setVisibility(View.VISIBLE);
                    holder.detalis_caozuodanwei.setVisibility(View.VISIBLE);
                    holder.de_t5.setVisibility(View.VISIBLE);
                    holder.detalis_gengxin_time.setVisibility(View.VISIBLE);
                    holder.tt6.setVisibility(View.VISIBLE);
                    holder.detalis_chexiao_time.setVisibility(View.VISIBLE);
                    holder.view5.setVisibility(View.VISIBLE);
                    holder.de_t6.setVisibility(View.VISIBLE);
                    holder.detalis_shexiao_person.setVisibility(View.VISIBLE);
                    holder.tt7.setVisibility(View.VISIBLE);
                    holder.detalis_jingzhong_person.setVisibility(View.VISIBLE);
                    holder.view6.setVisibility(View.VISIBLE);
                    holder.de_t7.setVisibility(View.VISIBLE);
                    holder.detalis_wenkong_jibie.setVisibility(View.VISIBLE);
                    holder.tt8.setVisibility(View.VISIBLE);
                    holder.detalis_jingzhong_person_number.setVisibility(View.VISIBLE);
                    holder.view7.setVisibility(View.VISIBLE);
                    holder.de_t8.setVisibility(View.VISIBLE);
                    holder.detalis_wenkong_jingyuan.setVisibility(View.VISIBLE);
                    holder.tt9.setVisibility(View.VISIBLE);
                    holder.detalis_pcs_jingzhong_person_number.setVisibility(View.VISIBLE);
                    holder.view8.setVisibility(View.VISIBLE);
                    holder.de_t9.setVisibility(View.VISIBLE);
                    holder.detalis_wenkong_jingyuan_phone.setVisibility(View.VISIBLE);
                    holder.view9.setVisibility(View.VISIBLE);
                    holder.de_t10.setVisibility(View.VISIBLE);
                    holder.detalis_wenkong_jingyuan_time.setVisibility(View.VISIBLE);
                    holder.view10.setVisibility(View.VISIBLE);
                    holder.de_t11.setVisibility(View.VISIBLE);
                    holder.detalis_chexiao_jingyuan.setVisibility(View.VISIBLE);
                    holder.view11.setVisibility(View.VISIBLE);
                    holder.de_t12.setVisibility(View.VISIBLE);
                    holder.detalis_huji_adress.setVisibility(View.VISIBLE);
                    holder.view12.setVisibility(View.VISIBLE);
                    holder.de_t13.setVisibility(View.VISIBLE);
                    holder.detalis_pcs_name.setVisibility(View.VISIBLE);
                    holder.view13.setVisibility(View.VISIBLE);
                    holder.de_t14.setVisibility(View.VISIBLE);
                    holder.detalis_juzhu_adress.setVisibility(View.VISIBLE);
                    holder.view14.setVisibility(View.VISIBLE);
                    holder.de_t15.setVisibility(View.VISIBLE);
                    holder.detalis_juzhu_adress_pcs.setVisibility(View.VISIBLE);
                    holder.view15.setVisibility(View.VISIBLE);
                    holder.de_t16.setVisibility(View.VISIBLE);
                    holder.detalis_jingzhong_danwei_name.setVisibility(View.VISIBLE);
                    holder.view16.setVisibility(View.VISIBLE);
                    holder.de_t17.setVisibility(View.VISIBLE);
                    holder.detalis_guanli_pcs_name.setVisibility(View.VISIBLE);
                    holder.view17.setVisibility(View.VISIBLE);
                    holder.de_t18.setVisibility(View.VISIBLE);
                    holder.detalis_chexiao_danwei_name.setVisibility(View.VISIBLE);
                    holder.view18.setVisibility(View.VISIBLE);
                    holder.de_t19.setVisibility(View.VISIBLE);
                    holder.detalis_wenkong_context.setVisibility(View.VISIBLE);
                    holder.view19.setVisibility(View.VISIBLE);
                }
                else
                {
                    holder.de_t4.setVisibility(View.GONE);
                    holder.detalis_data_laiyuan.setVisibility(View.GONE);
                    holder.view4.setVisibility(View.GONE);
                    holder.tt5.setVisibility(View.GONE);
                    holder.detalis_caozuodanwei.setVisibility(View.GONE);
                    holder.de_t5.setVisibility(View.GONE);
                    holder.detalis_gengxin_time.setVisibility(View.GONE);
                    holder.tt6.setVisibility(View.GONE);
                    holder.detalis_chexiao_time.setVisibility(View.GONE);
                    holder.view5.setVisibility(View.GONE);
                    holder.de_t6.setVisibility(View.GONE);
                    holder.detalis_shexiao_person.setVisibility(View.GONE);
                    holder.tt7.setVisibility(View.GONE);
                    holder.detalis_jingzhong_person.setVisibility(View.GONE);
                    holder.view6.setVisibility(View.GONE);
                    holder.de_t7.setVisibility(View.GONE);
                    holder.detalis_wenkong_jibie.setVisibility(View.GONE);
                    holder.tt8.setVisibility(View.GONE);
                    holder.detalis_jingzhong_person_number.setVisibility(View.GONE);
                    holder.view7.setVisibility(View.GONE);
                    holder.de_t8.setVisibility(View.GONE);
                    holder.detalis_wenkong_jingyuan.setVisibility(View.GONE);
                    holder.tt9.setVisibility(View.GONE);
                    holder.detalis_pcs_jingzhong_person_number.setVisibility(View.GONE);
                    holder.view8.setVisibility(View.GONE);
                    holder.de_t9.setVisibility(View.GONE);
                    holder.detalis_wenkong_jingyuan_phone.setVisibility(View.GONE);
                    holder.view9.setVisibility(View.GONE);
                    holder.de_t10.setVisibility(View.GONE);
                    holder.detalis_wenkong_jingyuan_time.setVisibility(View.GONE);
                    holder.view10.setVisibility(View.GONE);
                    holder.de_t11.setVisibility(View.GONE);
                    holder.detalis_chexiao_jingyuan.setVisibility(View.GONE);
                    holder.view11.setVisibility(View.GONE);
                    holder.de_t12.setVisibility(View.GONE);
                    holder.detalis_huji_adress.setVisibility(View.GONE);
                    holder.view12.setVisibility(View.GONE);
                    holder.de_t13.setVisibility(View.GONE);
                    holder.detalis_pcs_name.setVisibility(View.GONE);
                    holder.view13.setVisibility(View.GONE);
                    holder.de_t14.setVisibility(View.GONE);
                    holder.detalis_juzhu_adress.setVisibility(View.GONE);
                    holder.view14.setVisibility(View.GONE);
                    holder.de_t15.setVisibility(View.GONE);
                    holder.detalis_juzhu_adress_pcs.setVisibility(View.GONE);
                    holder.view15.setVisibility(View.GONE);
                    holder.de_t16.setVisibility(View.GONE);
                    holder.detalis_jingzhong_danwei_name.setVisibility(View.GONE);
                    holder.view16.setVisibility(View.GONE);
                    holder.de_t17.setVisibility(View.GONE);
                    holder.detalis_guanli_pcs_name.setVisibility(View.GONE);
                    holder.view17.setVisibility(View.GONE);
                    holder.de_t18.setVisibility(View.GONE);
                    holder.detalis_chexiao_danwei_name.setVisibility(View.GONE);
                    holder.view18.setVisibility(View.GONE);
                    holder.de_t19.setVisibility(View.GONE);
                    holder.detalis_wenkong_context.setVisibility(View.GONE);
                    holder.view19.setVisibility(View.GONE);

                }
            }
        });
        return convertView;
    }

    class ViewHolder
    {
        TextView detalis_diqu;
        TextView detalis_guankongyuan;
        TextView detalis_guanlijibie;
        TextView detalis_zhuangtai;
        TextView detalis_dengji_time;
        TextView detalis_dengji_danwei;
        TextView detalis_data_laiyuan;
        TextView detalis_caozuodanwei;
        TextView detalis_gengxin_time;
        TextView detalis_chexiao_time;
        TextView detalis_shexiao_person;
        TextView detalis_jingzhong_person;
        TextView detalis_jingzhong_person_number;
        TextView detalis_wenkong_jingyuan;
        TextView detalis_pcs_jingzhong_person_number;
        TextView detalis_wenkong_jingyuan_phone;
        TextView detalis_wenkong_jingyuan_time;
        TextView detalis_chexiao_jingyuan;
        TextView detalis_wenkong_jibie;
        TextView detalis_huji_adress;
        TextView detalis_pcs_name;
        TextView detalis_juzhu_adress;
        TextView detalis_juzhu_adress_pcs;
        TextView detalis_jingzhong_danwei_name;
        TextView detalis_guanli_pcs_name;
        TextView detalis_chexiao_danwei_name;
        TextView detalis_wenkong_context;


        ToggleButton keyper_details_toggbtn;
        TextView  de_t4;
        TextView  view4;
        TextView  tt5;
        TextView  de_t5;
        TextView  tt6;
        TextView  view5;
        TextView  de_t6;
        TextView  tt7;
        TextView  view6;
        TextView  de_t7;
        TextView  tt8;
        TextView  view7;
        TextView  de_t8;
        TextView  tt9;
        TextView  view8;
        TextView  de_t9;
        TextView  view9;
        TextView  de_t10;
        TextView  view10;
        TextView  de_t11;
        TextView  view11;
        TextView  de_t12;
        TextView  view12;
        TextView  de_t13;
        TextView  view13;
        TextView  de_t14;
        TextView  view14;
        TextView  de_t15;
        TextView  view15;
        TextView  de_t16;
        TextView  view16;
        TextView  de_t17;
        TextView  view17;
        TextView  de_t18;
        TextView  view18;
        TextView  de_t19;
        TextView  view19;


    }

    public void addListView(JYJuliuDeteilsbean.AttributesBean.ZdrListBean pBean)
    {
        apk_list.add(pBean);

    }

    public void changeState(int pos)
    {
        selectorPosition = pos;
        notifyDataSetChanged();
    }





}
