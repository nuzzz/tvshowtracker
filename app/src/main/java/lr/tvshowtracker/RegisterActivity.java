package lr.tvshowtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by linus on 22/10/2015.
 */
public class RegisterActivity extends AppCompatActivity{

    TextView errorText;
    EditText username;
    EditText password;
    EditText password2;
    String user, pass1, pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_user);

        //initialise UI
        initializeUI();

        //TODO: not finished yet
        //username.addTextChangedListener(new TextWatcher());
        //password.addTextChangedListener(new TextWatcher());
        //password2.addTextChangedListener(new TextWatcher());
    }

    private void initializeUI() {
//        errorText = (EditText) findViewById(R.id.username);
//        username = (EditText) findViewById(R.id.username);
//        password = (EditText) findViewById(R.id.password1);
//        password2 = (EditText) findViewById(R.id.password2);
    }


    private void validateUser(EditText username, String user) {

    }

    private void validatePass(String pass, String pass2) {
    }



}