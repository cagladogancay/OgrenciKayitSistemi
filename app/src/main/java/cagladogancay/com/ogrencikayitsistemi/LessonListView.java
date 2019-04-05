package cagladogancay.com.ogrencikayitsistemi;

import android.widget.BaseAdapter;

public class LessonListView {
    private String  lessonName;

    public LessonListView(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}
