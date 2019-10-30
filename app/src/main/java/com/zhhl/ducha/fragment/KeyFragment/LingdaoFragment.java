package com.zhhl.ducha.fragment.KeyFragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson.JSON;
import com.example.toollibrary.okhttp.exception.OkHttpException;
import com.example.toollibrary.okhttp.listener.DisposeDataListener;
import com.example.toollibrary.okhttp.request.RequestParams;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;
import com.zhhl.ducha.R;
import com.zhhl.ducha.adapter.ZDKeyAdapter.lieguanadpter.Keypersonadpter;
import com.zhhl.ducha.bean.Homebean;
import com.zhhl.ducha.uri.RequestCenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by qgl on 2019/9/16 9:59.
 */
public class LingdaoFragment extends Fragment implements PullLoadMoreRecyclerView.PullLoadMoreListener {

    @BindView(R.id.sp2)
    Spinner sp2;
    @BindView(R.id.list_size)
    TextView listSize;
    @BindView(R.id.one_listview)
    PullLoadMoreRecyclerView oneListview;
    @BindView(R.id.edit_name)
    EditText editName;
    @BindView(R.id.edit_idcard)
    EditText editIdcard;
    @BindView(R.id.lingdao_btn)
    TextView lingdaoBtn;
    private String ed_name = "";
    private String ed_idcrad = "";
    private String sp_area = "";
    private View view;
    private Unbinder unbinder;
    private List<String> data_list_quyu;
    private ArrayAdapter<String> arr_adapter_quyu;
    private RecyclerView mRecyclerView;
    private Keypersonadpter one_case_adapter;
    private Homebean homebean;
    private List<Homebean.AttributesBean.VarListBean> varListBeans = new ArrayList<>();
    ProgressDialog progressDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.lingdaofragment, container, false);
        unbinder = ButterKnife.bind(this, view);
        spinner();
        initList();
        return view;
    }

    //    下拉列表
    private void spinner() {
        data_list_quyu = new ArrayList<String>();
        data_list_quyu.add("请选择区市");
        data_list_quyu.add("长春");
        data_list_quyu.add("吉林");
        data_list_quyu.add("四平");
        data_list_quyu.add("公主岭");
        data_list_quyu.add("辽源");
        data_list_quyu.add("通化");
        data_list_quyu.add("梅河口");
        data_list_quyu.add("白山");
        data_list_quyu.add("松原");
        data_list_quyu.add("白城");
        data_list_quyu.add("延边朝鲜族自治州");
        data_list_quyu.add("长白山");
        //适配器
        arr_adapter_quyu = new ArrayAdapter<String>(getActivity(), R.layout.adapter_mytopactionbar_spinner, data_list_quyu);
        //设置样式
        arr_adapter_quyu.setDropDownViewResource(R.layout.adapter_mytopactionbar_spinner);
        sp2.setAdapter(arr_adapter_quyu);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (data_list_quyu.get(position).equals("请选择区市")) {
                    sp_area = "";
                } else {
                    sp_area = data_list_quyu.get(position);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initList() {
        //获取mRecyclerView对象
        mRecyclerView = oneListview.getRecyclerView();
        //代码设置scrollbar无效？未解决！
        mRecyclerView.setVerticalScrollBarEnabled(true);
        //设置下拉刷新是否可见
        //mPullLoadMoreRecyclerView.setRefreshing(true);
        //设置是否可以下拉刷新
        //mPullLoadMoreRecyclerView.setPullRefreshEnable(true);
        //设置是否可以上拉刷新
        oneListview.setPushRefreshEnable(false);
        //显示下拉刷新
        oneListview.setRefreshing(false);
        //设置上拉刷新文字
        oneListview.setFooterViewText("loading");
        //设置上拉刷新文字颜色
        //mPullLoadMoreRecyclerView.setFooterViewTextColor(R.color.white);
        //设置加载更多背景色
        //mPullLoadMoreRecyclerView.setFooterViewBackgroundColor(R.color.colorBackground);
        oneListview.setLinearLayout();
        oneListview.setOnPullLoadMoreListener(this);
        one_case_adapter = new Keypersonadpter(getActivity());
        oneListview.setAdapter(one_case_adapter);
        if (progressDialog == null)
            progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("正在请求，请稍后...");
        progressDialog.setCancelable(false);
        progressDialog.show();
        getdata();
    }

    private void getdata() {
        ed_name = editName.getText().toString().trim();
        ed_idcrad = editIdcard.getText().toString().trim();
        //网络请求
        RequestParams params = new RequestParams();
        params.put("sfzh", ed_idcrad);
        params.put("name", ed_name);
        params.put("area", sp_area);
        Log.e("领导交办提交的数据", ed_idcrad + ed_name + sp_area + "123");
        RequestCenter.request_Qishi1(params, new DisposeDataListener() {
            @Override
            public void onSuccess(Object o) {
                progressDialog.dismiss();
                Log.e("领导交办返回数据", o.toString());
                final String aa = o.toString();
                oneListview.setRefreshing(false);
                homebean = JSON.parseObject(aa, Homebean.class);
                varListBeans = homebean.getAttributes().getVarList();
                one_case_adapter.addAllData(varListBeans);
                oneListview.setPullLoadMoreCompleted();
                listSize.setText("查询数量：" + varListBeans.size() + "条");
            }

            @Override
            public void onFailure(OkHttpException e) {
                progressDialog.dismiss();
                Log.e("失败", e.getEmsg() + "");
            }

        });


    }

    @Override
    public void onRefresh() {
        Log.e("wxl", "onRefresh");
        setRefresh();
        getdata();
    }

    @Override
    public void onLoadMore() {
        Log.e("wxl", "onLoadMore");
    }

    private void setRefresh() {
        one_case_adapter.clearData();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @OnClick(R.id.lingdao_btn)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.lingdao_btn:
                initList();
                break;
        }
    }
}
