package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.Identity;

public class SongName extends Identity{
    private SongName(String value){
        super(value);
    }

    public static SongName of(String value){
        return new SongName(value);
    }


}
