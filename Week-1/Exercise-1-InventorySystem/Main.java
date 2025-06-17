public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        Product p1 = new Product("P001", "Mouse", 50, 499.99);
        Product p2 = new Product("P002", "Keyboard", 30, 999.49);

        manager.addProduct(p1);
        manager.addProduct(p2);

        System.out.println("Initial Inventory:");
        manager.displayInventory();

        // Update
        manager.updateProduct("P001", 60, 479.99);
        System.out.println("\nAfter Update:");
        manager.displayInventory();

        // Delete
        manager.deleteProduct("P002");
        System.out.println("\nAfter Deletion:");
        manager.displayInventory();
    }
}
