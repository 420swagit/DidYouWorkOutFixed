package fannyu.didyouworkout20;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by fanny on 7/24/2016.
 */
public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "USERINFO.DB";
    public static final int DATABASE_VERSION = 1;
    private static final String CREATE_QUERY =
            "CREATE TABLE "+
                    UserWorkout.NewUserInfo.TABLE_NAME+"(" +
                    UserWorkout.NewUserInfo.WORKOUT_NAME + " TEXT, " +
                    UserWorkout.NewUserInfo.WORKOUT_QUANTITY+" TEXT);";

    public DbHelper(Context context)
    {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
            Log.e("DATABASE OPERATIONS", "Database created / opened...");
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
        Log.e("DATABASE OPERATIONS", "Table created...");
    }

    public void addInformation(String name, String quantity, SQLiteDatabase db)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserWorkout.NewUserInfo.WORKOUT_NAME,name);
        contentValues.put(UserWorkout.NewUserInfo.WORKOUT_QUANTITY,quantity);
        db.insert(UserWorkout.NewUserInfo.TABLE_NAME, null, contentValues);
        Log.e("DATABASE OPERATIONS", "One row inserted...");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
