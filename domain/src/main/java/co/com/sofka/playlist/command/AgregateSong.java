package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.values.SongId;
import co.com.sofka.playlist.values.PlaylistId;

import java.lang.reflect.Field;

public class AgregateSong extends Command {
    private final PlayListId playListId;
    private final SongId songId;

    public AgregateSong(Playlist playlist, SongId songId){
        this.playListId = playlist;
        this.songId = songId;
    }

    public PlayListId getPlayListId() { return playListId; }

    public SongId getSongId() { return songId; }
}
