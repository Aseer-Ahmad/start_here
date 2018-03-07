package com.example.newu.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String w=getIntent().getStringExtra("username");
        t1=findViewById(R.id.textView2);
        t1.setText(w+" , welcome!");

    }
}
