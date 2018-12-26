package com.hxl.test_moreload.OrderFragment.Util.ToolDataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="mygetuitest01_DB";
    public static final String LISTINFO_TABLE_NAME="listinfo_table";
    public static final int VERSION=1;
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public DBHelper(Context context){
        this(context,DATABASE_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        Log.d("sql__onCreate","-----------创建表："+LISTINFO_TABLE_NAME);

        String sql="create table "+LISTINFO_TABLE_NAME+"(_id integer primary key AUTOINCREMENT,"+"timer date not null,"+
                "content text not null)" ;
        Log.d("sql__","-----------创建表："+LISTINFO_TABLE_NAME);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql="drop table if exists "+DATABASE_NAME;
        db.execSQL(sql);
        Log.d("sql__","-----------更新数据库："+LISTINFO_TABLE_NAME);
        this.onCreate(db);
    }
}
