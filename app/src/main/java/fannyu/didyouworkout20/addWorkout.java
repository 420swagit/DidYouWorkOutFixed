package fannyu.didyouworkout20;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addWorkout extends AppCompatActivity {

    private Button homeButton = null;
    EditText WorkoutName, WorkoutQuantity;
    Context context;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_workout);

        homeButton = (Button)findViewById(R.id.previous);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MainActivity.class);
                startActivity(i);
            }
        });
        WorkoutName = (EditText)findViewById(R.id.workoutname);
        WorkoutQuantity = (EditText)findViewById(R.id.workoutquantity);

    }

    public void addWorkout(View view)
    {
        String name = WorkoutName.getText().toString();
        String quantity = WorkoutQuantity.getText().toString();
        userDbHelper = new UserDbHelper(context);
        sqLiteDatabase = userDbHelper.getWritableDatabase();
        userDbHelper.addInformation(name, quantity, sqLiteDatabase);
        Toast.makeText(getBaseContext(),"Data saved",Toast.LENGTH_LONG).show();
        userDbHelper.close();
    }
}
