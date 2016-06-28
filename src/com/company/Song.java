package com.company;

/**
 * Created by roosevelt on 6/28/16.
 *
 - **Song** class requirements
 - Define 3 member variables: `mSongName`, `mArtistName`, `mAlbumName`
 - Define a *constructor* method that takes song name, artist name, and album name as inputs, and assigns those values to the corresponding member variables
 - Define a method `play()` that just prints the name, artist, & album to the command line (since we don't know how to actually play media files yet)

 */
public class Song {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song(String sName, String arName, String alName){
        mSongName = sName;
        mArtistName = arName;
        mAlbumName = alName;
    }

    public void play(){
        System.out.println("Now playing: " + mSongName + " by " + mArtistName + " from " + mAlbumName);
    }
}
