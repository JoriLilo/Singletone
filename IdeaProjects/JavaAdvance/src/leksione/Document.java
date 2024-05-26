package leksione;

public  abstract class Document {
    public abstract String generateTitle(String title);
    public abstract String generateContent(String content);
    public abstract String generateFooter(String footer);
    public abstract String author(String author);

    public Boolean isLanscape() {
        return false;
    }


}
