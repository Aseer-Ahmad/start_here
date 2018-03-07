package com.example.newu.myapplication1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button bt1, bt2, btcall, btcallfriend, btnMap, btnWeb;
    TextView t1;
    final int ACTIVITY_3 = 40;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText2);
        bt1 = findViewById(R.id.button);
        bt2 = findViewById(R.id.button2);
        t1 = findViewById(R.id.textView);
        btcall = findViewById(R.id.btcall);
        btcallfriend = findViewById(R.id.btcallfriend);
        btnMap=findViewById(R.id.btnM);
        btnWeb=findViewById(R.id.btnW);

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=115 Stateway Welkom freeway "));
                startActivity(intent);
            }
        });

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http:www.google.com"));
                    startActivity(intent);
            }
        });

        btcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        btcallfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:90440304411"));
                startActivity(intent);

            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "CLICKED ACTIVITY 1", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this, com.example.newu.myapplication1.Main2Activity.class);

                intent.putExtra("username", et.getText().toString().trim());

                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


              //  Toast.makeText(MainActivity.this, "CLICKED ACTIVITY 2", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this, Main3Activity.class);
                startActivityForResult(intent, ACTIVITY_3);//here we click to get back a result from another actvity thus ForResult

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==ACTIVITY_3 && resultCode==RESULT_OK) {

            t1.setText(et.getText().toString().trim()+" "+ data.getStringExtra("surname"));
        }else if(resultCode==RESULT_CANCELED){

            Toast.makeText(this, "The user did not write anything", Toast.LENGTH_SHORT).show();

        }
    }
}
