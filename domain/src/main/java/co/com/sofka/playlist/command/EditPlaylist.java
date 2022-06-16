package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.values.PlaylistName;
import co.com.sofka.playlist.values.PlaylistId;
import co.com.sofka.playlist.values.SongId;
import co.com.sofka.playlist.values.CuentaId;

import java.util.Set;

public class CreatePlaylist extends Command {

    private final CuentaId cuentaId;
    private final PlaylistId playlistId;
    private final PlaylistName playlistName;
    private final SongId song;


    public CreatePlaylist(CuentaId cuentaId,PlaylistId playlistId, PlaylistName playlistName, SongId song){
        this.cuentaId = cuentaId;
        this.playlistId = playlistId;
        this.playlistName = playlistName;
        this.song = song;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public PlaylistId getPlaylistId() {
        return playlistId;
    }

    public PlaylistName getPlaylistName(){
        return playlistName;
    }

    public  SongId getSong(){
        return song;
    }
}
