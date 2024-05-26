package compositon;

public class Favourite {

    private Book book;
    private Song song ;

    public Favourite(Book book, Song song) {
        this.book = book;
        this.song = song;
    }

    @Override
    public String toString() {
        return "Favourite{" +
                "book=" + book +
                ", song=" + song +
                '}';
    }

}

