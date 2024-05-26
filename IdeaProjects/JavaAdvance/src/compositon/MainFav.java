package compositon;

public class MainFav {
    public static void main(String [] args){
        Song song=new Song("Timezone","Maneskin");
        Book book= new Book("Twisted Love", "Ana Haung");

        Favourite favourite= new Favourite(book,song);
        System.out.println(favourite.toString());
    }
}
