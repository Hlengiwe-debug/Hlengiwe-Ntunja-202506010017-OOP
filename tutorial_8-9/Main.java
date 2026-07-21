import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Create an ArrayList to store the tasks
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- TO-DO LIST APPLICATION ---");

        // 2. Load previous tasks automatically (Activity 2.2)
        System.out.print("\nLoading previous tasks... ");
        loadTasksFromFile(tasks);
        System.out.println("Done!");

        // If there were tasks loaded, display them (Activity 2.3)
        if (!tasks.isEmpty()) {
            System.out.println("Tasks loaded from file:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(" - " + tasks.get(i));
            }
        } else {
            System.out.println("No previous tasks found.");
        }

        // 3. Allow the user to enter THREE to-do list items (Activity 1)
        System.out.println("\nPlease enter THREE (3) new tasks:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Task " + i + ": ");
            String newTask = scanner.nextLine();
            tasks.add(newTask);
        }

        // 4. Display all tasks in the terminal (Activity 1)
        System.out.println("\n--- CURRENT TO-DO LIST ---");
        if (tasks.isEmpty()) {
            System.out.println("Your list is empty.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }

        // 5. Save all tasks into task.txt (Activity 2.1)
        System.out.print("\nSaving tasks to file... ");
        saveTasksToFile(tasks);
        System.out.println("Done! All tasks saved to 'task.txt'.");
        
        scanner.close();
    }

    // Method to save tasks to a text file
    private static void saveTasksToFile(ArrayList<String> tasks) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("task.txt"))) {
            for (String task : tasks) {
                writer.println(task);
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    // Method to read the contents of task.txt
    private static void loadTasksFromFile(ArrayList<String> tasks) {
        File file = new File("task.txt");
        if (!file.exists()) {
            return; // If file doesn't exist yet, just return without error
        }
        
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String task = fileScanner.nextLine();
                tasks.add(task);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}