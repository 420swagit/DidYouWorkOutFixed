package fannyu.didyouworkout20;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fanny on 7/11/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "starbuzz";
    private static final int DB_VERSION = 1;

    DatabaseHelper(Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }



    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE WORKOUT (_id INTEGER PRIMARY KEY AUTOINCREMENT"
        + "NAME TEXT, "
        + "QUANTITY TEXT);");

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    private static void insertWorkout(SQLiteDatabase db, String name, String quantity, int resourceId)
    {
        ContentValues workoutValues = new ContentValues();
        workoutValues.put("NAME", name);
        workoutValues.put("QUANTITY", quantity);
        db.insert("WORKOUT", null, workoutValues);
    }

}
