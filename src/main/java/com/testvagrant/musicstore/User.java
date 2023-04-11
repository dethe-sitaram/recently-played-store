package com.testvagrant.musicstore;

import java.util.ArrayList;
import java.util.List;

public class User {
	
    private final String userId;
    private final List<String> recentlyPlayedSongs;

    public User(String userId) {
        this.userId = userId;
        this.recentlyPlayedSongs = new ArrayList<>();
    }

    public void addRecentlyPlayedSong(String song) {
        recentlyPlayedSongs.add(song);
    }

    public List<String> getRecentlyPlayedSongs() {
        return recentlyPlayedSongs;
    }
}
