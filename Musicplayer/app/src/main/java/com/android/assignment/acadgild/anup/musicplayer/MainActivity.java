package com.android.assignment.acadgild.anup.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    MusicService musicService;
    Button button_start, button_stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_start = (Button) findViewById(R.id.button_start);
        button_stop = (Button) findViewById(R.id.button_stop);

        button_start.setOnClickListener(this);
        button_stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.button_start)
        {
            Intent intent = new Intent(this, MusicService.class);
            startService(intent);
            Log.e("button_start","startIntent");
        }
        else
        {
            Intent intent = new Intent(this, MusicService.class);
            stopService(intent);
        }
    }
}
