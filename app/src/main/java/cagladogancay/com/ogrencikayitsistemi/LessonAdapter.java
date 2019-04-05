package cagladogancay.com.ogrencikayitsistemi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class LessonAdapter extends BaseAdapter {
    Context mContext;
    List<LessonListView> lessonList;

    public LessonAdapter(Context context, List<LessonListView> lessonList) {
        mContext = context;
        this.lessonList = lessonList;
    }

    @Override
    public int getCount() {
        return lessonList.size();
    }

    @Override
    public Object getItem(int position) {
        return lessonList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(mContext,R.layout.lesson,null);
        TextView lessonTxt= view.findViewById(R.id.tv_lesson);
        lessonTxt.setText(lessonList.get(position).getLessonName());
        return view;
    }
}
