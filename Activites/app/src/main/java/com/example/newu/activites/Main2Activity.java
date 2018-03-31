package com.example.newu.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t1=findViewById(R.id.textView2);

        Intent i=getIntent(); //to recieve the object of intent recieved from previous activity
        String s=i.getStringExtra("name");
        t1.setText(s);

    }
}
