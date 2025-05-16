import java.util.Arrays;
import java.util.List;

public class PaginationExample {
    public static void main(String[] args) {
        // Sample data
        List<String> allUsers = Arrays.asList(
            "User1", "User2", "User3", "User4", "User5", 
            "User6", "User7", "User8", "User9", "User10"
        );
        
        // Pagination parameters
        int pageSize = 3;
        int totalPages = PaginationUtils.getTotalPages(allUsers.size(), pageSize);
        
        System.out.println("Total records: " + allUsers.size());
        System.out.println("Page size: " + pageSize);
        System.out.println("Total pages: " + totalPages);
        System.out.println();
        
        // Display each page
        for (int pageNum = 1; pageNum <= totalPages; pageNum++) {
            List<String> pageUsers = PaginationUtils.paginateList(allUsers, pageNum, pageSize);
            System.out.println("Page " + pageNum + ": " + pageUsers);
        }
        
        // Example of requesting a page that doesn't exist
        List<String> nonExistentPage = PaginationUtils.paginateList(allUsers, totalPages + 1, pageSize);
        System.out.println("\nNon-existent page: " + nonExistentPage);
    }
}