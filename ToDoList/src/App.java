public class App {
    public static void main(String[] args) throws Exception {
        Task exampleTask1 = new Task("Eat apple", "Eat an apple", "Pending");
        Task exampleTask2 = new Task("Eat banana", "Eat a banana", "Complete");

        TaskList myTaskList = new TaskList();
        myTaskList.addTask(exampleTask1);
        myTaskList.addTask(exampleTask2);
        UI.showMainPage();
        // myTaskList.displayTasks();
        // String pageState = "mainPage";
        while (true) {
            String userChoice = System.console().readLine(">");
            if (Utilities.isInt(userChoice)) {
                int userChoiceInt = Integer.parseInt(userChoice);
                switch (userChoiceInt) {
                    case 1:
                        System.out.println("Input task name: ");
                        String userTaskNameInput = System.console().readLine(">");
                        System.out.println("Input task description: ");
                        String userTaskDescriptionInput = System.console().readLine(">");
                        System.out.println("Input task status: ");
                        String userTaskStatusInput = System.console().readLine(">");
                        myTaskList.addTask(new Task(userTaskNameInput, userTaskDescriptionInput, userTaskStatusInput));
                        myTaskList.displayTasks();
                        UI.showMainPage();
                        break;
                    case 2:
                        myTaskList.displayTasks();
                        System.out.println("Choose a task index to remove");
                }
            }
        }

    }
}
