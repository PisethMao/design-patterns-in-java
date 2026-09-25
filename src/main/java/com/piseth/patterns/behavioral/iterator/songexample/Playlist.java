package com.piseth.patterns.behavioral.iterator.songexample;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public Song getSong(int index) {
        return songs.get(index);
    }

    public int size() {
        return songs.size();
    }

    public SongIterator createIterator() {
        return new PlaylistIterator(this);
    }
}
