package fannyu.didyouworkout20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class add_reminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reminder);


    }


    public void postReminder(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
