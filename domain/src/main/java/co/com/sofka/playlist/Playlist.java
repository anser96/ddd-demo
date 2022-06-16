package co.com.sofka.playlist;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.playlist.events.NameChanged;
import co.com.sofka.playlist.events.PlaylistChange;
import co.com.sofka.playlist.events.PlaylistCreated;
import co.com.sofka.playlist.events.SongAsociated;
import co.com.sofka.playlist.values.PlaylistId;
import co.com.sofka.playlist.values.PlaylistName;
import co.com.sofka.playlist.values.SongId;

import java.util.Set;

public class Playlist extends AggregateEvent<PlaylistId> {

    public PlaylistName playlistName;

    public SongId song;

    private Playlist(PlaylistId playlistId){
        super(playlistId);
        subscribe(new PlaylistChange(this));
    }

    public Playlist(PlaylistId entityId, PlaylistName playlistName, SongId song) {
        super(entityId);
        subscribe(new PlaylistChange(this));
        appendChange(new PlaylistCreated(playlistName,song)).apply();
    }

    public void addSong(SongId songId){
        appendChange(new SongAsociated(songId)).apply();
    }

    public void cambiarNombre(PlaylistName playlistName){
        appendChange(new NameChanged(playlistName)).apply();
    }
}
