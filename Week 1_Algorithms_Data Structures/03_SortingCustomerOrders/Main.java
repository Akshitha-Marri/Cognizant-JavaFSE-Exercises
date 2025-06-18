class Order {
    int id;
    String name;
    double price;

    Order(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " - " + name +" - Rs." + price;
    }
}

public class Main {

    static void bubbleSort(Order[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j].price > arr[j + 1].price) {
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static void quickSort(Order[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].price;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].price < pivot) {
                i++;
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Ravi", 3000),
            new Order(2, "Akshitha", 7000),
            new Order(3, "Priya", 5000)
        };
        System.out.println("Original Orders:");
        for (Order o : orders) System.out.println(o);

        Order[] bubble = orders.clone();
        bubbleSort(bubble);
        System.out.println("\nSorted by Bubble Sort:");
        for (Order o : bubble) System.out.println(o);

        Order[] quick = orders.clone();
        quickSort(quick, 0, quick.length - 1);
        System.out.println("\nSorted by Quick Sort:");
        for (Order o : quick) System.out.println(o);
    }
}
