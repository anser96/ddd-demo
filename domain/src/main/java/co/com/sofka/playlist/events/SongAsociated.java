package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.values.SongId;

public class SongAsociated extends DomainEvent {

    private final SongId songId;

    public SongAsociated(SongId songId){
        super("co.com.sofka.playlist.songasociated");
        this.songId = songId;
    }

    public SongId getSongId(){
        return songId;
    }
}
