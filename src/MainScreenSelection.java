import java.util.Comparator;
import java.util.List;

public class MainScreenSelection<T> {

    private String mainsScreenId;
    private String mainScreenTitle;
    private int listsNumber;
    private List<T> mainScreenLists; //Data
    private Pagination pagination;

    public MainScreenSelection(String mainsScreenId,
                               String mainScreenTitle,
                               int listsNumber,
                               List<T> mainScreenLists,
                               Pagination pagination) {
        this.mainsScreenId = mainsScreenId;
        this.mainScreenTitle = mainScreenTitle;
        this.listsNumber = listsNumber;
        this.mainScreenLists = mainScreenLists;
        this.pagination = pagination;
    }
}
