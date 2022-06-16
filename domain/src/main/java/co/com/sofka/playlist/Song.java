package co.com.sofka.playlist;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.playlist.values.SongArtist;
import co.com.sofka.playlist.values.SongDate;
import co.com.sofka.playlist.values.SongName;

public class Song extends Entity<SongName> {
    protected SongArtist songArtist;
    protected SongDate songDate;
    protected SongDuration songDuration;
    protected SongAlbum songAlbum;
    protected SongGenre songGenre;
    protected SongComposer songComposer;

    public Song(SongName songName, SongArtist songArtist, SongDate songDate, SongDuration songDuration,
                SongAlbum songAlbum, SongGenre songGenre, SongComposer songComposer){

        super(songName);
        this.songArtist = songArtist;
        this.songDate = songDate;
        this.songDuration = songDuration;
        this.songAlbum = songAlbum;
        this.songGenre = songGenre;
        this.songComposer = songComposer;
    }

    public void ChangeArtist(SongArtist songArtist){
        this.songArtist = songArtist;
    }
    public SongArtist songArtist(){
        return songArtist;
    }
    public SongDate songDate(){
        return songDate;
    }
    public SongDuration SongDuration() { return songDuration; }
    public SongAlbum SongAlbum() { return songAlbum; }
    public SongGenre getSongGenre() { return songGenre; }
    public SongComposer getSongComposer() { return songComposer; }