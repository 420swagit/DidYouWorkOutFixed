package fannyu.didyouworkout20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class add_reminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reminder);

    }

    //get the text


    public void postReminder(View view)
    {
        Intent intent = new Intent(this,post_reminder.class);
        startActivity(intent);
    }
}
