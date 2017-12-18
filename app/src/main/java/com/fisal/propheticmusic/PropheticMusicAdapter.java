package com.fisal.propheticmusic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fisal on 18/12/2017.
 */

public class PropheticMusicAdapter extends ArrayAdapter<PropheticMusic> {

    private static final String LOG_TAG = PropheticMusicAdapter.class.getSimpleName();


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param propheticMusic A List of PropheticMusic objects to display in a list
     */
    public PropheticMusicAdapter(Activity context, ArrayList<PropheticMusic> propheticMusic) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, propheticMusic);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link PropheticMusic} object located at this position in the list
        PropheticMusic currentPropheticMusic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID SongName
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.SongName);
        // Get the version name from the current PropheticMusic object and
        // set this text on the song name TextView
        songNameTextView.setText(currentPropheticMusic.getSongName());

        // Find the TextView in the list_item.xml layout with the ID ArtistName
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.ArtistName);
        // Get the Artist Name from the current PropheticMusic object and
        // set this text on the ArtistName TextView
        artistNameTextView.setText(currentPropheticMusic.getArtistName());

        // Find the ImageView in the list_item.xml layout with the ID AlbumPhoto
        ImageView albumPhotoView = (ImageView) listItemView.findViewById(R.id.AlbumPhoto);
        // Get the image resource ID from the current PropheticMusic object and
        // set the image to AlbumPhoto
        albumPhotoView.setImageResource(currentPropheticMusic.getAlbumPhoto());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
