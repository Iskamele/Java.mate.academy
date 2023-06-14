package section00_DailyTasks.JavaSpring.Hard.T02_PaginationHelper;

import java.util.List;

public class PaginationHelper<T> {
    private final List<T> collection;
    private final int itemsPerPage;

    /**
     * The constructor takes in a list of items and an integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<T> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }


    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double) itemCount() / itemsPerPage);
    }

    /**
     * returns the number of items on the current page. pageIndex is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageCount() <= pageIndex) {
            return -1;
        }
        int pageItems = itemCount() / pageCount();
        if (pageItems >= pageCount()) {
            pageItems = pageItems - pageCount() + 1;
        }
        return pageItems;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        return (itemCount() <= itemIndex || itemIndex < 0) ? -1 : itemIndex % pageCount();
    }
}
