import java.util.Arrays;

public class BookSearch {

    // Linear Search
    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search (Assumes sorted by title)
    public static Book binarySearch(Book[] books, String targetTitle) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(targetTitle);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Programming", "John Smith"),
            new Book(2, "Data Structures", "Jane Doe"),
            new Book(3, "Algorithms", "Alice Johnson")
        };

        // Sort for binary search
        Arrays.sort(books, (a, b) -> a.title.compareToIgnoreCase(b.title));

        Book linearResult = linearSearch(books, "Data Structures");
        System.out.println("Linear Search Result: " + linearResult);

        Book binaryResult = binarySearch(books, "Data Structures");
        System.out.println("Binary Search Result: " + binaryResult);
    }
}
