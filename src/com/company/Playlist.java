package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roosevelt on 6/28/16.
 *
 - **Playlist** class requirements
 - Define 2 member variables: `mName` and `mSongs`, where the latter is an `ArrayList` of `Song` objects
 - Define a *constructor* method that does the following:
 - Takes playlist name as an input and assigns it to the corresponding member variable
 - Instantiates `mSongs` as a new, empty `ArrayList`
 - Define a method `getName()` that returns the playlist's name as a String
 - Define a method `addSong(Song song)` that takes a `Song` object as input and adds it to the list
 - Define a `playAll()` method that calls the `play()` method from each `Song` object in the list

 */
public class Playlist {
    private String mName;
    private List<Song> mSongs;

    public Playlist(String pName){
        mName = pName;
        mSongs = new ArrayList<>();
    }

    public String getName(){
        return mName;
    }

    public void addSong(Song s){
        mSongs.add(s);
    }

    public void playAll(){
        for(Song s:mSongs){
            s.play();
        }
    }

}
