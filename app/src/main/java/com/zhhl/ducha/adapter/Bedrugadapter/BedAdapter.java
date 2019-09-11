package com.zhhl.ducha.adapter.Bedrugadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhhl.ducha.R;
import com.zhhl.ducha.activity.BedrugActivity.BedActivitydetails;
import com.zhhl.ducha.bean.Detabean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by qgl on 2019/9/11 13:41.
 */
public class BedAdapter extends RecyclerView.Adapter<BedAdapter.ViewHolder> {
    private Context mContext;
    private List<Detabean> dataList = new ArrayList<>();


    public void addAllData(List<Detabean> dataList) {
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void clearData() {
        this.dataList.clear();
    }

    public BedAdapter(Context context) {
        mContext = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView)
        {
            super(itemView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bedactivity_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent intent=new Intent(mContext, BedActivitydetails.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


}
