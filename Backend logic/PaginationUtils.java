import java.util.List;

public class PaginationUtils {
    public static int getTotalPages(int totalItems, int pageSize) {
        return (int) Math.ceil((double) totalItems / pageSize);
    }

    public static <T> List<T> paginateList(List<T> list, int pageNum, int pageSize) {
        int start = (pageNum - 1) * pageSize;
        int end = Math.min(start + pageSize, list.size());

        if (start >= list.size()) return List.of(); // Empty list if page number is too high
        return list.subList(start, end);
    }
}
