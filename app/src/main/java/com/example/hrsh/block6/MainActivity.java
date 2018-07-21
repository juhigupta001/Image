package com.example.hrsh.block6;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView image=(ImageView) findViewById(R.id.imageView2);
        SeekBar seekbar=(SeekBar) findViewById(R.id.seekBar);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int lastprogress;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lastprogress=progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                image.setColorFilter(Color.argb(50,150,lastprogress,255-lastprogress));
            }
        });





    }
}
