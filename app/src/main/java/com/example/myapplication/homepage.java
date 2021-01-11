package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class homepage extends AppCompatActivity {
    ImageButton b1, b2;

   static int s=0;
    static int m=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        Log.d(""," 1 created");
        b1 = (ImageButton) findViewById(R.id.basketball);
        b2 = (ImageButton) findViewById(R.id.baseball);
        b1.setEnabled(true);
        b2.setEnabled(true);
        Intent intent=getIntent();




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homepage.this, MainActivity.class);
                i.putExtra("value", "O");
                i.putExtra("music",m);
                i.putExtra("sound",s);
                homepage.this.startActivity(i);
                b1.setEnabled(true);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homepage.this, MainActivity.class);
                i.putExtra("value", "X");
               i.putExtra("sound",s);
                i.putExtra("music",m);
                homepage.this.startActivity(i);
                b2.setEnabled(true);

            }
        });

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("","1 stopped");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("","1 started");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("","1 paused");

    }
    @Override
    protected void onResume() {

        super.onResume();
        Log.d("","1 resumed");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("","1 destroyed");
    }
    public void onBackPressed() {
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
    }


}
