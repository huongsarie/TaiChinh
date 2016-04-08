package com.sarie.taichinh.common;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by huongsarie on 05/04/2016.
 */
public class DatabaseManager {
    private static final String DATA_PATH = Environment.getDataDirectory()
            + "/data/com.sarie.taichinh/databases/";
    private static final String DATA_FILE = "taichinhcanhan.sqlite";
    private Context context;
    private SQLiteDatabase sqlData;
    private String sql;
    private ArrayList<String> arrNameAccount;

    public DatabaseManager(Context context) {
        super();
        this.context = context;
        copyFileOn();
    }

    private void copyFileOn() {
        new File(DATA_PATH).mkdir();
        File fileOn = new File(DATA_PATH + DATA_FILE);
//        if (fileOn.exists()) {
//            return;
//        }
        try {
            fileOn.createNewFile();
            AssetManager asset = context.getAssets();
            if (asset == null) {
                Log.i("Error asses", "null");
                return;
            }
            InputStream fileIn = asset.open(DATA_FILE);
            FileOutputStream fileOut = new FileOutputStream(fileOn);
            byte b[] = new byte[1024];
            int len = -1;
            while ((len = fileIn.read(b)) > 0) {
                fileOut.write(b);
            }
            fileIn.close();
            fileOut.close();
        } catch (Exception ex) {
            Log.e("Database_Error copy: ", ex.getMessage());
        }

    }

    void openDatabase() {
        if (sqlData == null || sqlData.isOpen() == false) {
            sqlData = SQLiteDatabase.openDatabase(DATA_PATH + DATA_FILE, null,
                    SQLiteDatabase.OPEN_READWRITE);
        }
    }

    public void closeDatabase() {
        if (sqlData != null || sqlData.isOpen() == true) {
            sqlData.close();
        }
    }

    public boolean insertData(String tableName, ContentValues values) {
        // thêm vào bảng tableName bộ giá trị values
        openDatabase();
        boolean kt;
        long t = sqlData.insert(tableName, null, values);
        if (t != -1) {
            Toast.makeText(context, "Thêm thành công!", Toast.LENGTH_SHORT)
                    .show();
            Log.v("Them", "ThanhCong!");
            kt = true;
        } else {
            Toast.makeText(context, "Thêm KHÔNG thành công!",
                    Toast.LENGTH_SHORT).show();
            Log.v("Them", "KHONG ThanhCong!");
            kt = false;
        }
        closeDatabase();
        return kt;
    }

    public boolean updateData(String tableName, ContentValues values,
                              String whereClause, String[] whereArg) {
        openDatabase();
        boolean kt;
        Log.i("updateData", "Cập nhật dữ liệu!");
        long index = sqlData.update(tableName, values, whereClause, whereArg);
        if (index != 0) {
            Toast.makeText(context, "Cập nhật thành công!", Toast.LENGTH_SHORT)
                    .show();
            kt = true;
        } else {
            Toast.makeText(context, "Cập nhật KHÔNG thành công!",
                    Toast.LENGTH_SHORT).show();
            kt = false;
        }
        closeDatabase();
        return kt;
    }

    public boolean deleteData(String tableName, String id) {
        return sqlData.delete(tableName, "Ma = '" + id + "'", null) > 0;

    }
}
