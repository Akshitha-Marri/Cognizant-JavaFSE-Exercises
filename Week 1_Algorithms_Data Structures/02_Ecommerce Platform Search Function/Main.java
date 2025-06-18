public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Bag", "Accessories"),
            new Product(104, "Watch", "Accessories")
        };

        System.out.println(" Linear Search: 'Bag'");
        Product foundLinear = SearchAlgorithms.linearSearch(products, "Bag");
        if (foundLinear != null)
            System.out.println("Found: " + foundLinear.productName + " - " + foundLinear.category);
        else
            System.out.println("Not Found!");

        // Sort for binary search
        SearchAlgorithms.sortByName(products);

        System.out.println("\n Binary Search: 'Watch'");
        Product foundBinary = SearchAlgorithms.binarySearch(products, "Watch");
        if (foundBinary != null)
            System.out.println("Found: " + foundBinary.productName + " - " + foundBinary.category);
        else
            System.out.println("Not Found!");
    }
}
