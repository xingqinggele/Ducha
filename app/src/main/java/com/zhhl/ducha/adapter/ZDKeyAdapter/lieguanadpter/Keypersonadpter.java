package com.zhhl.ducha.adapter.ZDKeyAdapter.lieguanadpter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.ZDActivity.lieguanactivity.LingdaoActivityDetalis;
import com.zhhl.ducha.bean.Homebean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by czy on 2019/8/20 9:14.
 */
public class Keypersonadpter extends RecyclerView.Adapter<Keypersonadpter.ViewHolder>
{
    private Context mContext;
    private List<Homebean.AttributesBean.VarListBean> dataList = new ArrayList<>();


    public void addAllData(List<Homebean.AttributesBean.VarListBean> dataList) {
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void clearData() {
        this.dataList.clear();
    }

    public Keypersonadpter(Context context) {
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

                Intent intent=new Intent(mContext, LingdaoActivityDetalis.class);
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
