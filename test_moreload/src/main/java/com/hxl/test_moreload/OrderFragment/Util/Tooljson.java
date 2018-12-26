package com.hxl.test_moreload.OrderFragment.Util;

import android.widget.ImageView;
import android.widget.LinearLayout;

import com.hxl.test_moreload.CategoryBean;
import com.hxl.test_moreload.R;

import java.util.ArrayList;
import java.util.List;

public class Tooljson {


    public static    List<CategoryBean> JsonParse( )
    {
        /*
        1.请求数据
        2.拿服务器的数据进行事件比较，看是否有新数据过来
        3.将数据保存到本地的数据库（如果数据过多，看是否需要放在其他的table）
        myCategoryBean-----接收过来的json字符串----然后传递到 CategoryBean类中
         */
         List<CategoryBean> mCategoryBean = new ArrayList<>();
        CategoryBean myCategoryBean=new CategoryBean("1234567","商城订单","29","2.6","26.4","29","12-11/14:27");

        List<CategoryBean> oderdatalist=new ArrayList<CategoryBean>() ;
        oderdatalist.add(myCategoryBean);
            for (int i = 0; i <3; i++) {

                CategoryBean orderGood = new CategoryBean();
                orderGood.setOrderNumber(oderdatalist.get(0).getOrderNumber());
                orderGood.setOderType(oderdatalist.get(0).getOderType());
                orderGood.setItemPrice(oderdatalist.get(0).getItemPrice());
                orderGood.setPlatformDeduction(oderdatalist.get(0).getPlatformDeduction());
                orderGood.setUserPlay(oderdatalist.get(0).getUserPlay());
                orderGood.setStoreEntry(oderdatalist.get(0).getStoreEntry());
                orderGood.setPlayTime(oderdatalist.get(0).getPlayTime());
                if (i == 99) orderGood.setPlayTime("2018--12--15");
                // orderGoodses.add(orderGood);
                mCategoryBean.add(orderGood);
            }


        return mCategoryBean;

    }



    void getData()
    {

    }



}
