public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(110, "Smartphone", "Electronics"),
            new Product(101, "Book", "Books")
        };

        int searchId = 110;

        System.out.println("📍 Linear Search:");
        Product result1 = SearchUtils.linearSearch(products, searchId);
        System.out.println(result1 != null ? result1 : "Product not found");

        // Binary search needs sorted array
        SearchUtils.sortProductsById(products);

        System.out.println("\n📍 Binary Search:");
        Product result2 = SearchUtils.binarySearch(products, searchId);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
