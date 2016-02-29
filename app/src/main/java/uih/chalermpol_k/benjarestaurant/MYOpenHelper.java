package uih.chalermpol_k.benjarestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chalermpol on 29-Feb-16.
 */
public class MYOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String database_name ="benja.db";
    private static final int database_version =1;
    private static final String create_table_user = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text, " +
            "Passwrod text, " +
            "Name text, );";
    private static final String create_table_food = "create table foodTABLE (" +
            "_id integer primary key," +
            "Food text," +
            "Price text," +
            "Source text);";

    public MYOpenHelper(Context context) {
        super(context, database_name,null,database_version);


    }   //Contructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_table_food);
        db.execSQL(create_table_user);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   // Main Class
