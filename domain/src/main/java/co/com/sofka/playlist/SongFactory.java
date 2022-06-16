public class SongFactory {
    private final Set<Song> songs;
    private static SongFactory instance;

    private SongFactory(){
        songs = new HashSet<>();
    }

    public static SongFactory getInstance(){
        if(Objects.isNull(instance)){
            instance = new SongFactory();
            return instance;
        }
        return instance;
    }

    public SongFactory add(SongId entityId, SongName name, SongArtist artist, SongGender genero){
        lessons.add(new Lesson(entityId, content, category, lessonType));
        return this;
    }

    protected Set<Song> songs() {
        return songs;
    }


}