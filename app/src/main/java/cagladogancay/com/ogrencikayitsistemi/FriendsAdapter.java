package cagladogancay.com.ogrencikayitsistemi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FriendsAdapter extends BaseAdapter {
    Context mContext;
    List<FriendsListView> mFriendsList;

    public FriendsAdapter(Context context, List<FriendsListView> friendsList) {
        mContext = context;
        mFriendsList = friendsList;
    }

    @Override
    public int getCount() {
        return mFriendsList.size();
    }

    @Override
    public Object getItem(int position) {
        return mFriendsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(mContext,R.layout.friends,null);
        TextView txt_username=view.findViewById(R.id.tv_AddFri);
        txt_username.setText(mFriendsList.get(position).getName());
        TextView txt_name=view.findViewById(R.id.tv_AddUser);
        txt_name.setText(mFriendsList.get(position).getUsername());
        ImageView img_friprof=view.findViewById(R.id.img_fri);
      img_friprof.setImageResource(mFriendsList.get(position).isGender() ? R.drawable.ic_person_black_24dp :R.drawable.ic_person_black_24dp);
        return view;
    }
}
