package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.values.PlaylistName;
import co.com.sofka.playlist.values.PlaylistId;
import co.com.sofka.playlist.values.SongId;
import co.com.sofka.playlist.values.CuentaId;

import java.util.Set;

public class CreatePlaylist extends Command {

    private final CuentaId cuentaIdSharer;
    private final CuentaId cuentaIdShared;
    private final PlaylistId playlistId;
    private final PlaylistName playlistName;

    public CreatePlaylist(CuentaId cuentaIdSharer,CuentaId cuentaIdShared,
                          PlaylistId playlistId, PlaylistName playlistName){

        this.cuentaId = cuentaIdSharer;
        this.cuentaId = cuentaIdShared;
        this.playlistId = playlistId;
        this.playlistName = playlistName;
    }

    public CuentaId getCuentaIdSharer() {
        return cuentaIdSharer;
    }

    public CuentaId getCuentaIdShared() {
        return cuentaIdShared;
    }

    public PlaylistId getPlaylistId() {
        return playlistId;
    }

    public PlaylistName getPlaylistName() {
        return playlistName;
    }
}
