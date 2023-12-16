import java.util.List;

public class SmallBooksList extends ListParent {
    private int bookNumber;
    private String listEmoji;

    public SmallBooksList(List<BookObject> booksOfList,
                          String listName,
                          int bookNumber,
                          String emojiCode) {
        super(booksOfList, listName);
        this.bookNumber = bookNumber;
        this.listEmoji = emojiCode;
    }
}
