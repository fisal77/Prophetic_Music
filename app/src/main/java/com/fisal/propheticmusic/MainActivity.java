package com.fisal.propheticmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link MainActivity} shows a list of Songs.
 * For each song, display the song name, artist name, and album image.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get strings for each string variable
        String songName1 = getString(R.string.songName1);
        String songName2 = getString(R.string.songName2);
        String songName3 = getString(R.string.songName3);
        String songName4 = getString(R.string.songName4);
        String songName5 = getString(R.string.songName5);
        String songName6 = getString(R.string.songName6);
        String songName7 = getString(R.string.songName7);
        String artistName1 = getString(R.string.artistName1);
        String artistName2 = getString(R.string.artistName2);
        String artistName3 = getString(R.string.artistName3);
        String artistName4 = getString(R.string.artistName4);
        String artistName5 = getString(R.string.artistName5);
        String artistName6 = getString(R.string.artistName6);
        String artistName7 = getString(R.string.artistName7);

        // Create an ArrayList for PropheticMusic object class
        ArrayList<PropheticMusic> propheticMusicArrayList = new ArrayList<PropheticMusic>();
        propheticMusicArrayList.add(new PropheticMusic(songName1, artistName1, R.drawable.alkousy));
        propheticMusicArrayList.add(new PropheticMusic(songName2, artistName2, R.drawable.hasanalhaffar));
        propheticMusicArrayList.add(new PropheticMusic(songName3, artistName3, R.drawable.aboshaar));
        propheticMusicArrayList.add(new PropheticMusic(songName4, artistName4, R.drawable.maher0zain0mustafa0ceceli));
        propheticMusicArrayList.add(new PropheticMusic(songName5, artistName5, R.drawable.samiyusuf));
        propheticMusicArrayList.add(new PropheticMusic(songName6, artistName6, R.drawable.ummati));
        propheticMusicArrayList.add(new PropheticMusic(songName7, artistName7, R.drawable.alahad));

        // Create an {@link PropheticMusicAdapter}, whose data source is a list of
        // {@link PropheticMusic}s. The adapter knows how to create list item views for each item
        // in the list.
        PropheticMusicAdapter propheticMusicAdapter = new PropheticMusicAdapter(this, propheticMusicArrayList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_PropheticMusic);
        listView.setAdapter(propheticMusicAdapter);

        // Get the correct activity by passing the selected position no. (index no.) in arraylist
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                switch (position) {
                    case 0:
                        // int pMusic =  listView.getCheckedItemPosition();
                        Intent song1 = new Intent(getApplicationContext(), Song1.class);
                        // intent.putExtra("pMusic", pMusic);
                        song1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(song1);
                        break;

                    case 1:
                        // int pMusic =  listView.getCheckedItemPosition();
                        Intent song2 = new Intent(getApplicationContext(), Song2.class);
                        // intent.putExtra("pMusic", pMusic);
                        song2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(song2);
                        break;

                    case 2:
                        // int pMusic =  listView.getCheckedItemPosition();
                        Intent song3 = new Intent(getApplicationContext(), Song3.class);
                        // intent.putExtra("pMusic", pMusic);
                        song3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(song3);
                        break;

                    case 3:
                        // int pMusic =  listView.getCheckedItemPosition();
                        Intent song4 = new Intent(getApplicationContext(), Song4.class);
                        // intent.putExtra("pMusic", pMusic);
                        song4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(song4);
                        break;

                    case 4:
                        // int pMusic =  listView.getCheckedItemPosition();
                        Intent song5 = new Intent(getApplicationContext(), Song5.class);
                        // intent.putExtra("pMusic", pMusic);
                        song5.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(song5);
                        break;
                }
            }


        });
    }

}
