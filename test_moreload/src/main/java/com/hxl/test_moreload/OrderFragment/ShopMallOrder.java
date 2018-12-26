package com.hxl.test_moreload.OrderFragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.hxl.test_moreload.CategoryAdapter;
import com.hxl.test_moreload.CategoryBean;
import com.hxl.test_moreload.DividerItemDecoration;
import com.hxl.test_moreload.MainActivity;
import com.hxl.test_moreload.R;

import java.util.ArrayList;
import java.util.List;

public class ShopMallOrder  extends BaseFragment {


    //初始化特有数据
    public  ShopMallOrder()
    {
        pageLayout= R.layout.sweep_code_layout3;


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mCategoryAdapter=new CategoryAdapter(true,false);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
