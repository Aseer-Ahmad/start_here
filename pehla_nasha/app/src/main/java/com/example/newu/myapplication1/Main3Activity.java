package com.example.newu.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    EditText etsurname;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etsurname=findViewById(R.id.editText);
        bt=findViewById(R.id.button_sur);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            String sn=etsurname.getText().toString().trim();
            Intent intent=new Intent();  //since we enter this activity for result we dont need to specify here parameters
            intent.putExtra("surname",sn);

            setResult(RESULT_OK, intent);

            Main3Activity.this.finish();
            }
        });
    }
}
