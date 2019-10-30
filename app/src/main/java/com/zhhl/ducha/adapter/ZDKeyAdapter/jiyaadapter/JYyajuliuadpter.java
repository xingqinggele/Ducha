package com.zhhl.ducha.adapter.ZDKeyAdapter.jiyaadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.ZDActivity.jiyaactivity.JYJuliuActivityDeteils;
import com.zhhl.ducha.activity.ZDActivity.jiyaactivity.JYdetaActivityDeteils;
import com.zhhl.ducha.bean.JYDeadbean;
import com.zhhl.ducha.bean.JYJuliubean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by czy on 2019/8/20 9:14.
 */
public class JYyajuliuadpter extends RecyclerView.Adapter<JYyajuliuadpter.ViewHolder>
{
    private Context mContext;
    private List<JYJuliubean.AttributesBean.VarListBean> dataList = new ArrayList<>();


    public void addAllData(List<JYJuliubean.AttributesBean.VarListBean> dataList) {
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void clearData() {
        this.dataList.clear();
    }

    public JYyajuliuadpter(Context context) {
        mContext = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView key_name;
        public TextView key_idnumber;
        public TextView key_state;
        public ViewHolder(View itemView)
        {
            super(itemView);
            key_name = itemView.findViewById(R.id.name);
            key_idnumber= itemView.findViewById(R.id.idnumber);
            key_state= itemView.findViewById(R.id.state);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.keyper_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.key_name.setText(dataList.get(position).getXM());
        holder.key_idnumber.setText(dataList.get(position).getGMSFHM());

        holder.key_state.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent intent=new Intent(mContext, JYJuliuActivityDeteils.class);
                intent.putExtra("Idcard",dataList.get(position).getGMSFHM());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }



}
