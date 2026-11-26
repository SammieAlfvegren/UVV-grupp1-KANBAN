package se.uvvgrupp1.kanban;

/**
 * Represents a task stored on the Kanban board.
 */
public class Task {

    // Id ska skapas av TaskManager.
    // Id får inte ändras efter att uppgiften skapats.
    private final int id;

    private String title;

    private Status status;

    /**
     * Creates a new task.
     *
     * @param id unique task id
     * @param title task title
     * @param status current task status
     * @throws IllegalArgumentException if any value is invalid
     */
    public Task(int id, String title, Status status) {

        if (id <= 0) {
            throw new IllegalArgumentException("Id must be greater than 0.");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }

        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null.");
        }

        this.id = id;
        this.title = title.trim();
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setTitle(String title) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }

        this.title = title.trim();
    }

    public void setStatus(Status status) {

        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null.");
        }

        this.status = status;
    }

    /**
     * Converts the task to the format used in tasks.txt.
     */
    @Override
    public String toString() {

        // VIKTIGT:
        // TaskFileManager kommer läsa och skriva exakt detta format.
        // Om ni ändrar separatorn eller ordningen måste filhanteringen också ändras.
        //
        // Format:
        // id;title;status
        //
        // Exempel:
        // 1;Skriva README;TODO

        return id + ";" + title + ";" + status;
    }
}
