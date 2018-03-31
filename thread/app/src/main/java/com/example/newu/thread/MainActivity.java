package com.example.newu.thread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startCount();
            }
        });

    }

    private void startCount() {

        Thread thread=new Thread(){
            @Override
            public void run() {

                while(true){

                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            editText.setText(""+ i);
                            i++;
                        }
                    });

                 try {
                    sleep(500);
                 }catch(InterruptedException e) {
                        e.printStackTrace();

                 }
                }

            }
        };

        thread.start();

    }
}
