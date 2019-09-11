package com.zhhl.ducha.adapter.ZDKeyAdapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.recyclerview.widget.RecyclerView;

import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.ZDActivity.KeypersonnelActivityDetalis;
import com.zhhl.ducha.bean.Detabean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qgl on 2019/9/11 9:03.
 */
public class KeyperdetalisAdapter extends RecyclerView.Adapter<KeyperdetalisAdapter.ViewHolder>
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

    public KeyperdetalisAdapter(Context context) {
        mContext = context;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView de_t4;
        public TextView detalis_id_number;
        public TextView view3;
        public ToggleButton keyper_details_toggbtn;
        public ViewHolder(View itemView)
        {
            super(itemView);
            keyper_details_toggbtn = (ToggleButton) itemView.findViewById(R.id.keyper_details_toggbtn);
            de_t4 = (TextView) itemView.findViewById(R.id.de_t4);
            detalis_id_number = (TextView) itemView.findViewById(R.id.detalis_id_number);
            view3 = (TextView) itemView.findViewById(R.id.view3);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.keyper_details_list_item, parent, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position)
    {
//        holder.title.setText(dataList.get(position).getNoticeTitle());
//        holder.tv_content.setText(dataList.get(position).getNoticeContent());
//        点击收缩按钮
       holder.keyper_details_toggbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
           {
               if (isChecked)
               {
                   holder.de_t4.setVisibility(View.VISIBLE);
                   holder.detalis_id_number.setVisibility(View.VISIBLE);
                   holder.view3.setVisibility(View.VISIBLE);
               }
               else
               {
                   holder.de_t4.setVisibility(View.GONE);
                   holder.detalis_id_number.setVisibility(View.GONE);
                   holder.view3.setVisibility(View.GONE);
               }
           }
       });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
