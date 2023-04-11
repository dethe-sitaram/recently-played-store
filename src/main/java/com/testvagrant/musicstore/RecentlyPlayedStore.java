package com.testvagrant.musicstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecentlyPlayedStore {
    private final Map<String, User> users;
    private final int capacity;
    
   
    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        users = new HashMap<>();
    }

    public void addPlayedSong(String userId, String song) {
        if (!users.containsKey(userId)) {
            users.put(userId, new User(userId));
        }
        User user = users.get(userId);
        user.addRecentlyPlayedSong(song);
        if (user.getRecentlyPlayedSongs().size() > capacity) {
            user.getRecentlyPlayedSongs().remove(0);
        }
    }

    public List<String> getRecentlyPlayedSongs(String userId) {
        if (!users.containsKey(userId)) {
            return Collections.emptyList();
        }
        User user = users.get(userId);
        return new ArrayList<>(user.getRecentlyPlayedSongs());
    }
}
