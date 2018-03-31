package com.example.newu.test;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int sizes[]={20, 30, 40, 50, 60, 70, 80,90,100,110,130,45,212,1,12,34,45,46,67,12,56};
    int color[]={Color.BLUE, Color.CYAN, Color.GRAY, Color.GREEN, Color.BLACK, Color.MAGENTA, Color.DKGRAY, Color.RED,};
    int gravity[]={Gravity.AXIS_Y_SHIFT,Gravity.AXIS_CLIP, Gravity.CENTER, Gravity.CENTER_VERTICAL, Gravity.CLIP_VERTICAL, Gravity.AXIS_X_SHIFT, Gravity.CLIP_HORIZONTAL,Gravity.AXIS_PULL_AFTER, Gravity.AXIS_PULL_BEFORE,Gravity.END, Gravity.FILL, Gravity.BOTTOM};
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.textView2);
        //final Context ctx=this;

        t1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                int r = getRandomNo(sizes.length - 1);
                t1.setTextSize(sizes[r]);

                t1.setTextColor(color[getRandomNo(color.length - 1)]);
                t1.setGravity(gravity[getRandomNo(gravity.length - 1)]);

            }
        });
    }

    private int getRandomNo(int max){
        Random r=new Random();
        int n=0+r.nextInt(max);
        return n;
        }

}

