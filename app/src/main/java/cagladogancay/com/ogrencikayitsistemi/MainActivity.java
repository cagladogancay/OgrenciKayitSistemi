package cagladogancay.com.ogrencikayitsistemi;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {

        Button profile = findViewById(R.id.btn_profile);
        profile.setOnClickListener(this);
        Button friends = findViewById(R.id.btn_friends);
        friends.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_profile:
                intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_friends:
                intent = new Intent(MainActivity.this, FriendsActivity.class);
                startActivity(intent);
                break;

        }
    }
}

