import java.util.Arrays;
import java.util.Comparator;

public class SearchUtils {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.getProductId() == id) return p;
        }
        return null;
    }

    // Binary Search (array must be sorted by productId)
    public static Product binarySearch(Product[] products, int id) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].getProductId() == id)
                return products[mid];
            else if (products[mid].getProductId() < id)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    // Utility: Sort products by productId
    public static void sortProductsById(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
    }
}
