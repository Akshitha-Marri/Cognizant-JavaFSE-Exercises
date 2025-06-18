public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Adding tasks manually
        manager.addTask(4, "reading", "Complete");
        manager.addTask(2, "Writing", "Incomplete");
        manager.addTask(6, "Sleeping", "Incomplete");

        System.out.println("Tasks in the list:");
        manager.traverseTasks();

        // Searching a task
        int searchId = 4;
        Task found = manager.searchTask(searchId);
        if (found != null) {
            System.out.println("\nFound Task: " + found);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }

        // Deleting a task
        int deleteId = 6;
        boolean deleted = manager.deleteTask(deleteId);
        System.out.println("\nTask with ID " + deleteId + " deleted: " + deleted);

        // Displaying tasks after deletion
        System.out.println("\nTasks in the list after deletion:");
        manager.traverseTasks();
    }
}
