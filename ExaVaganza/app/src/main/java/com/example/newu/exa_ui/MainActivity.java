package com.example.newu.exa_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bc, bw, br;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    bc=findViewById(R.id.btn_client);
    bw=findViewById(R.id.btn_writer);
    br=findViewById(R.id.btnreg);
        bc.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent=new Intent(MainActivity.this, client.class);
            startActivity(intent);
        }
    });

        bw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, writer.class);
                startActivity(intent);
            }
        });

        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(MainActivity.this, RegistrationPage.class);
                startActivity(intent);

            }
        });

    }
}
