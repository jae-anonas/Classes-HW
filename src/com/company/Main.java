package com.company;

/*

- **Main** class requirements
  - Create your `main()` method here - this is where you create and manipulate instances of the other classes; do the following steps inside `main()`
  - Create a new instance of `User`
  - Create at least 5 new instances of `Song` and assign each to a variable (You can come up with creative values or just use "song1", "artist1", etc.)
  - Create at least 2 instances of `Playlist`, add multiple `Song` objects to each, then add those `Playlist` objects to your `User` object
  - Use the methods you defined and print out the names of your user's playlists, then "play" each song in each playlist so the songs print out as well

 */

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        User myUser = new User("Jae");

        Song song1 = new Song("song1", "artist1", "album1");
        Song song2 = new Song("song2", "artist1", "album1");
        Song song3 = new Song("song3", "artist2", "album1");
        Song song4 = new Song("song4", "artist2", "album1");
        Song song5 = new Song("song5", "artist3", "album1");

        Playlist playlist1 = new Playlist("Recently played");
        Playlist playlist2 = new Playlist("Recently added");

        myUser.addPlaylist(playlist1);
        myUser.addPlaylist(playlist2);

        for(String p: myUser.getAllPlaylistNames())
            System.out.println(p);

    }
}
