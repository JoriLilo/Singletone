import java.util.Arrays;

public class MainRef {
    public static void main(String[] args) {
        Book book= new Book("Harry Potter","author");

        Class<? extends Book> bookReflection=book.getClass();
        if (!bookReflection.isAnnotation()) System.out.println("not true");
        else {
            System.out.println("this is anotation");
        }
        System.out.println(Arrays.toString(bookReflection.getDeclaredMethods()));
    }
}
