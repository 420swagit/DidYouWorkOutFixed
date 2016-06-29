package fannyu.didyouworkout20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class add_reminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reminder);
        exerciseName = (EditText)findViewById(R.id.inputName);
        exerciseQuantity = (EditText)findViewById(R.id.inputQuantity);
    }

    //get the text
    EditText exerciseName;
    EditText exerciseQuantity;

    public void onAdd()
    {
        
    }
}
