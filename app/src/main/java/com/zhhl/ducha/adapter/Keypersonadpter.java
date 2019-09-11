package com.zhhl.ducha.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.ZDActivity.KeypersonnelActivityDetalis;
import com.zhhl.ducha.bean.Detabean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by czy on 2019/8/20 9:14.
 */
public class Keypersonadpter extends RecyclerView.Adapter<Keypersonadpter.ViewHolder>
{
    private Context mContext;
    private List<Detabean> dataList = new ArrayList<>();


    public void addAllData(List<Detabean> dataList) {
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
        public TextView one_case_acti_list_context;
        public TextView one_case_acti_list_number;
        public TextView one_case_acti_list_name;
        public TextView one_case_acti_list_addres;
        public TextView one_case_acti_list_time;
        public ViewHolder(View itemView)
        {
            super(itemView);
//            one_case_acti_list_context = (TextView) itemView.findViewById(R.id.one_case_acti_list_context);
//            one_case_acti_list_number= (TextView) itemView.findViewById(R.id.one_case_acti_list_number);
//            one_case_acti_list_name = (TextView) itemView.findViewById(R.id.one_case_acti_list_name);
//            one_case_acti_list_addres= (TextView) itemView.findViewById(R.id.one_case_acti_list_addres);
//            one_case_acti_list_time= (TextView) itemView.findViewById(R.id.one_case_acti_list_time);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.keyper_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
//        holder.title.setText(dataList.get(position).getNoticeTitle());
//        holder.tv_content.setText(dataList.get(position).getNoticeContent());
//        holder.tv_time.setText(dataList.get(position).getCreateTime());
//        holder.tv_author.setText("发布人："+dataList.get(position).getCreateBy());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent intent=new Intent(mContext, KeypersonnelActivityDetalis.class);
                //intent.putExtra("noticeId",dataList.get(position).getId());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }



}
