package co.com.sofka.playlist;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.playlist.values.SongArtist;
import co.com.sofka.playlist.values.SongDate;
import co.com.sofka.playlist.values.SongName;

public class Song extends Entity<SongName> {
    protected SongArtist songArtist;

    protected SongDate songDate;



    public Song(SongName songName, SongArtist songArtist, SongDate songDate){
        super(songName);
        this.songArtist = songArtist;
        this.songDate = songDate;
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

}
