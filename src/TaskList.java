public class TaskList {
    private Task head;

    // add a new task
    public void addTask(String text) {
        Task newTask = new Task(text);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    // mark task done by index
    public void markDone(int index) {
        Task current = head;
        int i = 1;
        while (current != null) {
            if (i == index) {
                current.markDone();
                return;
            }
            current = current.next;
            i++;
        }
        System.out.println("Task not found.");
    }

    // show all tasks
    public void showAll() {
        Task current = head;
        int i = 0;
        if (current == null) {
            System.out.println("No tasks yet.");
        } else {
            while (current != null) {
                System.out.println(i + ". " + current);
                current = current.next;
                i++;
            }
        }
    }
}