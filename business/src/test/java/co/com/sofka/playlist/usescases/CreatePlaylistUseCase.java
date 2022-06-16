package co.com.sofka.playlist.usescases;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.playlist.command.CreatePlaylist;
import co.com.sofka.playlist.events.PlaylistCreated;
import co.com.sofka.playlist.usecases.CreatePlaylistUseCase;
import co.com.sofka.playlist.values.PlaylistName;
import co.com.sofka.playlist.values.SongId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

class CreatePlaylistUseCaseTest {

    @Test
    void createPlaylist(){
        //arrange
        PlaylistName name =new PlaylistName("variado");
        SongId song =  new SongId("1");

        var command = new CreatePlaylist(name, song);
        var usecase = new CreatePlaylistUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (PlaylistCreated)events.get(0);

        Assertions.assertEquals("variado", event.getPlaylistName().value());
        Assertions.assertEquals("1",event.getSong().value());
    }
}
