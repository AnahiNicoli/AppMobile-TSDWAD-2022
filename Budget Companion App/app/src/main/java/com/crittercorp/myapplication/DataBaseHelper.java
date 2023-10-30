package com.crittercorp.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;



public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String TIPO_USUARIO = "TIPO_USUARIO";
    public static final String T_TUSUARIO = "T_TUSUARIO";
    public static final String T_DNI = "T_DNI";
    public static final String T_PROV = "T_PROV";
    public static final String T_CIUDAD = "T_CIUDAD";
    public static final String T_NOMBREYAPE = "T_NOMBREYAPE";
    public static final String T_TELEFONO = "T_TELEFONO";
    public static final String T_EMAIL_VARCHAR = "T_EMAIL VARCHAR";
    public static final String T_DOMICILIO = "T_DOMICILIO";
    public static final String T_WEB = "T_WEB";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "budgetCompany.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreate = "CREATE TABLE " + TIPO_USUARIO + " (T_TUSUARIO_ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " + T_TUSUARIO + " BOOLEAN, " + T_DNI + " VARCHAR," +
                " " + T_PROV + " VARCHAR, " + T_CIUDAD + " VARCHAR, " + T_NOMBREYAPE + " VARCHAR, " + T_TELEFONO + " INTEGER , " + T_EMAIL_VARCHAR + " , " + T_DOMICILIO + " VARCHAR, " + T_WEB + " VARCHAR )";
        db.execSQL(createTableStatement);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean addOne(CustomerModel customerModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(T_NOMBREYAPE, customerModel.getNombreYapellido());
        cv.put(T_DOMICILIO, customerModel.getDomicilio());
        cv.put(T_DNI, customerModel.getDni());
        cv.put(T_CIUDAD, customerModel.getCiudad());
        cv.put(T_TELEFONO, customerModel.getTelefono());

        long insert = db.insert(TIPO_USUARIO, null, cv);
        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }
}



