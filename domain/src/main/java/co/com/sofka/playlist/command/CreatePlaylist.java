package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.values.CuentaId;
import co.com.sofka.playlist.values.PlaylistName;
import co.com.sofka.playlist.values.SongId;

public class CreatePlaylist extends Command {

    private final CuentaId cuentaId;
    private final PlaylistName playlistName;
    private final SongId song;

    public CreatePlaylist(PlaylistName playlistName, SongId song, CuentaId cuentaId){
        this.playlistName = playlistName;
        this.cuentaId = cuentaId;
        this.song = song;
    }


    public PlaylistName getPlaylistName(){
        return playlistName;
    }

    public  SongId getSong(){
        return song;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
