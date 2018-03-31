package com.example.newu.elabs2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button save,search, delete,show;
    EditText e1;
    TextView t1;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    save=findViewById(R.id.savebtn  );
    search=findViewById(R.id.searchbtn);
    delete=findViewById(R.id.delebtn);
    show=findViewById(R.id.showbtn);
    e1=findViewById(R.id.edit1);
    t1=findViewById(R.id.text1);

    sharedPreferences=getSharedPreferences("Username", MODE_PRIVATE);  //no other app can access this sharedpreference

    String name=sharedPreferences.getString("Name" , "nothing present");  // this will display the stored data onCreate activity
    t1.setText(name);

    save.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            SharedPreferences.Editor edit=sharedPreferences.edit();
            edit.putString("Name", e1.getText().toString());
            edit.apply();    //can also use .commit() , it will return a boolean as confirmation

        }
    });

    show.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           String name=sharedPreferences.getString("Name" , "nothing present");
            t1.setText(name);
        }
    });

    delete.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            sharedPreferences.edit().remove("Name").commit();    //commit is necessary
        }
    });

    }
}
