package BackEnd;

import java.util.ArrayList;

public class TaskList extends ArrayList<Task> {
    private TaskList queue = null;

    private TaskList() {}

    public TaskList getInstance() {
        if(queue == null)
            return queue = new TaskList();
        return queue;
    }
}
