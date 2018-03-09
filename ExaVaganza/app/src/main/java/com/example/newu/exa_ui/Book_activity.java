package com.example.newu.exa_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_activity extends AppCompatActivity {

    private TextView tvtitle, tvdescription, tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_activity);

        tvtitle=findViewById(R.id.txttitle);
        tvdescription=findViewById(R.id.txtdesc);
        tvcategory=findViewById(R.id.txtcat);

        img=findViewById(R.id.book_thumbnail);


        Intent intent=getIntent();
        String title=intent.getExtras().getString("Title");
        String description=intent.getExtras().getString("Description");
        int image=intent.getExtras().getInt("Thumbnail");

        tvtitle.setText(title);
        tvdescription.setText(description);

        img.setImageResource(image);

    }
}
