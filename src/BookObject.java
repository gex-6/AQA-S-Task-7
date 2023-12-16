import java.util.Comparator;
import java.util.Date;

public class BookObject implements Comparable<BookObject> {
    private String bookId;
    private String title;
    private String description;
    private String cover;
    private String status;
    private Boolean deleted;
    private Date createdAt;
    private CreatorObject author;

    public BookObject(String title,
                      String description,
                      String cover,
                      String status,
                      Boolean deleted,
                      Date createdAt,
                      CreatorObject author) {
        this.bookId = Double.toString (Math.random() * 100000);
        this.title = title;
        this.description = description;
        this.cover = cover;
        this.status = status;
        this.deleted = deleted;
        this.createdAt = createdAt;
        this.author = author;
    }

    @Override
    public int compareTo(BookObject other) {
        return this.title.compareTo(other.title);
    }
}
