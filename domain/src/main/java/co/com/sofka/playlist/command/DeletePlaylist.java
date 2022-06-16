package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.values.PlaylistName;
import co.com.sofka.playlist.values.SongId;

import java.util.Set;

public class CreatePlaylist extends Command {

    private final PlaylistName playlistName;

    private final SongId song;

    public CreatePlaylist(PlaylistName playlistName, SongId song1){
        this.playlistName = playlistName;
        this.song = song1;
    }


    public PlaylistName getPlaylistName(){
        return playlistName;
    }

    public  SongId getSong(){
        return song;
    }
}
