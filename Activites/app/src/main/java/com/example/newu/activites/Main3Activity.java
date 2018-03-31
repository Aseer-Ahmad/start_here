package com.example.newu.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button b2=findViewById(R.id.button2);
        final EditText e1=findViewById(R.id.editText);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Main3Activity.this, Main2Activity.class);
                i.putExtra("name",e1.getText().toString());
                startActivity(i);

            }
        });
    }
}
