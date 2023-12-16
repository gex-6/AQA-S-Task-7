import java.util.List;

public abstract class ListParent {
    private List<BookObject> booksOfList;
    private String listName;

    public ListParent(List<BookObject> booksOfList, String listName) {
        this.booksOfList = booksOfList;
        this.listName = listName;
    }
}
