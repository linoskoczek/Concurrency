package BackEnd;

public class Task {
    String taskName;
    TaskStatus status;
    int result = -1;

    public Task(String taskName) {
        this.taskName = taskName;
        status = TaskStatus.PENDING;
    }
}
