package com.example.newu.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button play, pause, fwd, bck;
    SeekBar seekBar;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar=findViewById(R.id.seek);
        play=findViewById(R.id.playbtn);
        pause=findViewById(R.id.pausebtn);
        fwd=findViewById(R.id.fwdbtn);
        bck=findViewById(R.id.bckbtn);

        mediaPlayer=MediaPlayer.create(this, R.raw.music);

        t=findViewById(R.id.progres);

      //  seekBar.setProgress(20);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                //Toast.makeText(MainActivity.this, ""+i, Toast.LENGTH_SHORT).show();
                //t.setText(i);
               }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this, "started", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(MainActivity.this, "stopped", Toast.LENGTH_SHORT).show();

            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    mediaPlayer.start();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });


        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });

        //mediaPlayer.stop();
        //mediaPlayer.seekTo();


    }
}
