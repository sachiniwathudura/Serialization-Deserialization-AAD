import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 2L;
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', publicationYear=" + publicationYear + '}';
    }
}
