package com.piseth.patterns.behavioral.iterator.songexample;

import java.util.NoSuchElementException;

public class PlaylistIterator implements SongIterator {
    private final Playlist playlist;
    private int position = 0;

    public PlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        return position < playlist.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException(
                    "No more songs in the playlist"
            );
        }
        Song song = playlist.getSong(position);
        position++;
        return song;
    }
}