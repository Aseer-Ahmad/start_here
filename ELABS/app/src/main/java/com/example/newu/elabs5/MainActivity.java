package com.example.newu.elabs5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> data;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Elabs");

        sp=findViewById(R.id.spin_data);
        data=new ArrayList<>();
        data.add("please select item");
        data.add("Android");
        data.add("JAVA");
        data.add("PHP");
        data.add("Python");
        data.add("Nodejs");
        data.add("IoT");
        data.add("Machine Learning");
        data.add("Asp.net");
        data.add("C");
        data.add("Cpp");
        data.add("Css");

       final ArrayAdapter<String> ad=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, data);
        sp.setAdapter(ad);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+sp.getSelectedItem(), Toast.LENGTH_SHORT).show();
              //  Log.d("item Selected - ",""+ data.get(i));    //this way we can know what values are catched.
                //data.remove(i);

                //ad.notifyDataSetChanged();   //if ever data is manipulated again listview has to be notified, adapter has to do that

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
