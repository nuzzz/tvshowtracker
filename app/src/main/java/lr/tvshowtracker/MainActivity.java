package lr.tvshowtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize_UI();
    }

    public void initialize_UI(){

        Button loginButton = (Button) findViewById(R.id.loginButton);
        TextView user = (TextView) findViewById(R.id.userInput);
        TextView pass = (TextView) findViewById(R.id.passInput);

        TextView registerText =  (TextView) findViewById(R.id.registerText);
    }

    public void changeToRegisterPage(View v){

        Intent myIntent = null;
        myIntent = new Intent(v.getContext() ,RegisterActivity.class);
        startActivity(myIntent);
    }
}
