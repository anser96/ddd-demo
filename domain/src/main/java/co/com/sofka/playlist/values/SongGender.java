package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

public class SongGender implements ValueObject<String>{
    private final String value;

    public SongGender(String value){
        this.value = Objects.requireNonNull(value);

    }

    public String value() {
        return value;
    }

}