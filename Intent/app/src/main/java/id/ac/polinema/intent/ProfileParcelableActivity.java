package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ProfileParcelableActivity extends AppCompatActivity {

    private EditText usernameInput ;
    private EditText nameInput  ;
    private EditText ageInput ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
        // TODO: bind here

        Bundle extras = getIntent().getExtras();

        if (extras != null) {

            User u = extras.getParcelable("user") ;

            // TODO: display value here
        }
    }
}
