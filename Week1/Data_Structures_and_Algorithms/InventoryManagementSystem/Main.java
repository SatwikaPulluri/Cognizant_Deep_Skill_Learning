public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Keyboard", 50, 999.99);
        Product p2 = new Product(102, "Mouse", 100, 499.50);
        Product p3 = new Product(103, "Monitor", 25, 7500.00);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.displayInventory();

        manager.updateProduct(102, "Wireless Mouse", 80, 599.99);
        manager.deleteProduct(101);

        manager.displayInventory();
    }
}
