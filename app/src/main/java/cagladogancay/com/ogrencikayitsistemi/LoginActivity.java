package cagladogancay.com.ogrencikayitsistemi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cagladogancay.com.ogrencikayitsistemi.MainActivity;
import cagladogancay.com.ogrencikayitsistemi.R;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initialize();
    }

    private void initialize() {
        final EditText username = findViewById(R.id.et_username);
        final EditText password=findViewById(R.id.et_password);
        Button login= findViewById(R.id.et_btn_enter);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( username.getText().toString().equals("cagla")&& password.getText().toString().equals("1234")){

                    Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
//                  loginIntent.putExtra("send_user",username.getText()+" "+ password.getText());
                    startActivity(loginIntent);

                }
                username.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        final EditText username = findViewById(R.id.et_username);
                        String user=username.getText().toString();
                        Intent userIntent=new Intent(LoginActivity.this,ProfilActivity.class);
                        userIntent.putExtra("user",user);
                        startActivity(userIntent);
                        return false;
                    }
                });
//

//                }


            }
        });
    }
}

