package co.com.sofka.playlist;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.playlist.values.*;

public class Song extends Entity<SongId> {
    protected SongArtist songArtist;

    protected SongDate songDate;

    protected SongGender gender;


    public Song(SongId songId,SongName songName, SongArtist songArtist, SongDate songDate, SongGender gender){
        super(songId);
        this.songArtist = songArtist;
        this.songDate = songDate;
        this.gender = gender;
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
