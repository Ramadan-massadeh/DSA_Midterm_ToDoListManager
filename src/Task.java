public class Task {
    String description;
    boolean done;
    Task next;

    public Task(String description) {
        this.description = description;
        this.done = false;
        this.next = null;
    }

    public void markDone() {
        done = true;
    }

    public String toString() {
        return description + (done ? " (done)" : " (not done)");
    }
}