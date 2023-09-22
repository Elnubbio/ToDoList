import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> taskList;

    public TaskList() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTaskAtIndex(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
        } else {
            System.out.println("No task exists at that index");
        }
    }

    public void displayTasks() {
        String thisTaskTitle;
        String thisTaskDescription;
        String thisTaskStatus;
        if (taskList.size() > 0) {
            for (int i = 0; i < taskList.size(); i++) {
                thisTaskTitle = taskList.get(i).getTitle();
                thisTaskDescription = taskList.get(i).getDescription();
                thisTaskStatus = taskList.get(i).getStatus();
                // System.out.println("Task " + (i) + ": " + taskList.get(i).getTitle());
                System.out.printf("Task %s: %s. Description: %s. Status: %s\n", i, thisTaskTitle, thisTaskDescription,
                        thisTaskStatus);
            }
        } else {
            System.out.println("No tasks to display");
        }

    }
}
