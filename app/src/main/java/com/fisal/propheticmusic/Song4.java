package com.fisal.propheticmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Song4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song4);

        // Play list button
        playListButton();

        //Play next song button
        playNextButton();
    }


    private void playListButton() {
        Button othersButton = (Button) findViewById(R.id.playListButton);
        othersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playListIntent = new Intent(getApplicationContext(), MainActivity.class);
                playListIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(playListIntent);
                // finish();
            }
        });
    }

    private void playNextButton() {
        Button othersButton = (Button) findViewById(R.id.playNextButton);
        othersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playNextIntent = new Intent(getApplicationContext(), Song5.class);
                playNextIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(playNextIntent);
                // finish();
            }
        });
    }
}
