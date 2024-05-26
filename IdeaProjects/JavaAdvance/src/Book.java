public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @RunImediately
    public void printBookDetail(){
        System.out.println(this.author+" "+this.author);
    }

}
