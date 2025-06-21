public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(201, "The Alchemist", "Paulo Coelho"),
            new Book(202, "1984", "George Orwell"),
            new Book(203, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(204, "To Kill a Mockingbird", "Harper Lee")
        };

        String searchTitle = "The Great Gatsby";

        System.out.println("🔍 Linear Search:");
        Book result1 = LibrarySearchUtils.linearSearchByTitle(books, searchTitle);
        System.out.println(result1 != null ? result1 : "Book not found");

        // Sort before binary search
        LibrarySearchUtils.sortBooksByTitle(books);

        System.out.println("\n📚 Books after sorting by title:");
        LibrarySearchUtils.printBooks(books);

        System.out.println("\n🔍 Binary Search:");
        Book result2 = LibrarySearchUtils.binarySearchByTitle(books, searchTitle);
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
