package com.fisal.propheticmusic;

/**
 * Created by fisal on 17/12/2017.
 */

/**
 * {@link PropheticMusic} represents a single Prophetic music.
 * Each object has 3 properties: Song name, Artist Name, and album photo resource ID.
 */

public class PropheticMusic {

    private String mSongName;

    private String mArtistName;

    private int mAlbumPhoto;

    public PropheticMusic(String sName, String aName, int aPhoto) {
        mSongName = sName;
        mArtistName = aName;
        mAlbumPhoto = aPhoto;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getAlbumPhoto() {
        return mAlbumPhoto;
    }
}
