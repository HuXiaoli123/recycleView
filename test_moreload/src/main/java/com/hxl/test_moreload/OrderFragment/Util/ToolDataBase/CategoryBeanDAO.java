package com.hxl.test_moreload.OrderFragment.Util.ToolDataBase;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.hxl.test_moreload.CategoryBean;

import java.util.ArrayList;

public class CategoryBeanDAO {
    DBHelper dbHelper=null;
    public CategoryBeanDAO(DBHelper dbHelper){
        this.dbHelper=dbHelper;
    }
    /*
        插入一条数据
     */
    public void insertDB(CategoryBean listInfo){
        ContentValues cv=new ContentValues();


       // cv.put("_id",null);
        cv.put("timer",listInfo.getOrderNumber());
        cv.put("content",listInfo.getOderType());
        cv.put("timer",listInfo.getItemPrice());
        cv.put("content",listInfo.getPlatformDeduction());
        cv.put("timer",listInfo.getUserPlay());
        cv.put("content",listInfo.getStoreEntry());
        cv.put("content",listInfo.getPlayTime());

        SQLiteDatabase writeDB=dbHelper.getWritableDatabase();
        writeDB.insert(DBHelper.LISTINFO_TABLE_NAME,null,cv);
        Log.i("insertDB","insertDB"+writeDB);
        writeDB.close();
    }
    /*
        删除一条数据
     */
    public void deletDB(CategoryBean listInfo){
        String whereCaluse="where _id=";
        String whereArgs[]=new String[]{String.valueOf(listInfo.get_id())};
        SQLiteDatabase writeDB=dbHelper.getWritableDatabase();
        writeDB.delete(DBHelper.LISTINFO_TABLE_NAME,whereCaluse,whereArgs);
        writeDB.close();
    }
    /*
        修改一条数据
     */
    public void updateDB(CategoryBean listInfo){
        ContentValues cv =new ContentValues();
        cv.put("timer",listInfo.getOrderNumber());
        cv.put("content",listInfo.getOderType());
        String whereCaluse="where _id=";
        String whereArgs[]=new String[]{String.valueOf(listInfo.get_id())};
        SQLiteDatabase writeDB=dbHelper.getWritableDatabase();
        writeDB.update(DBHelper.DATABASE_NAME,cv,whereCaluse,whereArgs);
        writeDB.close();
    }
    /*
        查询
     */
    public ArrayList queryDB(){
        Log.i("My_queryDB","My_queryDB");
        ArrayList<CategoryBean> arrayList=new ArrayList<>();
        Log.i("queryDB1","queryDB1");
        SQLiteDatabase readDB=dbHelper.getReadableDatabase();
        Cursor results=readDB.query(DBHelper.LISTINFO_TABLE_NAME,new String[]{"_id","timer","content"},null,null,null,null,null);
        Log.i("queryDB2","queryDB2");
        for(results.moveToFirst();!results.isAfterLast();results.moveToNext()){
            CategoryBean listInfo=new CategoryBean();
            listInfo.set_id(results.getInt(0));
            listInfo.setOrderNumber(results.getString(1));
            listInfo.setOderType(results.getString(2));
            arrayList.add(listInfo);
        }
        return arrayList;
    }
}
