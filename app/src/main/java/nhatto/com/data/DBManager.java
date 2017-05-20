package nhatto.com.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User name on 18/05/2017.
 */

public class DBManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "students_manager";
    private static final String TABLE_NAME = "students";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String ADDRESS = "address";
    private static final String PHONE_NUMBER = "phone";
    private static final String EMAIL = "email";
    private static final int VERSION = 1;

    private String SQLQuery = "CREATE_TABLE" + TABLE_NAME + " (" +
            ID + " integer primary key, " +
            NAME + " text, " +
            PHONE_NUMBER + " text, " +
            ADDRESS + " text, " +
            EMAIL + " text)";


    public DBManager(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQLQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
