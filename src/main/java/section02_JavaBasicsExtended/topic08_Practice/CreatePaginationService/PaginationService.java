package section02_JavaBasicsExtended.topic08_Practice.CreatePaginationService;

public class PaginationService {
    private String[] data;
    private int elementsPerPage;

    public PaginationService(String[] data, int elementsPerPage) {
        this.data = data;
        this.elementsPerPage = elementsPerPage;
    }

    public int getElementsCount() {
        return data.length;
    }

    public int getPageNumberByElementIndex(int index) {
        if (getElementsCount() < index || index < 0) {
            return -1;
        }
        return index / elementsPerPage;
    }
}
