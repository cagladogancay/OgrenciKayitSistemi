package cagladogancay.com.ogrencikayitsistemi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {
List<FriendsListView> mFriendsListViewList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        initialize();
    }

    private void initialize() {
        mFriendsListViewList=new ArrayList<>();
        mFriendsListViewList.add(new FriendsListView("Elif Demir","@elifdemir",true));
        mFriendsListViewList.add(new FriendsListView("Hakan Aydın","@hakanaydin",false ));
        mFriendsListViewList.add(new FriendsListView("Büşra Kanat","@busrakanat",true));
        ListView listView=findViewById(R.id.lv_fri);
        final FriendsAdapter adapter = new FriendsAdapter(FriendsActivity.this, mFriendsListViewList);
        listView.setAdapter(adapter);
        Button btn_addFriend= findViewById(R.id.btn_AddFri);
        btn_addFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et_username=findViewById(R.id.et_friUser);
                EditText et_name=findViewById(R.id.et_fri);
                mFriendsListViewList.add(new FriendsListView(et_name.getText().toString(),et_username.getText().toString(),true));
                adapter.notifyDataSetChanged();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent friendIntent= new Intent(FriendsActivity.this,ProfilActivity.class);
                startActivity(friendIntent);
            }
        });

    }
}
