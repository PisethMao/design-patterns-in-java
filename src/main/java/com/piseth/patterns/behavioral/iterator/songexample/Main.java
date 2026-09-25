package com.piseth.patterns.behavioral.iterator.songexample;

public class Main {
    public static void main() {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song A", "Artist A"));
        playlist.addSong(new Song("Song B", "Artist B"));
        playlist.addSong(new Song("Song C", "Artist C"));
        SongIterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song);
        }
    }
}
