package com.dianpii.footballplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView poster = findViewById(R.id.gambar);
        String pstr = getIntent().getExtras().get("gambar").toString();
        String url = "http://images.pitchero.com/ui/2472624/image_59b1520b0f919.jpg";
        Toast.makeText(this, pstr, Toast.LENGTH_SHORT).show();
        Picasso.get().load(url).into(poster);
    }
}
