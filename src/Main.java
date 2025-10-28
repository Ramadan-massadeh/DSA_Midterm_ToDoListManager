import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskList list = new TaskList();

        while (true) {
            System.out.println("\nTo-Do List");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Mark Task Done");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Task: ");
                String t = input.nextLine();
                list.addTask(t);
                System.out.println("Added.");
            } else if (choice == 2) {
                list.showAll();
            } else if (choice == 3) {
                System.out.print("Enter task number: ");
                int n = input.nextInt();
                list.markDone(n);
            } else if (choice == 4) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}