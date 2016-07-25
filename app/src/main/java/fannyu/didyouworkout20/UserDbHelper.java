package fannyu.didyouworkout20;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by fanny on 7/25/2016.
 */
public class UserDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "USERINFO.DB";
    private static final int DATABASE_VERSIONS = 1;
    private static final String CREATE_QUERY =
            "CREATE TABLE "+ UserWorkout.NewUserInfo.TABLE_NAME+ "("+ UserWorkout.NewUserInfo.USER_NAME+" TEXT,"+
                    UserWorkout.NewUserInfo.USER_QUANTITY+" TEXT);";


    public UserDbHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSIONS);
        Log.e("DATABASE OPERATIONS", "Database created/opened...");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
        Log.e("DATABASE OPERATIONS", "Table created...");
    }

    public void addInformation(String name, String quantity, SQLiteDatabase db)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserWorkout.NewUserInfo.USER_NAME, name);
        contentValues.put(UserWorkout.NewUserInfo.USER_QUANTITY, quantity);
        db.insert(UserWorkout.NewUserInfo.TABLE_NAME, null, contentValues);
        Log.e("DATABASE OPERATIONS", "One row insert...");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
