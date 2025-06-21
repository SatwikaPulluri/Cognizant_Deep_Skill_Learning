import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add a new product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    // Update an existing product
    public void updateProduct(int productId, String name, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Product updated: " + p);
        } else {
            System.out.println("Product ID not found!");
        }
    }

    // Delete a product
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            Product removed = inventory.remove(productId);
            System.out.println("Product deleted: " + removed);
        } else {
            System.out.println("Product ID not found!");
        }
    }

    // Display all products
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }
}
