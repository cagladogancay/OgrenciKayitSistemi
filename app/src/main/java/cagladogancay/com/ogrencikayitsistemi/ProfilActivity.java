package cagladogancay.com.ogrencikayitsistemi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProfilActivity extends AppCompatActivity {
    List<LessonListView> arrayList;
    private static final int IMAGE_ACTION_CODE = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        initialize();
    }

    private void initialize() {

        arrayList = new ArrayList<>();
        arrayList.add(new LessonListView("Mat 101"));
        arrayList.add(new LessonListView("Mat 102"));
        arrayList.add(new LessonListView("Bil 101"));
        arrayList.add(new LessonListView("Come 107"));
        arrayList.add(new LessonListView("Come 342"));

        ListView lessonListView = findViewById(R.id.lv_profil);
        final LessonAdapter adapter = new LessonAdapter(ProfilActivity.this, arrayList);
        lessonListView.setAdapter(adapter);

        ImageView img_profil = findViewById(R.id.img_profile);
        img_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePhoto();
            }

            private void takePhoto() {
                Intent tekePhotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(tekePhotoIntent, IMAGE_ACTION_CODE);
            }
        });
        Button btn_AddLesson = findViewById(R.id.btn_Add_Lesson);
        btn_AddLesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et_addLesson = findViewById(R.id.et_lessonName);
                arrayList.add(new LessonListView(et_addLesson.getText().toString()));
                adapter.notifyDataSetChanged();

            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        ImageView img_profile = findViewById(R.id.img_profile);
        if (resultCode != RESULT_OK) return;
        switch (requestCode) {
            case IMAGE_ACTION_CODE:
                Bundle extras = data.getExtras();
                Bitmap image = (Bitmap) extras.get("data");
                img_profile.setImageBitmap(image);
                break;
        }

    }
}
