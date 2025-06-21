public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 5500.00),
            new Order(102, "Bob", 2000.00),
            new Order(103, "Charlie", 9500.00),
            new Order(104, "David", 3000.00)
        };

        // Clone the original array for both sorting methods
        Order[] bubbleSorted = orders.clone();
        Order[] quickSorted = orders.clone();

        System.out.println("🔷 Bubble Sort Result (Descending by Total Price):");
        SortUtils.bubbleSort(bubbleSorted);
        SortUtils.printOrders(bubbleSorted);

        System.out.println("\n🔶 Quick Sort Result (Descending by Total Price):");
        SortUtils.quickSort(quickSorted, 0, quickSorted.length - 1);
        SortUtils.printOrders(quickSorted);
    }
}
