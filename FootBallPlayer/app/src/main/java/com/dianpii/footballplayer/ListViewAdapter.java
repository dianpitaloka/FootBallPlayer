package com.dianpii.footballplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<PlayerItem> {

    private List<PlayerItem> playerItemList;

    private Context context;

    public ListViewAdapter(List<PlayerItem> playerItemList, Context context) {
        super(context, R.layout.list_item, playerItemList);
        this.playerItemList = playerItemList;
        this.context = context;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View listViewItem = inflater.inflate(R.layout.list_item, null, true);

        TextView textViewNo = listViewItem.findViewById(R.id.textViewNo);
        TextView textViewName = listViewItem.findViewById(R.id.textViewName);
        TextView textViewPosition = listViewItem.findViewById(R.id.textViewPosition);
        TextView textViewBirth_date = listViewItem.findViewById(R.id.textViewBirthDate);
        ImageView imgVIew = listViewItem.findViewById(R.id.Poster);


        final PlayerItem playerItem = playerItemList.get(position);

        textViewNo.setText(playerItem.getNo());
        textViewName.setText(playerItem.getName());
        textViewBirth_date.setText(playerItem.getBirth_date());
        textViewPosition.setText(playerItem.getPosition());


        Picasso.get().load(playerItem.getPoster()).placeholder(R.drawable.ic_person_outline_black_24dp).fit().into(imgVIew);

//        listViewItem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(), DetailActivity.class);
//                intent.putExtra("gambar", playerItem.getPoster());
//                getContext().startActivity(intent);
//            }
//        });

        return listViewItem;
    }
}