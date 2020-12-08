package mx.edu.utng.recycleviewgds0241;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyOpenHelper extends SQLiteOpenHelper {
    private static final String REST_TABLE_CREATE="CREATE TABLE restaurante (nombre TEXT PRIMARY KEY ,"+"photo TEXT, valoracion REAL, direccion TEXT)";
    private static final String DB_NAME="restdb.sqlite";
    private static final int DB_VERSION=1;


    public MyOpenHelper( Context context ) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(REST_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
