import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearchUtils {

    // Linear search by title
    public static Book linearSearchByTitle(Book[] books, String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    // Binary search by title
    public static Book binarySearchByTitle(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }

    // Sort books by title
    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    // Utility to print all books
    public static void printBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
