package co.com.sofka.Usuario;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.playlist.values.CuentaId;
import co.com.sofka.playlist.values.Password;
import co.com.sofka.playlist.values.UserName;
import co.com.sofka.playlist.values.TypeAccount;

public class UsuarioChange extends EventChange {

    public UsuarioChange(Usuario usuario){
        apply((PlaylistCreated event)->{
            playlist.playlistName = event.getPlaylistName();
            playlist.song = (SongId) event.getSong();
            playlist.accountAsociate = (ClientID) event.getClientId();
        });
    }
}