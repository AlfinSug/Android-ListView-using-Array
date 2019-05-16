package com.developer.alfin.catalogapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        ImageView img = findViewById(R.id.img_detail);
        TextView text = findViewById(R.id.txt_detail);
        TextView detail = findViewById(R.id.loc_cafe);
        TextView phone = findViewById(R.id.phone_cafe);
        TextView open = findViewById(R.id.open_cafe);
        TextView ig = findViewById(R.id.ig_cafe);

        Intent show = getIntent();
        String namecafe = show.getStringExtra("namecafe");
        Integer imgcafe = show.getIntExtra("imgcafe", 0);
        String addresscafe2 = show.getStringExtra("addresscafe2");
        String phonecafe = show.getStringExtra("phonecafe");
        String opencafe = show.getStringExtra("opencafe");
        String igcafe = show.getStringExtra("igcafe");

        img.setImageResource(imgcafe);
        text.setText(namecafe);
        detail.setText(addresscafe2);
        phone.setText(phonecafe);
        open.setText(opencafe);
        ig.setText(igcafe);

    }
}
