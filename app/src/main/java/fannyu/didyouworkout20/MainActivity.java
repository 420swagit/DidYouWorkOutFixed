package fannyu.didyouworkout20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onAdd(View view)
    {
        EditText name = (EditText)findViewById(R.id.inputName);
        String nameString = name.getText().toString();
        EditText quantity = (EditText)findViewById(R.id.inputQuantity);
        String quantityString = quantity.getText().toString();
        
    }
}
