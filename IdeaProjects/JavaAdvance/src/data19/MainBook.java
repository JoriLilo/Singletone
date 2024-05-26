package data19;

import java.util.HashSet;
import java.util.Set;

public class MainBook {
    public static void main(String[] args) {

        Book book1= new Book("i huaji","kamy",100D);
        Book book2= new Book("metemorfoza","kafka",150D);
        Book book3= new Book("Lahuta e malcise","Fishta",340D);

        Set<Book> bookSet= new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        Double maxprice=0D;
        Book maxBook=null;
        for (Book book: bookSet) {
            if (book.getPrice()>maxprice){
                maxprice=book.getPrice();
                maxBook=book;
            }

            System.out.println(maxBook);
        }
    }
}
