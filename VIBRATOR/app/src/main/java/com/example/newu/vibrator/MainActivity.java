package com.example.newu.vibrator;

import android.app.WallpaperManager;
import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
     EditText e1;
    ImageView iv;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b=findViewById(R.id.button);
        Button b1=findViewById(R.id.button2);
        Button b2=findViewById(R.id.button3);

        iv=findViewById(R.id.imageView);
        e1=findViewById(R.id.editText);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    int t = Integer.parseInt(e1.getText().toString()) * 1000;
                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);  //since this interacts with hardware
                    v.vibrate(t);

                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Enter valid", Toast.LENGTH_SHORT).show();
                }


            }

        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="http://images.all-free-download.com/images/graphiclarge/tree_meadow_nature_220408.jpg";
                dis_image(s);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    WallpaperManager w = WallpaperManager.getInstance(getApplicationContext());

                try{
                    w.setResource(R.raw.android);
                }catch (Exception e){

                    e.printStackTrace();
                }
            }
        });

     }



    public void dis_image(String url){
         Glide.with(this)
                 .load(url)
                 .placeholder(R.drawable.a)  //in case of loading the image displayed
                 .error(R.drawable.a)          // in case of an error
                 .override(300, 200)
                 .centerCrop()
                 .thumbnail(1)
                 .skipMemoryCache(true)
                 .diskCacheStrategy(DiskCacheStrategy.NONE)
                 .into(iv);

     }


}
