import java.util.List;

public class BannersTopList extends ListParent {

    private int minBooksBanners;
    private int maxBooksBanners;
    private String mainBannerLink;

    public BannersTopList(List<BookObject> booksOfList,
                          String listName,
                          int minBooksBanners,
                          int maxBooksBanners,
                          String mainBannerLink) {
        super(booksOfList, listName);
        this.minBooksBanners = minBooksBanners;
        this.maxBooksBanners = maxBooksBanners;
        this.mainBannerLink = mainBannerLink;
    }

}
