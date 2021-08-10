package com.example.navdrawer.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class ThuChiSqliteHelper extends SQLiteOpenHelper {

    String create_table_thu_chi = "Sv tự viết";
    String create_table_loai_thu_chi = "Sv tự viết";

    public ThuChiSqliteHelper(Context context) {
        super(context, "sql.db", null, 1);
    }
    // thu chi - Sv tự viết
    // lấy danh sách
    // thêm
    // sửa
    // xóa
    // cập nhật


    // loại thu chi - Sv Tự viết
    // lấy danh sách
    // thêm
    // sửa
    // xóa
    // cập nhật

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_table_loai_thu_chi);
        db.execSQL(create_table_thu_chi);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
