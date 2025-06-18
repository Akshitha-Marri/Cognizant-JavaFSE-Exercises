public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        int count = 0;

        // Adding employees
        employees[count++] = new Employee(1, "Alice", "Developer", 60000);
        employees[count++] = new Employee(2, "Bob", "Manager", 80000);
        employees[count++] = new Employee(3, "Charlie", "Analyst", 50000);

        System.out.println("Employees after adding:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }

        // Search for employee with ID 2
        System.out.print("\nSearched Employee with ID 2: ");
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == 2) {
                System.out.println(employees[i]);
                break;
            }
        }

        // Delete employee with ID 1
        boolean deleted = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == 1) {
                // Shift remaining elements
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                deleted = true;
                break;
            }
        }
        System.out.println("\nEmployee with ID 1 deleted: " + deleted);

        // Final list
        System.out.println("Employees after deletion:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }

        // Add another employee
        employees[count++] = new Employee(4, "David", "Engineer", 55000);
        System.out.println("\nEmployees after adding a new employee:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
}
